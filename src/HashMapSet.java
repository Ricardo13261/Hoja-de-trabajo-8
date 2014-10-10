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
private boolean resultado;
private String key,value;
    
    public HashMapSet(){
       base = new HashMap();
    }
    
     @Override
    public void add(Word wordObject) 
        {
            key=wordObject.getWord();
            value=wordObject.getType();
            base.put(key,value);
        }

    @Override
    public Word get(Word word)
    {
        resultado=base.containsKey(word.getWord());
        if (resultado==false)
        {
            return null;
        }
        else
        {
            return new Word(word.getWord(),base.get(word.getWord()));
        }
         
    }    
}
