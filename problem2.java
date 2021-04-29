import java.util.ArrayList; 

public class Main
{
	public static void main(String[] args) {
	    int [] array  = {5, 1, 23, 21, 17, 2, 3, 9, 12};
	    int value = 22;
	    boolean x = testForSum(array, value);
		System.out.println(x);
	}
	
	public static boolean testForSum(int[] array,int value) {
	    int aux = 0;
	    for (int i = 0 ; i<array.length ; i++) {
	        for (int j = 0 ; j<array.length ; j++) {
	            aux = array[i] + array[j];
	            if (aux < value) {
	                for (int k = 0 ; k<array.length ; k++) {
	                    aux =  aux + array[k]; 
	                    if (aux==value) {
	                        if (k != j && j != i) {
	                            return true;
	                        }
	                    }
	                }
	            }
	        }
	    }
	    return false;
	}
}