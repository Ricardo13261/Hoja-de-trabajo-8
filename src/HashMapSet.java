/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 */
import java.util.HashMap;

public class HashMapSet implements WordSet{
    
private HashMap<String, String> base;
    
    public HashMapSet(){
       base = new HashMap();
    }
    
     @Override
    public void add(Word wordObject) {
        base.put(wordObject.getWord(),wordObject.getType() );
         }

    @Override
    public Word get(Word word) {
        if (!(base.containsKey(word.getWord())))
            return null;
        return new Word(word.getWord(),base.get(word.getWord()));
         }    
}
