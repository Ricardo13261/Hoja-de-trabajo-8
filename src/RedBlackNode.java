/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Profesor: Douglas Barrientos
 *Autores:
 *    Ricardo Franco, 13261
 *    Aejandro Díaz, 13082
 *    Henry
 *    Esta clase crea un nodo para la implementación redBlackTree
 *    Bibliografia: http://users.cis.fiu.edu/~weiss/dsaajava/code/DataStructures/RedBlackNode.java
 */ 
public class RedBlackNode
    {
            // Constructors
        RedBlackNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        RedBlackNode( Comparable theElement, RedBlackNode lt, RedBlackNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
            //color    = RedBlackTree.BLACK;
        }

            // Friendly data; accessible by other package routines
        Comparable   element;    // The data in the node
        RedBlackNode left;       // Left child
        RedBlackNode right;      // Right child
        int          color;      // Color
    }
