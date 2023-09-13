import javax.swing.JOptionPane;


public class Oblig1 {
	
	public static void main(String[] args){
		String inntekt = JOptionPane.showInputDialog("Oppgi inntekt");
		int sum=Integer.parseInt(inntekt);
		JOptionPane.showMessageDialog(null,beregnskatt(sum));
	}
	
	static double beregnskatt(int sum) {
		double prosent=0;
		if (sum<=164100) {
			prosent=0;
		}
		else if(sum<=230950) {
			prosent=0.93;
		}
		else if(sum<=580650) {
			prosent=2.41;
		}
		else if(sum<=934050) {
			prosent=11.52;
		}
		else {
			prosent=14.52;
		}
		return sum*prosent/100;
	}
	
}
