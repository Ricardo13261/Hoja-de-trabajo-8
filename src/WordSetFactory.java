/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Profesor: Douglas Barrientos
 *Autores:
 *    Ricardo Franco, 13261
 *    Aejandro Díaz, 13082
 *    Jenry
 Enviado por el catedratico, basado en el código de Eduardo Castellanos

Descripci�n: WordSetFactory. Clase  utilizada para instanciar los diferentes tipos de sets. 
*/

import java.util.HashMap;
import java.util.TreeMap;
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
	    if (tipo == 1)
		    return new SimpleSet();
	else
            {
                if (tipo == 2 )
                {
                    return new RedBlackTreeSet();
                }
                if (tipo == 3)
                {
                    return new SplayTreeSet(); 
                }
                if (tipo == 4)
                {
                    return  new HashMapSet ();
                }
                
                if (tipo ==5)
                {
                    return  new TreeMapSet();
                }
                        
            }		
            return null;		
	}
}
	
	
