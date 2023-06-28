package esercizioG3;

public class MetodiES1 {

	public static boolean stringaPariDispari(String a) {
		int lunghezza = a.length();
		if(lunghezza % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	  public static boolean annoBisestile(int anno) {
		    if (anno % 4 == 0) {
		      if (anno % 100 == 0) {
		        if (anno % 400 == 0) {
		          return true; // è bisestile (divisibile per 400)
		        } else {
		          return false; // non è bisestile (divisibile per 100 ma non per 400)
		        }
		      } else {
		        return true; // è bisestile (divisibile solo per 4)
		      }
		    } else {
		      return false; // non è bisestile
		    }
		  }
		
	
}
