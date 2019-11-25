package arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class EjArrayList0712 {
    public static Scanner teclado;
    public static AlturaAlumnos alturas = new AlturaAlumnos ();
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int opcion;
        
        do{
            opcion = menu();
            ejecutarOpcion(opcion);
        }while(opcion != 0);

    }   // fin main
    
    /* FUNCIONES */
    public static int menu(){
        System.out.println("1.Introducir una altura.");
        System.out.println("2. Mostrar lista.");
        System.out.println("3. Eliminar altura por posicion.");
        System.out.println("4. Eliminar altura por valor.");
        System.out.println("5. vaciar la lista de alturas.");
        System.out.println(" pulsa 0 para salir ");
        return teclado.nextInt();
    }
    public static void ejecutarOpcion(int n){
        switch(n){
            case 1: /* TENGO QUE CAMBIAR TODO A DOBLES  */
                System.out.println("Introduce una altura");
                alturas.añadirAltura(teclado.nextDouble());
                break;
            case 2:
                for (int i = 0; i < alturas.getAlturas().size() ; i++) {
                    double a = alturas.getAlturas().get(i);
                    System.out.printf("Posicion %d - altura: %.2f \n", i,a);
                }
                break;
            case 3:
                System.out.println("Que posicion quieres eliminar?");
                int pos = teclado.nextInt();
                System.out.println("Se ha eliminado el elemnto "+alturas.getAlturas().remove(pos - 1)+" que estba en la posicion"+pos);
                break;
            case 4:
                System.out.println("Introduce el valor de la altura que quieres eliminar: ");
                double al = teclado.nextDouble();
                while (alturas.getAlturas().indexOf(al) != -1){
                    alturas.getAlturas().remove(alturas.getAlturas().indexOf(al));
                }
                break;
            case 5:
                alturas.getAlturas().clear();
                System.out.println("Se han borrado todos los elementos de la lista.");
                break;
        }
    }
}       // fin class
