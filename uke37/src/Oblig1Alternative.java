
public class Oblig1Alternative {
	
	public static void main(String[] args) {
		
		var tabell = new Trinn[] {
			new Trinn(0, 0),
			new Trinn(164100, 0.93),
			new Trinn(230950, 2.41),
			new Trinn(580650, 11.52),
			new Trinn(934050, 14.52)
		};
		
		for (int test = 0; test < 1200000; test += 50000) {
			
			var trinn = finnTrinn(test, tabell);
			
			System.out.println("Skatten for " + test 
					+ " blir " + test*trinn.Prosent/100
					+ " prosenten er " + trinn.Prosent
				);			
		}
		
	}
	
	static Trinn finnTrinn(int sum, Trinn[] tabell) {
		for (int i = tabell.length - 1; i >= 0; i--) {
			var t = tabell[i];
			if (sum >= t.NedreGrense) return t;
		}
		return null;
	}
	
	

}

class Trinn {
	public int NedreGrense;
	public double Prosent;
	public Trinn(int nedreGrense, double prosent) {
		this.NedreGrense = nedreGrense;
		this.Prosent = prosent;
	}
}
