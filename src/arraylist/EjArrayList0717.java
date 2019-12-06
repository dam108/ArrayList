package arraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class EjArrayList0717 {
    public static Scanner teclado;
    public static FaltasAsistencia faltas;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int opcion;
        
        faltas = new FaltasAsistencia();
        
        do{
            System.out.println("1. Añadir Falta");
            System.out.println("2. Anular Falta");
            System.out.println("3. Consultar Faltas");
            System.out.println("4. ver la suma de las faltas de cada mes");
            System.out.println("5. ver las faltas de cada dia");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();
            
            if (opcion != 0) ejecutarOpcion(opcion);
            
            
        } while(opcion != 0);

        /* DEBUG 
        for (int i = 0; i < faltas.getFaltasCurso().size() ; i++) {
            System.out.println(faltas.getFaltasCurso().get(i));
        }
        
        for (int i = 0; i < faltas.getTotalFaltasMes().size() ; i++) {
            System.out.println(faltas.getTotalFaltasMes().get(i));
        }*/

        
    }   // fin main
    
    public static void ejecutarOpcion(int n){
        int mes, dia, falta;
        switch(n){
            case 1: 
                System.out.println("Introduce el mes. ");
                mes = teclado.nextInt();
                System.out.println("Introduce el dia. ");
                dia = teclado.nextInt();
                System.out.println("Introduce el numero de faltas");
                falta = teclado.nextInt();
                faltas.anadirFalta(mes, dia, falta);
                break;
            case 2: 
                System.out.println("Introduce el mes. ");
                mes = teclado.nextInt();
                System.out.println("Introduce el dia. ");
                dia = teclado.nextInt();
                faltas.anularFata(mes, dia);
                break;
            case 3: 
                System.out.println("Introduce el mes. ");
                mes = teclado.nextInt();
                System.out.println("Introduce el dia. ");
                dia = teclado.nextInt();
                System.out.println(faltas.consultarFaltas(mes, dia));
                break;
            case 4:
                System.out.println(faltas.getTotalFaltasMes());
                break;
            case 5:
                for (int i = 0; i < faltas.getFaltasCurso().size() ; i++) {
                    System.out.println(faltas.getFaltasCurso().get(i));
                }
                break;

        }
        faltas.actualizarTotalFaltasMes();
        
    }
    
    
}       // fin class
