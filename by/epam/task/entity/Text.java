package by.epam.task.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
	
	private List<TextElement> sentences;

	public Text(List<TextElement> sentences) {
		super();
		this.sentences=new ArrayList<>();
	}

	public List<TextElement> getSentences() {
		return sentences;
	}

	public void setSentences(List<TextElement> sentences) {
		this.sentences = sentences;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (sentences == null) {
			if (other.sentences != null)
				return false;
		} else if (!sentences.equals(other.sentences))
			return false;
		return true;
	}

}
