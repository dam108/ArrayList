package arraylist;
import java.util.Scanner;
public class EjArrayList0715 {
    public static Scanner teclado = new Scanner(System.in);
    public static Baraja deck;
    public static void main(String[] args) {
        double resultado;
        double mayor = 0;
        int ganador = 0;
        boolean todosPierden = true;
        int jugador;
        
        // preguntamos cuantos jugadores vamos a jugar
        System.out.println("Cuantos jugadores van a jugar");
        int nJugadores = teclado.nextInt();
        // instanciamos el objeto baraja con los jugadores indicados.
        deck = new Baraja(nJugadores);
        
         /* DEBUG
        for (int i = 0; i < deck.getNumMaxCartas() ; i++) {
            System.out.println("El "+deck.getCartas().get(i).getNumero()+" de "
                                + deck.getCartas().get(i).getPalo() +" que vale: "
                                + deck.getCartas().get(i).getValor()+" puntos.");
        } */
        
        System.out.println("Comienza el juego del 7 y medio.");
        do
        {
            
            System.out.println("Introduce el numero del jugador: ");
            System.out.println("0. para salir");
            jugador = teclado.nextInt();
            if (jugador !=0){
               resultado = jugar(jugador); 

            }

        }while(jugador !=0);      
        
        //mostrando quien gano la partida
        
        for (int i = 0; i < nJugadores; i++) {

            if (deck.getPuntuaciones().get(i) > 0){
                todosPierden = false;
                if (deck.getPuntuaciones().get(i) > mayor){
                    mayor = deck.getPuntuaciones().get(i);
                    ganador = i;
                }
            }
        }

        if (todosPierden == false) {
            for (int i = 0; i < nJugadores; i++) {
                System.out.println("La puntuacion del jugador "+(i+1)+" es de "+deck.getPuntuaciones().get(i)+" puntos.");
            }
            System.out.println("Ha ganado el jugador número " + (ganador + 1));
        }
        else System.out.println("Todos los jugadores se han pasado.");
        
    }   // fin main
    
    /* FUNCIONES */
    
    public static double jugar(int jugadorActivo){
        int opcion;
        int numCarta;
        double valorJugadorActivo = 0;
        String player = "";
        double valor = 0;
        boolean flag = false;

        System.out.println("Turno del Jugador numero " +jugadorActivo );
            do{
                
                System.out.println("1. para pedir carta.");
                System.out.println("2. para mostrar puntuacion acumulada.");
                System.out.println("0. plantarse o te has pasado");
                opcion = teclado.nextInt();
                
                switch(opcion){
                    case 1: 
                        numCarta = deck.sacarCarta();
                        System.out.println("Ha salid el "+deck.getCartas().get(numCarta).getNumero()+" de "
                        + deck.getCartas().get(numCarta).getPalo() +" que vale: "
                        + deck.getCartas().get(numCarta).getValor()+" puntos.");
                        valor = valor +deck.getCartas().get(numCarta).getValor();
                        deck.getPuntuaciones().set(jugadorActivo - 1, valor);
                        deck.eliminarCartaBaraja(numCarta);
                        break;
                        
                    case 2:
                        if (deck.getPuntuaciones().get(jugadorActivo - 1) == 0) {
                        System.out.println("Aun no se tiene una puntuacion acumulada.");
                        } else System.out.println("La puntuacion acumulado es "+ deck.getPuntuaciones().get(jugadorActivo - 1));
                        break;
                }

                if(valor > 7.5){
                    System.out.println( player+" se ha pasado.");
                    deck.getPuntuaciones().set(jugadorActivo - 1, 0.0);
                    flag = true;
                    opcion = 0;
                }

            } while (opcion !=0);
            
            if (flag == false) valorJugadorActivo = deck.getPuntuaciones().get(jugadorActivo - 1);
            return valorJugadorActivo;
        
    }

    /* FIN DE FUNCIONES */
    
}       // fin class
