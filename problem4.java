import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int arr [] = {1, 5, 4, 2};
        permutation(arr);
    }
    
    public static ArrayList<Integer> permutation(int[] array) {
        ArrayList<Integer> salida2 = new ArrayList<Integer>();
        int n= array.length;
        perm(array, n); 
        return salida2;
    }
    
    public static void perm (int [] list, int n) {
        if (n==1) {
            System.out.println(Arrays.toString (list));
        } 
        else {
            for (int c=0;c<n;c++) {
                perm(list,n-1);
                if (n%2==0) {
                    int temp1=list[c];
                    list[c]=list[list.length-1];
                    list[list.length-1]=temp1;
                }
                else {
                    int temp2=list[0];
                    list[0]=list[list.length-1];
                    list[list.length-1]=temp2;
                }
            }
        }
    }
     
}