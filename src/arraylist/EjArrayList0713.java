package arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class EjArrayList0713 {
    public static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        final int NUM_RES = 15;
        int opcion;
        double nota = 0;
        // creamos el arreglo con las respuestas correctas en el main
        ArrayList <Integer> respuestas = new ArrayList <> ();
        // pedimos las respuestas correctas al examen
        System.out.println("--------------------------------------------------");
        System.out.println("PROFESOR");
        System.out.println("--------------------------------------------------");
        System.out.println("Introduce las respuestas correctas del examen.");
        System.out.println("Las respuestas validas son 1, 2, 3, 4 como posibles opciones o 0 para las respuestas en blaco"
                + "");
        for (int i = 0; i < NUM_RES; i++) {
            System.out.println("Introduce la respuesta a la pregunta numero "+(i+1)+":");
            respuestas.add(teclado.nextInt());            
        }
        
        // creamos un menu para pedir y calcular notas de los alumnos
        do{
            System.out.println("Para calcular las nota de un alumno pulsa 1");
            System.out.println("Para salir pulsa -1");
            opcion = teclado.nextInt();
            
            if(opcion != -1){
                for (int i = 0; i < NUM_RES; i++) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("ALUMNOS");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Introduce la respuesta a la pregunta numero "+(i+1)+":");
                    System.out.println("Las respuestas validas son 1, 2, 3, 4 como posibles opciones o 0 para las respuestas en blaco");
                    int res = teclado.nextInt();
                    if ( respuestas.get(i) == res ) nota += 0.5;
                    else if(res == 0) nota = nota;
                    else nota -= 0.2;
                }
                if (nota < 0) nota=0;
                System.out.println("la nota de este alumno es "+nota+".");
            }
            
        }while(opcion != -1);
        

    }   // fin main
    /* FUNCIONES */

}       // fin class
