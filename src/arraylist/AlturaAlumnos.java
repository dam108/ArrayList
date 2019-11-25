package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class AlturaAlumnos {
private ArrayList <Integer> alturas = new ArrayList <>();

    
    /* CONSTRUCTOR */
    AlturaAlumnos () {
        ArrayList <Integer> alturas;

    }// fin Contructor

    public ArrayList<Integer> getAlturas() {
        return alturas;
    }
    
    public void añadirAltura (int altura){
        alturas.add(altura);
        Collections.sort(alturas);
    }

    
} // fin class
