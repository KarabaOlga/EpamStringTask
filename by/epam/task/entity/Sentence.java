package by.epam.task.entity;
import java.util.Arrays;

public class Sentence extends TextElement {

	private Word[] words;
	private int index;
	
	
	public  Sentence(int count){
		super(count);
		index=0;
		words = new Word[count];
    }
	
	public void addWord(Word word){
		if (index < words.length) {
			words[index]=word;
		  index++;
		  }
		else System.out.println("enough");
	   }

	
	   public Word[] getWords () {
	   return words;
	   }
	   
	   public void setWords (Word[] words) {
	   this.words =words;
	   }
	   
	   public void printSentence(){
			for (Word word: words){
					System.out.println(word);
					}
	   }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + index;
		result = prime * result + Arrays.hashCode(words);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (index != other.index)
			return false;
		if (!Arrays.equals(words, other.words))
			return false;
		return true;
	} 

}
