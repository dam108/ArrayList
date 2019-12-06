package arraylist;
import java.util.ArrayList;
public class Baraja {
    private final int numMaxCartas;
    // inicializamos un arraylist de cartas
    private ArrayList <Carta> cartas = new ArrayList();
    // inicializamos un arraylist de palos
    private ArrayList <String> palos = new ArrayList();
    
    /* CONSTRUCTOR */
    Baraja(){
        numMaxCartas = 40;
        //damos valores al arraylist de palos 
        palos.add("Oros");
        palos.add("Espadas");
        palos.add("Copas");
        palos.add("Bastos");
        // recorremos la baraja creando cada carta , del 1 al 10 por cada palo
        // primero recorremos cada palo 
        for (int j = 0; j < palos.size(); j++) {
            // despues recorremos del 0 al 10 dando valores numericos a cada palo
            for (int k = 0; k < 10; k++) {
                int num = k + 1;
                String palo = palos.get(j);
                cartas.add(new Carta(num, palo));
            }

        }
        
    } 
    /* FIN CONSTRUCTOR */
    
    /* METODOS */
    
    public int getNumMaxCartas() {
        return numMaxCartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    
    public int sacarCarta(){
        int n;
        // mientras que el numero sea 0 buscamos por otra carta
        do{
            n = (int) (Math.random()*39);
            cartas.get(n).getNumero();
        }
        while (cartas.get(n).getNumero() == 0);
        // si no es es 0 devolvemos el numero generado al azar
        return n;
    }
    
    public boolean eliminarCartaBaraja(int num){
        cartas.get(num).setNumero(0);
        return true;
    }
    
    /* FIN METODOS */

} /* FIN CLASS */
