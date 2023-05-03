package g2esercizi;

public class Articolo {
	String codArticolo;
	String deskArticolo;
	double prezzo;
	int pezziDisp;
	
	public Articolo(String codiceArticolo,String descrizioneArticolo,double prezzo ,int pezziDisponibili) {
		this.codArticolo= codiceArticolo;
		this.deskArticolo=descrizioneArticolo;
		this.prezzo=prezzo;
		this.pezziDisp=pezziDisponibili;
	}
}
