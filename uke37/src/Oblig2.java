import javax.swing.JOptionPane;

public class Oblig2 {
	public static void main(String[] args) {
		String poengtext = JOptionPane.showInputDialog("Oppgi poengsum");
		int poeng=Integer.parseInt(poengtext);
		JOptionPane.showMessageDialog(null,beregnkarakter(poeng));
	}
	
	static String beregnkarakter(int poeng) {
		String karakter= "";
		if (poeng<0 || poeng>100) {
			karakter = "Ugyldig poengsum";
		}
		else if (poeng<=39) {
			karakter="F";
		}
		else if(poeng<=49) {
			karakter="E";
		}
		else if(poeng<=59) {
			karakter="D";
		}
		else if(poeng<=79) {
			karakter="C";
		}
		else if(poeng<=89) {
			karakter="B";
		}
		else if(poeng<=100) {
			karakter="A";
		}
		return karakter;
	}
}
