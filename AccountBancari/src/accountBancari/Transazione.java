package accountBancari;

import java.util.Date;

public class Transazione {
	
	private Date dataEmissione;
	private String nota;
	private double importoTransazione;
	
	
	public Transazione(Date dataEmissione, String nota, Double importoTransazione) {
		this.dataEmissione = dataEmissione;
		this.nota = nota;
		this.importoTransazione = importoTransazione;
	}


	public Date getDataEmissione() {
		return dataEmissione;
	}



	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}



	public String getNota() {
		return nota;
	}


	public void setNota(String nota) {
		this.nota = nota;
	}


	public Double getImportoTransazione() {
		return importoTransazione;
	}


	public void setImportoTransazione(Double importoTransazione) {
		this.importoTransazione = importoTransazione;
	}

	

}
