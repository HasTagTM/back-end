package esercizioG4;

public class GestioneDipendenti {

	public static void main(String[] args) {

		Dipendente dip1 = new Dipendente(11 , 1400 , 15 ,Livello.OPERAIO,  Dipartimento.PRODUZIONE); 
		Dipendente dip2 = new Dipendente(12 ,1400 , 25 , Livello.OPERAIO , Dipartimento.PRODUZIONE); 
		Dipendente dip3 = new Dipendente(9 , 1800.0 , 30 , Livello.IMPIEGATO ,  Dipartimento.AMMINISTRAZIONE);
		Dipendente dip4 = new Dipendente(3 , 2400.0 , 40 , Livello.DIRIGENTE ,  Dipartimento.VENDITE);
		
		dip1.promuovi();
		dip3.promuovi();
		
		dip1.stampaDatiDipendente();
		dip2.stampaDatiDipendente();
		dip3.stampaDatiDipendente();
		dip4.stampaDatiDipendente();
		
		
		//dip1.setImportoOrarioStraordinario(5.2) + Dipendente.getStipendio();
		//dip2.setImportoOrarioStraordinario(3.5);
		//dip3.setImportoOrarioStraordinario(2.8);
		//dip4.setImportoOrarioStraordinario(7.6);
		
		
		
		
		

	}
}
