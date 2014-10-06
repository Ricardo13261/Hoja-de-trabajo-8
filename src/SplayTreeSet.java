/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 */
public class SplayTreeSet implements WordSet{
        
    private SplayTree base; // SplayTree
        
    /**
     * post: se instancia el splay tree
     */
    public SplayTreeSet(){
        base = new SplayTree();
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
  