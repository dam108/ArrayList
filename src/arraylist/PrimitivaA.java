package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class PrimitivaA {
    private ArrayList <Integer> resultadoSorteo;

    
    /* CONSTRUCTOR */
    PrimitivaA () {
        //inicializamos el arraylist
        resultadoSorteo = new ArrayList <>();
        int n;
        // generamos numeros aleatorios entre 1 y 49 y los guardamos en el arrayList mientras no esten repetidos
        for (int i = 0; i < 6; i++) {
            do{
                n = (int) (Math.random()*49)+1;
                
            } while(resultadoSorteo.contains(n)); // con contains comprobamos si n esta ya dentro del ArrayList
            resultadoSorteo.add(n); // con add añadimos un n al arrayList
            Collections.sort(resultadoSorteo); // ordenamos los elementos destro del arraylist
        }

    }// fin Contructor
    
    //metodo para devolver el resultado del arrayList
    public ArrayList <Integer> getResultadoSorteo(){
        return resultadoSorteo;
    }

    
} // fin class
