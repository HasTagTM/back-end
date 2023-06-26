package it.epicode.be;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
		String[] arrFive = {"ciao","hola", "salam", "salut", "hi" }
		
		int resMoltiplica = moltiplica(3 , 3);
		System.out.printIn(resMoltiplica);
		
		String resConcatena = concatena('ciao' , 2);
		System.out.printIn(resConcatena);
		
		string[] resInserisciInArray = inserisciInArray(arrFive , "test")
		for (int i =0 ; i < resInserisciInArray.length ; i++) {
			System.out.print(resInserisciInArray.length[i]);
		}
		};

public static int moltiplica(int a , int b) {
	return a * b;
};

public static String concatena(String a , int b) {
	return a + b;
};

public static string[] inserisciInArray(String[] arr , String a) {
	String[] = new String[6]
	for(int i = 0 ; i< arr.length ; i++) {
		if(i == 3) {
			arr[i] = a
		}else {
			arr[i] = x [i]
		}
		return arr;
	}
}

}



