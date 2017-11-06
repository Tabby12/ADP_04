package AB4;

public class PascalDreieckRekursiv extends PascalDreieck{

	@Override
	int[] berechneZeile(int n) {
		neuesteZeile = _zeile(n);
		return neuesteZeile;
	}
	
	private int[] _zeile(int n) {
		assert n >= 0;
		if(n == 0) {
			return new int[] {1};
		}
		int[] drueber = _zeile(n - 1);
		int[] ergebnis = new int[n + 1];
		ergebnis[0] = ergebnis[n] = 1;
		for (int col=1; col < n; col++) {
			ergebnis[col] = drueber[col - 1] + drueber[col];
			counter++;
		}
		return ergebnis;
	}

	@Override
	void printNeuesteZeile() {
		int len = neuesteZeile.length;
		System.out.print("[ ");
		for(int i = 0; i < len-1; i++){
			System.out.print(neuesteZeile[i] + " ");
		}
		System.out.println(neuesteZeile[len-1] + " ]");
	}
}
