package arraylist;
import java.util.Scanner;
public class EjArrayList0715 {
    public static Scanner teclado = new Scanner(System.in);
    public static Baraja deck;
    public static void main(String[] args) {
        double valor1 = 0, valor2 = 0, valor3 = 0, resultado = 0;
        String ganador = "";
        boolean todosPierden = false;
        int jugador;

        deck = new Baraja();
        
         /* DEBUG
        for (int i = 0; i < deck.getNumMaxCartas() ; i++) {
            System.out.println("El "+deck.getCartas().get(i).getNumero()+" de "
                                + deck.getCartas().get(i).getPalo() +" que vale: "
                                + deck.getCartas().get(i).getValor()+" puntos.");
        } */
        
        System.out.println("Comienza el juego del 7 y medio.");
        do
        {
            
            System.out.println("1. para jugar con Pepito");
            System.out.println("2. para jugar con Luis");
            System.out.println("3. para jugar con Maria");
            System.out.println("0. para salir");
            jugador = teclado.nextInt();
            if (jugador !=0){
               resultado = jugar(jugador); 
               if (jugador == 1 ) valor1 = resultado;
               if (jugador == 2 ) valor2 = resultado;
               if (jugador == 3 ) valor3 = resultado;
            }
            
            
            

        }while(jugador !=0);      
        
        //mostrando quien gano la partida
        // Si valor 1 se pasa, y valor 2 se pasa y valor 3 se pasa todos pierden
        if(valor1 == 0 && valor2 == 0 && valor3 == 0 ) {
            System.out.println("Todos los jugadores pierden");
            todosPierden = true;
        }
        
        if (valor1 == 0) System.out.println("Pepito se ha pasado de 7.5");
        else {
            System.out.println("Pepito tiene una puntuacion de "+ valor1);
            ganador = "Pepito";
        }
        
        if (valor2 == 0) System.out.println("Luis se ha pasado de 7.5");
        else {
            System.out.println("Luis tiene una puntuacion de "+ valor2);
            if (valor2 > valor1) ganador = "Luis";
        }
        
        if (valor3 == 0) System.out.println("Maria se ha pasado de 7.5");
        else {
            System.out.println("Maria tiene una puntuacion de "+ valor3);
            if ( valor3 > valor2 && valor3 > valor1 ) ganador = "Maria";
        }
        
        if (!todosPierden) System.out.println(" Ha ganado "+ganador);
        
       


        
    }   // fin main
    
    /* FUNCIONES */
    
    public static double jugar(int jugadorActivo){
        int opcion;
        int numCarta = 0;
        String player = "";
        double valor = 0;
        boolean flag = false;
        double valorJugadorActivo = 0;
        if (jugadorActivo == 1) player = "Pepito";
        if (jugadorActivo == 2) player = "Luis";
        if (jugadorActivo == 3) player = "Maria";

        System.out.println("Turno de " +player );
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
                        deck.eliminarCartaBaraja(numCarta);
                        break;
                        
                    case 2:
                        if (valor == 0) {
                        System.out.println("Aun no se tiene una puntuacion acumulada.");
                        } else System.out.println("La puntuacion acumulado es "+ valor);
                        break;
                }

                if(valor > 7.5){
                    System.out.println( player+" se ha pasado.");
                    flag = true;
                    opcion = 0;
                }
                

            } while (opcion !=0);
            
            if (flag == false) valorJugadorActivo = valor;
            return valorJugadorActivo;
        
    }
    
    
    /* FIN DE FUNCIONES */
    
}       // fin class
