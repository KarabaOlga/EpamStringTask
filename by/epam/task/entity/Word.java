package by.epam.task.entity;

public class Word extends TextElement{

   private String word;
	
   public Word(int count) {
		super(count);
	}

   public Word(int count, String word) {
	    super(count);
	    this.word = word;
    }

   public String getWord () {
   return word;
   }
   
   public void setWord (String word) {
   this.word = word;
   }

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((word == null) ? 0 : word.hashCode());
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
	Word other = (Word) obj;
	if (word == null) {
		if (other.word != null)
			return false;
	} else if (!word.equals(other.word))
		return false;
	return true;
}

@Override
public String toString() {
	return word;
}

}

