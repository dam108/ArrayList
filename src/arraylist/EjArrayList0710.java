package arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class EjArrayList0710 {
    public static void main(String[] args) {
        
        /* PROGRAMA BASE NO SE PIDE PERO LO USO PARA CHEKEAR COSAS*/
        
        
        PrimitivaA primitiva = new PrimitivaA();
        ArrayList <Integer> resultadoSorteo =new ArrayList <>();
        resultadoSorteo = primitiva.getResultadoSorteo();
        


        for (int i = 0; i < resultadoSorteo.size() ; i++) {
            if (i == resultadoSorteo.size() - 1) System.out.print(resultadoSorteo.get(i)+ ".\n");
            else System.out.print(resultadoSorteo.get(i)+ ", ");
        }
        
        
    }   // fin main
    
    
}       // fin class
