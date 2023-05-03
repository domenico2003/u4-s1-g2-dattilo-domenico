package g2esercizi;

import java.util.Arrays;

public class Sim {
 String numeroTelefono;
 double credito;
 Object[] ultimeChiamate=new Object[5];
		 
 public Sim (String numero) {
	 this.numeroTelefono=numero;
	 this.credito=0;
	}
 public void stampaSim () {
	 System.out.println("il tuo numero di telefono è: " + this.numeroTelefono + ", il tuo credito è: " + this.credito + ", le tue ultime chiamate sono: " + Arrays.toString(this.ultimeChiamate));
 }
}
