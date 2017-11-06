package AB4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PascalDreieckTest {
	PascalDreieck pd;

	@Before
	public void setUp() {
		pd = new PascalDreieckSchnell();
	}

	@Test
	public void testDreieck() {
		int maxZeile = 10;
		int[][] kontrollWert = 
				{ { 1 }, { 1, 1 }, { 1, 2, 1 }, { 1, 3, 3, 1 }, { 1, 4, 6, 4, 1 }, { 1, 5, 10, 10, 5, 1 },
						{ 1, 6, 15, 20, 15, 6, 1 }, { 1, 7, 21, 35, 35, 21, 7, 1 }, { 1, 8, 28, 56, 70, 56, 28, 8, 1 },
						{ 1, 9, 36, 84, 126, 126, 84, 36, 9, 1 } };

		for (int zeile = 0; zeile < maxZeile; zeile++) {
			int[] istWert = pd.berechneZeile(zeile);
			pd.printNeuesteZeile();
			for(int i = 0; i < istWert.length; i++){
				assertEquals(kontrollWert[zeile][i], istWert[i]);
			}
		}
	}
}