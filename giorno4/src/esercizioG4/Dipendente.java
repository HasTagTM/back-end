package esercizioG4;

public class Dipendente {
	
	private static double stipendioBase = 1000;
	private  int matricola;
	private  double stipendio;
	private  double importoOrarioStraordinario;
	private  Livello level;
	private  Dipartimento department;
	
	
	
	public Dipendente(int matricola , Dipartimento department) {
		this.matricola = matricola;
		this.department = department;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.level = Livello.OPERAIO;
	}
	
	public Dipendente(int matricola ,double stipendio, double importoOrarioStraordinario, Livello level, Dipartimento department) {
		this.matricola = matricola;
		this.stipendio = stipendioBase;
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
	

	
	 public void stampaDatiDipendente() {
		System.out.println("matricola " + matricola);
		System.out.println("stipendio " + stipendio);
		System.out.println("importo orario straordinario " + importoOrarioStraordinario);
		System.out.println("livello " + level);
		System.out.println("dipartimento " + department);
	}
	
	public Livello promuovi() {
		
		if(this.level == Livello.OPERAIO) {
			this.level = Livello.IMPIEGATO;
				this.stipendio *= 1.2;
		}else if(level == Livello.IMPIEGATO) {
			this.stipendio *= 1.5;
			this.level = Livello.QUADRO;
		}else if(this.level == Livello.DIRIGENTE) {
			this.stipendio *= 2;
			this.level = Livello.DIRIGENTE;
		}else {
		System.out.println("errore: impossibile promuovere il dipendente con livello DIRIGENTE.");
		
		}
		return this.level;
	}
	
	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.stipendio;
	}
	public static double calcolaPagaConStraordinario(Dipendente dipendente,int OreStraordinario) {
		return dipendente.stipendio + (dipendente.importoOrarioStraordinario * OreStraordinario);
	}
	


}
