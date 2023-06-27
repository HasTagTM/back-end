package giorno2;

public class Giorno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Esercizio rettangolo1 = new Esercizio(3 , 6);
		
		Esercizio rettangolo2 = new Esercizio(5,3);
		
		rettangolo1.stampaRettangolo();
		rettangolo2.stampaRettangolo();
		
		Giorno2 giorno2 = new Giorno2();
		Esercizio rettangolo3 = new Esercizio(8,9);
		Esercizio rettangolo4 = new Esercizio(3,6);
		rettangolo1.stampaDueRettangoli(rettangolo3, rettangolo4);
		
	}

}
