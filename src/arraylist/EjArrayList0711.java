package arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class EjArrayList0711 {
    public static Scanner teclado;
    public static void main(String[] args) {
        int opcion;
        teclado = new Scanner(System.in);
        
        // creamos los dos arraylists
        ArrayList <Integer> arrayPositivos = new ArrayList <>();
        ArrayList <Integer> arrayNegativos = new ArrayList <>();
        
        do {
            opcion = menu();
            if (opcion != 0){
                if (opcion > 0)guardarN (arrayPositivos, opcion);
                else guardarN (arrayNegativos, opcion);
            }
            
        }
        while (opcion != 0);
        System.out.println(mostrarMedia(arrayPositivos));
        System.out.println(mostrarMedia(arrayNegativos));
        
    }   // fin main
    
    /* FUNCIONES */
    
    public static int menu(){
        System.out.println("Introduce un numero.");
        System.out.println("Introduce 0 para salir.");
        return teclado.nextInt();
    }
    
    public static void guardarN( ArrayList <Integer> array, int n ){
        array.add(n);
    }
    
    public static double mostrarMedia(ArrayList <Integer> array){
        int longitud = array.size();
        int n = 0;
        for (int i = 0; i < longitud; i++) {
            n += array.get(i);
        }
        double media = n / (double)longitud;
        return media;
    }
    
}       // fin class
