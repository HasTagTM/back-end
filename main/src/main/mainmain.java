package main;

public class mainmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrFive = {"ciao","hola", "salam", "salut", "hi" };
		
		int resMoltiplica = moltiplica(3 , 3);
		System.out.println(resMoltiplica);
		
		String resConcatena = concatena("ciao" , 2);
		System.out.println(resConcatena);
		
		String[] resInserisciInArray = inserisciInArray(arrFive , "test");
		for (int i =0 ; i < resInserisciInArray.length ; i++) {
			System.out.print(resInserisciInArray[i]);
		}

	}

		public static int moltiplica(int a , int b) {
			return a * b;
		};

		public static String concatena(String a , int b) {
			return a + b;
		};

		public static String[] inserisciInArray(String[] x , String y) {
			String[] arr = new String[6];
			for(int i = 0 ; i< x.length ; i++) {
				if(i == 3) {
					arr[i] = y;
				}else {
					arr[i] = x[i];
				}
				
			}
			return arr;
		}
		

}
