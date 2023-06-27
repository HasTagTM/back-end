package giorno2;

public class Esercizio {
	private int altezza;
	private int larghezza;
	
	public  Esercizio(int perimetro , int area) {
		this.altezza = perimetro;
		this.larghezza = area;
	
	}
	public int calcolaArea() {
		return altezza * larghezza;
	}
	public int calcolaPerimetro() {
		return 2*(altezza + larghezza);
	}
	
	public void stampaRettangolo() {
		int area = calcolaArea();
		int perimetro = calcolaPerimetro();
		System.out.println("area:" + area);
		System.out.println("perimetro:" + perimetro);
	}
	
	public void stampaDueRettangoli(Esercizio rett1 , Esercizio rett2) {
		System.out.println("primo rettangolo");
		rett1.stampaRettangolo();
		
		System.out.println("secondo rettangolo");
		rett2.stampaRettangolo();
		
		int sommaAree = rett1.calcolaArea() + rett2.calcolaArea();
		int sommaPerimetri = rett1.calcolaPerimetro() + rett2.calcolaPerimetro();
		
		System.out.println("somma aree:" + sommaAree);
		System.out.println("somma perimetro:" + sommaPerimetri);
	}
}
