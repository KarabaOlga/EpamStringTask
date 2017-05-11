package by.epam.task;

import static by.epam.task.util.Constant.NUM;
import static by.epam.task.util.Constant.REF;
import static by.epam.task.util.Constant.SUB;
import static by.epam.task.util.Constant.TEXT;
import static by.epam.task.util.Constant.WORD;

import by.epam.task.entity.Sentence;
import by.epam.task.entity.Word;
import by.epam.task.logic.Creator;
/*
 *
 После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.

ТРЕБОВАНИЯ.

1. При выполнении задания создать и обязательно использовать классы Word и Sentence.

2. Приложение должно быть написано на любом из языков: С++, С# или Java.

3. При кодировании должны быть использованы соглашения об оформлении кода для соответствующего языка – code convention.

4. По возможности использовать принципы ООП: наследование, полиморфизм, инкапсуляция.

5. Не использовать графический интерфейс! Приложение должно быть консольным. но консольное меню должно быть минимальным

6. На собеседование приносить на флеш-носителе исходный код и откомпилированное приложение. 
 */
public class Main{

	public static void main(String[] args) {
		
		Creator creator = new Creator ("Olya");       // create creator by name Olya
		Sentence sentence=creator.createSentence(15); // number of words in the sentence
		 
		Word word1 = new Word(4,"Java");         
		Word word2 = new Word(11," programming");
		Word word3 = new Word(10," language’s");
		Word word4 = new Word(4," rich");
		Word word5 = new Word(3," API");
		Word word6 = new Word(3," can");
		Word word7 = new Word(2," be");
		Word word8 = new Word(6," listed");
		Word word9 = new Word(5," among");
		Word word10 = new Word(3," the");
		Word word11 = new Word(4," main");
		Word word12 = new Word(6," reasons");
		Word word13 = new Word(6," behind");
		Word word14 = new Word(3," its");
		Word word15 = new Word(7," success.");

	 creator.supplementWord(word1,sentence);   // add words to the sentence
	 creator.supplementWord(word2,sentence); 
	 creator.supplementWord(word3,sentence); 
	 creator.supplementWord(word4,sentence); 
	 creator.supplementWord(word5,sentence); 
	 creator.supplementWord(word6,sentence); 
	 creator.supplementWord(word7,sentence); 
	 creator.supplementWord(word8,sentence); 
	 creator.supplementWord(word9,sentence); 
	 creator.supplementWord(word10,sentence); 
	 creator.supplementWord(word11,sentence); 
	 creator.supplementWord(word12,sentence); 
	 creator.supplementWord(word13,sentence); 
	 creator.supplementWord(word14,sentence); 
	 creator.supplementWord(word15,sentence); 
	
	 
	 System.out.println(" Sentence ");
	 System.out.println("");
	 creator.printSentence(sentence);          //print text
	 System.out.println("");
	 
	 
		String words[] =TEXT.trim().split(REF);// remove spaces around the edges, divide by words
	
		changeText(words);                     //change the text, add the new word
		printNewText(words);                   // print new text 
	}
	
	public static void printNewText(String[] a){ 
		for (String arg : a) {
			if (!arg.isEmpty()) {
				System.out.print(arg + " ");
		  }
	   }
	}
	public static void changeText(String[] a){
		for(int i=0; i<a.length-1; i++){	
			if ((a[i].substring(NUM)).equals(SUB)){
			a[i]=a[i].concat(WORD); 
		    }
		 }
	}
}
			
