package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class EjArrayList0719 {
    public static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        
        ArrayList <Integer> arr1 = new ArrayList <>();
        arr1.add(1);arr1.add(2);arr1.add(3);arr1.add(4);arr1.add(5);arr1.add(6);

        ArrayList <Integer> arr2 = new ArrayList <>();
        arr2.add(6);arr2.add(5);arr2.add(4);arr2.add(3);arr2.add(2);arr2.add(1);
        
        ArrayList <Integer> arr3 = new ArrayList <>();
        arr3.add(0);arr3.add(7);arr3.add(3);arr3.add(4);arr3.add(9);arr3.add(2);
        
        ArrayList <Integer> arr4 = new ArrayList <>();
        arr4.add(0);arr4.add(2);arr4.add(3);arr4.add(4);arr4.add(7);arr4.add(9);
        
        //llamamos a la funcion de comparacion 
        
        System.out.println(compararArrays(arr1,arr2));
        System.out.println(compararArrays(arr2,arr3));
        System.out.println(compararArrays(arr3,arr4));
        
    }   // fin main
    
    public static boolean compararArrays( ArrayList <Integer> ar1, ArrayList <Integer> ar2 ){

        // ordenamos los arrays
        Collections.sort(ar1);
        Collections.sort(ar2);

        // devolvemos true si son iguales false si no lo son.
        return ar1.equals(ar2);
        
    }
    
}       // fin class
