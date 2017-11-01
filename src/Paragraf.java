
public class Paragraf extends AbstractElement {
	String text;
	Paragraf() { }
	Paragraf(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
