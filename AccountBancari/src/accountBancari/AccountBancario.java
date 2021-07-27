package accountBancari;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountBancario {
	
	private String proprietario;
	private List<Transazione> listTransazioni;
	
	
	public AccountBancario()
	{
		
	}
	
	
	public AccountBancario(String proprietario, List<Transazione> listTransazioni)
	{
		this.proprietario = proprietario;
	    this.listTransazioni =  new ArrayList<Transazione>(); 
	}
	
	
	
	public double bilancio (List<Transazione> listTransazioni) 	
	{
		double sumTransazioni=0.0;
		
		for(int i=0;i<listTransazioni.size();i++)
		 {
			sumTransazioni= sumTransazioni+listTransazioni.get(i).getImportoTransazione();
		 }
		System.out.println("Bilancio dell' account is:" +sumTransazioni);
		
		return sumTransazioni;
	}
	
	
	
	 public void ritiro(List<Transazione> listTransazioni , Date dataEmissione) 
	 {
	    for(int i=0;i<listTransazioni.size();i++) 
	    {
	    	if(dataEmissione.equals(listTransazioni.get(i).getDataEmissione()))
	    		listTransazioni.remove(i);
	    }
	     		  
	 }
	 
	 
	 
	 public void deposito(Transazione t) 
	 {
		 listTransazioni.add(t);
		 		 
	 }

}
