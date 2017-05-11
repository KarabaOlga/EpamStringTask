package by.epam.task.logic;

import by.epam.task.entity.Sentence;
import by.epam.task.entity.Word;

public class Creator {

	private String name;

	public Creator (String name){
		this.setName(name);
	}
	
	public Sentence createSentence(int sizeSentence){
		Sentence sentence=new Sentence(sizeSentence);
		return sentence;
	}
	public void supplementWord(Word word, Sentence sentence){
		sentence.addWord(word);
	}
	
	public void printSentence(Sentence sentence){
		if(sentence!=null){
		Word[] list=sentence.getWords();
		for (int i=0; i<list.length; i++){
			if(list[i]!=null){
			System.out.print(list[i]);
			}
		  }
		}
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
