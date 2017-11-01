
import java.util.ArrayList;

public class Sectiune extends AbstractElement {
	private String titlu;
	private ArrayList<Element> continutSectiune = new ArrayList<>();
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public ArrayList<Element> getContinutSectiune() {
		return continutSectiune;
	}
	public void setContinutSectiune(ArrayList<Element> continutSectiune) {
		this.continutSectiune = continutSectiune;
	}

}
