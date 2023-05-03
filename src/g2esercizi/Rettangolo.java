package g2esercizi;

public class Rettangolo {
	double altezza;
	double base;

	public Rettangolo(double height ,double width) {
		this.altezza=height;
		this.base= width;
	}

	private double area (){
		return this.base * this.altezza;
	}
	private double perimetro (){
		return (this.base + this.altezza)*2;
	}

	static void stampaRettangolo(Object obj ) {
		Rettangolo r = (Rettangolo)obj;
		System.out.println("L'area del rettangolo é: "+ r.area()+", "+ "il perimetro del rettangolo è: "+r.perimetro()+";");
	}

	static void stampaDueRettangoli(Object obj1, Object obj2) {
		Rettangolo r1 = (Rettangolo)obj1;
		Rettangolo r2 = (Rettangolo)obj2;
	
		double aree = r1.area()+ r2.area();
		double perimetri = r1.perimetro()+ r2.perimetro();
		System.out.println("L'area del primo rettangolo é: "+ r1.area()+", "+ "il perimetro del primo rettangolo è: "+r1.perimetro()+";");
		System.out.println("L'area del secondo rettangolo é: "+ r2.area()+", "+ "il perimetro del secondo rettangolo è: "+r2.perimetro()+";");
		System.out.println("La somma delle aree dei rettangoli é: "+ aree +", "+ "la somma dei perimetri dei rettangoli è: "+ perimetri +";");
	}
	
}
