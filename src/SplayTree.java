/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 * Codigo extraido de: http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/SplayTree.java
 */
public class SplayTree    {
    
    // se declaran los nodos con que trabaja este arbol de busqueda
    private BinaryNode root;
    private static BinaryNode nullNode;         
    private static BinaryNode newNode = null;
    private static BinaryNode header = new BinaryNode( null );

    /**
     * post: el constructor instancia los nodos y los coloca nulos
     */
    public SplayTree( ){
        nullNode = new BinaryNode( null );
        nullNode.left = nullNode.right = nullNode;
        root = nullNode;
    }

    /**
     * post: se inserta un elemento al arbol de busqueda
     * @param x 
     */
    public void insert( Comparable x )
    {
        if( newNode == null ) {
            newNode = new BinaryNode( null );
        }
        newNode.element = x;

        if( root == nullNode )
        {
            newNode.left = newNode.right = nullNode;
            root = newNode;
        }
        else
        {
            root = splay( x, root );
            if( x.compareTo( root.element ) < 0 )
            {
                newNode.left = root.left;
                newNode.right = root;
                root.left = nullNode;
                root = newNode;
            }
            else
            if( x.compareTo( root.element ) > 0 )
            {
                newNode.right = root.right;
                newNode.left = root;
                root.right = nullNode;
                root = newNode;
            }
            else {
                return;
            }
        }
        newNode = null;   // So next insert will call new
    }


    /**
     * pre: el arbol no esta vacio
     * post: retorna un elemento correspodiente a la busqueda realizada
     * @param x
     * @return 
     */
    public Comparable find( Comparable x )
    {
        root = splay( x, root );

        if( isEmpty( ) || root.element.compareTo( x ) != 0 ) {
            return null;
        }

        return root.element;
    }

    /**
     * post: retorna un valor booleano dependiendo si el arbol esta vacio o no
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( )
    {
        return root == nullNode;
    }


    /**
     * post: se realiza el movimiento hacia arriba
     * @param x the target item to splay around.
     * @param t the root of the subtree to splay.
     * @return the subtree after the splay.
     */
    private BinaryNode splay( Comparable x, BinaryNode t )
    {
        BinaryNode leftTreeMax, rightTreeMin;

        header.left = header.right = nullNode;
        leftTreeMax = rightTreeMin = header;

        nullNode.element = x;   // Guarantee a match

        for( ; ; ) {
            if( x.compareTo( t.element ) < 0 )
            {
                if( x.compareTo( t.left.element ) < 0 ) {
                    t = rotateWithLeftChild( t );
                }
                if( t.left == nullNode ) {
                    break;
                }
                // Link Right
                rightTreeMin.left = t;
                rightTreeMin = t;
                t = t.left;
            }
            else if( x.compareTo( t.element ) > 0 )
            {
                if( x.compareTo( t.right.element ) > 0 ) {
                    t = rotateWithRightChild( t );
                }
                if( t.right == nullNode ) {
                    break;
                }
                // Link Left
                leftTreeMax.right = t;
                leftTreeMax = t;
                t = t.right;
            }
            else {
                break;
            }
        }

        leftTreeMax.right = t.left;
        rightTreeMin.left = t.right;
        t.left = header.right;
        t.right = header.left;
        return t;
    }

    /**
     * post: se realiza una rotacion con el nodo izquierdo
     */
    static BinaryNode rotateWithLeftChild( BinaryNode k2 )
    {
        BinaryNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }

    /**
     * post: se realiza una rotacion de la raiz con el nodo derecho
     */
    static BinaryNode rotateWithRightChild( BinaryNode k1 )
    {
        BinaryNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        return k2;
    }
}