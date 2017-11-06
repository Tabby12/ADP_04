package AB4;

public class PascalDreieckRunner {
	static DataCollector dc = new DataCollector();

	public static void main(String[] args) {
		PascalDreieck pd = new PascalDreieckIterativ();
		run(pd);
		pd = new PascalDreieckRekursiv();
		run(pd);
		//pd = new PascalDreieckSchnell();
		//run(pd);
		
	}

	private static void run(PascalDreieck pd){
		String logName = pd.getClass().getName(); 
		dc.newLog(logName, "N","count");
		for(int zeile = 0; zeile < 100; zeile++){
			pd.counter = 0;
			pd.berechneZeile(zeile);
			dc.log(logName, zeile, pd.counter);
		}
		dc.print(logName);
	}
}
