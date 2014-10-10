/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 */
import java.util.TreeMap;
public class TreeMapSet implements WordSet{

    
    private TreeMap<String, String> base;
    private boolean resultado;
    private String key,value;
     public TreeMapSet()
     {
       base = new TreeMap();
           
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
        resultado = base.containsKey(word.getWord());
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
