package AB4;

public class PascalDreieckIterativ extends PascalDreieck{

	@Override
	int[] berechneZeile(int n) {
		neuesteZeile = _zeile(n);
		return neuesteZeile;
	}
	
	private int[] _zeile(int n) {
		assert n >= 0;
		int[] ergebnis = {1};
		for (int row = 1; row <= n; row++) {
			int[] zeile = new int[row + 1];
			zeile[0] = zeile[row] = 1;
			for (int col=1; col < row; col++) {
				zeile[col] = ergebnis[col - 1] + ergebnis[col];
				counter++;
			}
			ergebnis = zeile;
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
