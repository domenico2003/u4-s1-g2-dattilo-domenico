package g2esercizi;

public class Esercizio1 {

	public static void main(String[] args) {
		Rettangolo primoRettangolo = new Rettangolo(2,6);
		Rettangolo secondoRettangolo = new Rettangolo(4,8);
		
		Rettangolo.stampaRettangolo(primoRettangolo);
		Rettangolo.stampaRettangolo(secondoRettangolo);
		
		Rettangolo.stampaDueRettangoli(primoRettangolo, secondoRettangolo);
	}

}
