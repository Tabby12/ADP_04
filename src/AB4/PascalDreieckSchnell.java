package AB4;

public class PascalDreieckSchnell extends PascalDreieck{

	@Override
	int[] berechneZeile(int n) {
		int breite = n+1;
		neuesteZeile = new int[breite];
		
		// linke Haelfte der Zeile berechnen bis einschl Mitte im Falle ungerade Breite
		for(int i = 0; i <= n/2; i++){
			neuesteZeile[i] = binKoeff(n,i);
		}

		// rechte Haelfte der Zeile von einschl Mitte im Falle ungerade Breite kopieren
		for(int from = (breite-1)/2, to = (breite)/2; to < breite; to++, from--){
			neuesteZeile[to] = neuesteZeile[from];
		}

		return neuesteZeile;
	}
	
	private int binKoeff(int n, int k){
		if(k == 0) return 1;
		if(k > n/2) return binKoeff(n, n-k);
		int res = n;
		for(int i = 2; i <=k; i++){
			res *= n+1-i;
			res /= i;
			counter++;
		}
		return res;
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
