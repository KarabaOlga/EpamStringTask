package by.epam.task.entity;

public abstract class TextElement {

	private int count;
    
	public TextElement(int count) {
		super();
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
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
		TextElement other = (TextElement) obj;
		if (count != other.count)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "count=" + count;
	}
}

