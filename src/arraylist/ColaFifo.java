package arraylist;
import java.util.ArrayList;
public class ColaFifo {
    
    private ArrayList<Integer> cola;
    
    /* CONSTRUCTOR */
    ColaFifo(){
        cola = new ArrayList();
        
    } 
    /* FIN CONSTRUCTOR */
    
    /* METODOS */

    public void  addElemento(int n){
        cola.add(n);
    }
    
    public ArrayList<Integer> getCola(){
        return this.cola;
    }


    /* FIN METODOS */

} /* FIN CLASS */
