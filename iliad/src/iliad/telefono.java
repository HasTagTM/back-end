package iliad;

public class telefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ultimeChiamate = {10 , 50 , 7 , 6 , 3};
		
		SIM sim = new SIM("25841235874" , 0.0 , ultimeChiamate);
		
		sim.stampaDatiSim();
		
	}

}
