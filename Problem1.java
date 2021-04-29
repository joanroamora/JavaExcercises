import java.util.ArrayList; 

public class Main
{
	public static void main(String[] args) {
	    ArrayList<String> lista = new ArrayList<String>();
	    lista.add("good");
	    lista.add("better");
	    lista.add("best");
	    lista.add("best");
	    lista.add("first");
	    lista.add("last");
	    lista.add("last");
	    lista.add("last");
	    lista.add("good");
	    removeDuplicatesMethod(lista);
		System.out.println(lista);
	}
	
	public static void removeDuplicatesMethod(ArrayList<String> lista) {
	    for (int i = 0; i < lista.size() ; i++) { 
	        for (int k = 0 ; k < lista.size() ; k++) {
	            if (lista.get(i).equals(lista.get(k))) {
	                if (i != k) {
	                   lista.remove(k);
	                }
	            }
	        }
        }
	    
	}
	
}