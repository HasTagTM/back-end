package com.epicode.esercizio1;

public class IfClass {
	
	static boolean stringaPariDispari(String a) {
		if(a.length() % 2 == 0) {
			return true;
		}else {
			return false;
		}

	}
	
	static boolean annoBisestile(int anno){
		if(anno % 4 == 0) {
			return true;
		}else if(anno % 100 == 0) {
			if(anno % 400 == 0){
				return true;
			}

		}
	return false;
	}

}
