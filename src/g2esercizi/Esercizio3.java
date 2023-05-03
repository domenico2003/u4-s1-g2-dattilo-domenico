package g2esercizi;

public class Esercizio3 {

	public static void main(String[] args) {
		Articolo computer =new Articolo("123b32","bello",9.99,10);
		Cliente domenico=new Cliente("0123b","Domenico","Dattilo","mymail00@mail.com","20 may 2022");
		Object[] articoli = {computer};
		Carrello mioCarrello=new Carrello(domenico,articoli,9.99);
		
		System.out.println(domenico.cognome);
	}

//	@Override
//	public String toString () {
//		return this.costoTotale;
//	}
}
