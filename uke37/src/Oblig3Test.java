
public class Oblig3Test {
	public static void main(String[] args) {
		System.out.println(fakultet(10));
	}
	static int fakultet(int n) {
		if (n<=0) {
			return 0;
		}
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		return sum;
	}
}
