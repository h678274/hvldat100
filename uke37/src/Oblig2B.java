import javax.swing.JOptionPane;

public class Oblig2B {
	public static void main(String[] args) {
		while(askUser()) {
			
		}
	}
	
	static boolean askUser() {
		
		String poengtext = JOptionPane.showInputDialog("Oppgi poengsum");
		if (poengtext==null) {
			return false;
		}
		int poeng=Integer.parseInt(poengtext);
		JOptionPane.showMessageDialog(null,beregnkarakter(poeng));
		return true;
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
