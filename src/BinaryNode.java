/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 *  Codigo extraido de: http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/BinaryNode.java
 */
public class BinaryNode{
        Comparable element;      // dato del nodo
        BinaryNode left;         // nodo hijo izquierdo
        BinaryNode right;        // nodo hijo derecho
        
        /**
         * post: crea un nuevo nodo, asigna un dato y asigna a los hijos como elementos nulos
         * @param theElement 
         */
        BinaryNode( Comparable theElement )
        {
            this( theElement, null, null );
        }
        /**
         * post: crea un nuevo nodo y asigna un dato asi como un nodo hijo izquierdo y derecho
         * @param theElement
         * @param lt
         * @param rt 
         */
        BinaryNode( Comparable theElement, BinaryNode lt, BinaryNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
        }

}
