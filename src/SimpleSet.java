/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Profesor: Douglas Barrientos
 * hoja de trabajo 7
 *Autores:
 *    Ricardo Franco, 13261
 *    Aejandro Díaz, 13082
 *    Jenry
 * Descripción: SimpleSet ejemplo con ArrayList.
*/
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}
