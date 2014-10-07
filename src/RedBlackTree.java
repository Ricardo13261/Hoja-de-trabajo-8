/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Profesor: Douglas Barrientos
 *Autores:
 *    Ricardo Franco, 13261
 *    Aejandro Díaz, 13082
 *    Jenry
 * Una de las implementaciones solicitadas por el temario
 */ 

public class RedBlackTree   {   

    private RedBlackNode header;
    private static RedBlackNode nullNode;    
    static final int BLACK = 1;    // Black must be 1
    static final int RED   = 0;
    // Used in insert routine and its helpers
    private static RedBlackNode current;
    private static RedBlackNode parent;
    private static RedBlackNode grand;
    private static RedBlackNode great;
    /**
     * post: constructor que crea un nuevo arbol vacio
     * @param negInf a value less than or equal to all others.
     */
    public RedBlackTree( Comparable negInf )
    {
        header = new RedBlackNode( negInf );
        header.left = header.right = nullNode;
        nullNode = new RedBlackNode( null );
        nullNode.left = nullNode.right = nullNode;
    }

    /**
     * pre: el arbol ya se creo
     * post: inserta un elemento en el arbol
     * @param item the item to insert.
     */
    public void insert( Comparable item )
    {
        current = parent = grand = header;
        nullNode.element = item;

        
            // Insertion fails if already present
        if( current != nullNode )
            return;
        current = new RedBlackNode( item, nullNode, nullNode );

            // Attach to parent
        if( item.compareTo( parent.element ) < 0 )
            parent.left = current;
        else
            parent.right = current;
        handleReorient( item );
    }

    /**
     * post: busca el elemento en el arbol
     * @param x the item to search for.
     * @return the matching item or null if not found.
     */
    public Comparable find( Comparable x )
    {
        nullNode.element = x;
        current = header.right;

        for( ; ; )
        {
            if( x.compareTo( current.element ) < 0 )
                current = current.left;
            if( x.compareTo( current.element ) > 0 ) 
                current = current.right;
            if( current != nullNode )
                return current.element;
            else
                return null;
        }
    }
    /**
     * post: comprueba si el arbol esta vacio
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( )
    {
        return header.right == nullNode;
    }
    /**
     * post: cambia las rotaciones durante la insercion
     * if a node has two red children. Performs flip and rotations.
     * @param item the item being inserted.
     */
    private void handleReorient( Comparable item )
    {
            // Do the color flip
        current.color = RED;
        current.left.color = BLACK;
        current.right.color = BLACK;

        if( parent.color == RED )   // Have to rotate
        {
            grand.color = RED;
            if( ( item.compareTo( grand.element ) < 0 ) !=
                ( item.compareTo( parent.element ) < 0 ) )
                parent = rotate( item, grand );  // Start dbl rotate
            current = rotate( item, great );
            current.color = BLACK;
        }
        header.right.color = BLACK; // Make root black
    }

    /**
     * post: rota nodos en el arbol
     * @param item the item in handleReorient.
     * @param parent the parent of the root of the rotated subtree.
     * @return the root of the rotated subtree.
     */
    private RedBlackNode rotate( Comparable item, RedBlackNode parent )
    {
        if( item.compareTo( parent.element ) < 0 )
            return parent.left = item.compareTo( parent.left.element ) < 0 ?
                rotateWithLeftChild( parent.left )  :  // LL
                rotateWithRightChild( parent.left ) ;  // LR
        else
            return parent.right = item.compareTo( parent.right.element ) < 0 ?
                rotateWithLeftChild( parent.right ) :  // RL
                rotateWithRightChild( parent.right );  // RR
    }

    /**
     * post: rota el nodo izquierdo
     */
    static RedBlackNode rotateWithLeftChild( RedBlackNode k2 )
    {
        RedBlackNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }

    /**
     * post: rota el nodo derecho
     */
    static RedBlackNode rotateWithRightChild( RedBlackNode k1 )
    {
        RedBlackNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        return k2;
    }
            
}
