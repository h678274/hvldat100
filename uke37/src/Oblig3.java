import javax.swing.JOptionPane;

public class Oblig3 {
	public static void main(String[] args) {
//		String talltekst = JOptionPane.showInputDialog("Oppgi n");
//		int n=Integer.parseInt(talltekst);
		for (int n = 1; n<10; n++) {
			System.out.println("fakultet av " + n + " er " + beregnFakultet(n));
		}

	}
	static int beregnFakultet(int n) {
		if (n > 0) {
			int fakultet = 1;
			for (int i = 1; i<=n; i++) {
				fakultet = fakultet * i;
			}
			return fakultet;
		}
		return 0;
	}
}
