/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Profesor: Douglas Barrientos
 *Autores:
 *    Ricardo Franco, 13261
 *    Aejandro Díaz, 13082
 *    Jenry
 * Esta clase permite realizar la implementación de la clase RedBlackTree y crear un palabra, insertar y buscar
 */ 

public class RedBlackTreeSet implements WordSet {
     private RedBlackTree base; 
     private Word palabra;
        
    /**
     * post: se instancia el splay tree
     */
    public RedBlackTreeSet(){
        base = new RedBlackTree(palabra);
    }

    /**
     * post: obtiene la palabra que busco en la estructura
     * @param word
     * @return 
     */
    @Override
    public Word get(Word word){
        Word temp = (Word)base.find(word);
        return temp;
    }
    /**
     * post: añade una nueva palabra a la estructura
     * @param wordObject 
     */
    @Override
    public void add(Word wordObject){
        base.insert(wordObject);
    }

}
