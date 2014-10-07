/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Profesor: Douglas Barrientos
 *Autores:
 *    Ricardo Franco, 13261
 *    Aejandro Díaz, 13082
 *    Jenry
 Enviado por el catedratico, basado en el código de Eduardo Castellanos


Descripción: Word. Clase para almacenar las palabras junto con su tipo. 
*/
class Word implements Comparable<Word> {
	private String word;
	private String type;
	
	// Constructor, inicializa la palabra con su tipo
	public Word(String word, String type)
	{
		this.word=word;
		this.type=type;
	}
	
	public Word()
	{
		this.word= "";
		this.type="";
	}
	
	// Comparadores, solo importa comparar la palabra, no el tipo.
	public int compareTo(Word o)
	{
		return this.word.compareTo(o.getWord());
	}
	
	public boolean equals(Object obj)
	{
		return (obj instanceof Word && getWord().equals(((Word)obj).getWord()));
	}
	
	// Métodos de acceso..
	public void setWord(String word)
	{
		this.word=word;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getWord()
	{
		return word;
	}
	
	public String getType()
	{
		return type;
	}
	
}
