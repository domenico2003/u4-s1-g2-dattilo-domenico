package g2esercizi;

public class Cliente {
	String codCliente;
	String nome;
	String cognome;
	String email;
	String dataIscrizione;
	
	public Cliente(String codiceCliente,String nom,String cogn ,String mail, String iscrizione) {
		this.codCliente= codiceCliente;
		this.nome=nom;
		this.cognome=cogn;
		this.email= mail;
		this.dataIscrizione= iscrizione;
	};
}
