package arraylist;
import java.util.ArrayList;
public class Dado {
    private final int caras;
    private ArrayList <Integer> resultadosDado;
    private int cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0;
    
    /* CONSTRUCTOR */
    Dado(){
        caras = 6;

    } 
    /* FIN CONSTRUCTOR */

    /* METODOS */
    
    public void lanzarDado(int numVeces){
        int result;
        // inicamos el araylist para guardar los resultados
        resultadosDado = new ArrayList <>(); 
        for (int i = 0; i < numVeces; i++) {
            result = (int)(Math.random() * this.caras ) + 1;
            resultadosDado.add(result);
        }
    }

    
    public void contarVecesCara(){
        
        for (int i = 0; i < resultadosDado.size(); i++) {
            int n = resultadosDado.get(i);
            switch (n){
                case 1: cara1++;break;
                case 2: cara2++;break;
                case 3: cara3++;break;
                case 4: cara4++;break;
                case 5: cara5++;break;
                case 6: cara6++;break;
            }
        }
        
    }
    
    public ArrayList<Integer> getResultadosDado() {
        return resultadosDado;
    }

    public int getCara1() {
        return cara1;
    }

    public int getCara2() {
        return cara2;
    }

    public int getCara3() {
        return cara3;
    }

    public int getCara4() {
        return cara4;
    }

    public int getCara5() {
        return cara5;
    }

    public int getCara6() {
        return cara6;
    }
    
    public int getCaras() {
        return caras;
    }
    

    /* FIN METODOS */

    
} /* FIN CLASS */
