package esercizio1;

public class MainProject_1 {

	public static void main(String[] args) {
		
		Rettangolo ret1 = new Rettangolo(15,18);
		Rettangolo ret2 = new Rettangolo(12,15);
		stampaRettangolo(ret1);
		stampaRettangolo(ret2);
		stampaDueRettangoli(ret1, ret2);
	}
	

	public static void stampaRettangolo(Rettangolo r) {
		System.out.println("questa è l'area" + r.calcolaArea());
		System.out.println("questa è il perimetro" + r.calcolaPerimetro());

	}
	public static void stampaDueRettangoli(Rettangolo r , Rettangolo d) {
		System.out.println("questa è l'area" + r.calcolaArea());
		System.out.println("questa è il perimetro" + r.calcolaPerimetro());
		System.out.println("questa è l'area" + d.calcolaArea());
		System.out.println("questa è il perimetro" + d.calcolaPerimetro());
		System.out.println("somma aree: " + (r.calcolaArea() + d.calcolaArea()));
		System.out.println("somma perimetri: " + (r.calcolaPerimetro() + d.calcolaPerimetro()));


	}

	
	 

}
