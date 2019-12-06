package arraylist;
import java.util.Scanner;
public class EjArrayList0718 {
    public static Scanner teclado;
    public static ColaFifo cola;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int opcion;
        cola = new ColaFifo();
        
        do {
            
            System.out.println("1. Introducir un elemento en la cola FIFO");
            System.out.println("2. Sacar un elemento de la cola FIFO");
            System.out.println("3. Mostrar elementos en la cola FIFO");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();
            
            ejecutarOpcion(opcion);
            
        } while (opcion !=0);

    }   // fin main
    
    public static void ejecutarOpcion(int n){
        switch(n){
            case 1:
                System.out.println("Introduce un numero a añadir el la Cola.");
                int num = teclado.nextInt();
                cola.addElemento(num);
                break;
            case 2:
                System.out.println("El numero a retirar es "+cola.getCola().get(0));
                cola.getCola().remove(0);
                break;
            case 3:
                System.out.println(cola.getCola());
                break;
        }
    }
    
    
}       // fin class
