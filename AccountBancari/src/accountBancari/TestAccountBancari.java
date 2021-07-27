package accountBancari;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class TestAccountBancari {
	
	
	public static void main(String[] args) {
		
		double bilancio=0.0;
		//Date oggi = new Date();
		Date oggi = new Date();
		//System.out.println(oggi);
		
		Date yesterday= new Date();		
		Calendar c = Calendar.getInstance(); 
		c.setTime(yesterday); 
		c.add(Calendar.DATE, -1);
		yesterday = c.getTime();
		//System.out.println(yesterday);
		
		Date tomorrow= new Date();		
		Calendar c1 = Calendar.getInstance(); 
		c1.setTime(tomorrow); 
		c1.add(Calendar.DATE, 1);
		tomorrow = c1.getTime();
		//System.out.println(tomorrow);
			
		
		List<Transazione> listTransazioni= new ArrayList<>();
		
		listTransazioni.add(new Transazione(oggi, "prima transazione", 153.56));
		listTransazioni.add(new Transazione(yesterday, "seconda transazione", 100.56));
		listTransazioni.add(new Transazione(tomorrow, "terza transazione", 90.56));
		
		
		AccountBancario account = new AccountBancario("Denise", listTransazioni);
		
		 bilancio = account.bilancio(listTransazioni);
		
		account.deposito(new Transazione(yesterday, "quarta transazione", 5.56));
		
		
		account.ritiro(listTransazioni, oggi);
		
		 bilancio = account.bilancio(listTransazioni);
				

	}

}
