package arraylist;
import java.util.ArrayList;
public class EjArrayList0716 {
    public static void main(String[] args) {
        ArrayList <Integer> resultados = new ArrayList<>();
        
        Dado dice = new Dado();
        
        dice.lanzarDado(10000);
                
        dice.contarVecesCara();
        
        resultados.add(dice.getCara1());
        resultados.add(dice.getCara2());
        resultados.add(dice.getCara3());
        resultados.add(dice.getCara4());
        resultados.add(dice.getCara5());
        resultados.add(dice.getCara6());
        
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println("la cara "+(i + 1)+" ha salido "+resultados.get(i) +" veces.");
        }
        
        System.out.println("La diferencia entre el que mas veces ha salido y el que menos es de "+ diferencia(calcularMayor(resultados) ,calcularMenor(resultados)));

        
    }   // fin main

    public static int calcularMayor(ArrayList <Integer> arreglo ){
       int n = 0;
        for (int i = 0; i < arreglo.size(); i++) {
            if(arreglo.get(i) > n ) n = arreglo.get(i);
        }
        return n;
    }
    
    public static int calcularMenor(ArrayList <Integer> arreglo ){
       int n = 100000000;
        for (int i = 0; i < arreglo.size(); i++) {
            if(arreglo.get(i) < n ) n = arreglo.get(i);
        }
        return n;
    }
    
    public static int diferencia(int mayor, int menor){
        return mayor - menor;
    }

}       // fin class
