import javax.swing.JOptionPane;

public class Oblig2BFor {
	public static void main(String[] args) {
		int godkjentePoengsummer = 0;
		for (int i = 0; godkjentePoengsummer < 2; i++) {
			
			String poengtext = JOptionPane.showInputDialog("Oppgi poengsum");
			int poeng=Integer.parseInt(poengtext);
			var karakter = beregnkarakter(poeng);
			if (karakter != "Ugyldig poengsum") {
				godkjentePoengsummer++;
			}
			JOptionPane.showMessageDialog(null,karakter);
		}
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
