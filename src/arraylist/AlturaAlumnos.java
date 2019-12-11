
package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class AlturaAlumnos {
private ArrayList <Double> alturas = new ArrayList <>();

    
    /* CONSTRUCTOR */
    AlturaAlumnos () {
        ArrayList <Double> alturas;

    }// fin Contructor

    public ArrayList <Double> getAlturas() {
        return alturas;
    }
    
    public void añadirAltura (double altura){
        alturas.add(altura);
        Collections.sort(alturas);
    }

    
} // fin class
