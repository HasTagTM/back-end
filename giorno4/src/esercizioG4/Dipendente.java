package esercizioG4;

public class Dipendente {
	
	private static int matricola;
	private static double stipendio;
	private static double importoOrarioStraordinario;
	private static Livello level;
	private static Dipartimento department;
	
	
	
	public Dipendente(int matricola , Dipartimento department) {
		this.matricola = matricola;
		this.department = department;
		this.stipendio = 1000.0;
		this.importoOrarioStraordinario = 30;
		this.level = Livello.OPERAIO;
	}
	
	public Dipendente(int matricola ,double stipendio, double importoOrarioStraordinario, Livello level, Dipartimento department) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.level = level;
		this.department = department;
		
	}
	
	public int getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public Livello getLevel() {
		return level;
	}
	public  Dipartimento getDepartment() {
		return department;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public void setDepartment(Dipartimento department) {
		this.department = department;
	}
	

	
	static public void stampaDatiDipendente() {
		System.out.println("matricola " + matricola);
		System.out.println("stipendio " + stipendio);
		System.out.println("importo orario straordinario " + importoOrarioStraordinario);
		System.out.println("livello " + level);
		System.out.println("dipartimento " + department);
	}
	
	static Livello promuovi() {
		
		if(level == Livello.OPERAIO) {
			stipendio *= 1.2;
			return Livello.IMPIEGATO;
				
		}else if(level == Livello.IMPIEGATO) {
			stipendio *= 1.5;
			return Livello.QUADRO;
		}else if(Dipendente.level == Livello.QUADRO) {
			stipendio *= 2;
			return Livello.DIRIGENTE;
		}
		System.out.println("errore: impossibile promuovere il dipendente con livello DIRIGENTE.");
		return level;
	}
	
	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.getStipendio();
	}
	public static double calcolaPagaConStraordinario(Dipendente dipendente,int OreStraordinario) {
		return dipendente.getStipendio() + (dipendente.getImportoOrarioStraordinario() * OreStraordinario);
	}
	
	


}
