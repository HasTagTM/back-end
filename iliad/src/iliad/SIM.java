package iliad;

public class SIM {
	private String numero;
	private double credito;
	private int[] ultimeChiamate;
	
	public SIM(String numero , double credito , int[] utltimeChiamate) {
		this.numero = numero;
		this.credito = 0.0;
		this.ultimeChiamate = ultimeChiamate;
	}
	
	public void stampaDatiSim() {
		System.out.println("il tuo numero è " + numero + "il tuo credito residuo è pari a " + credito);
	}
}
