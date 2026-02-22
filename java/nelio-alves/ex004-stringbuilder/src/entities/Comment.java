package entities;

public class Comment {
	private String text;
	
	// Construtor
	public Comment() {
	}
	
	public Comment(String text) {
		this.text = text;
	}
	
	// getters e settters
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	@Override
	public String toString() {
		return text;
	}
}