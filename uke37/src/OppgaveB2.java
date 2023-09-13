
import javax.swing.JOptionPane;

public class OppgaveB2 {
	public static void main(String[] args) {
		
		String lavestetext = JOptionPane.showInputDialog("Oppgi laveste grense");
		int laveste=Integer.parseInt(lavestetext);
		System.out.println("Nedre grense " + laveste);
		
		String hoyestetext = JOptionPane.showInputDialog("Oppgi høyeste grense");
		int hoyeste=Integer.parseInt(hoyestetext);
		System.out.println("Øvre grense " + hoyeste);
		
		String oddetall = "";
		for (int i=laveste;i<=hoyeste;i++) {
			if (i%2==1) {
				if (oddetall!="") {
					oddetall+=", ";
				}
				oddetall+=i;
			}
		}
		System.out.println("Resultat " + oddetall);
		String melding="Nedre grense " + laveste
				+ "\nØvre Grense " + hoyeste
				+ "\nResultat " + oddetall;
		JOptionPane.showMessageDialog(null,melding);
	}
}
