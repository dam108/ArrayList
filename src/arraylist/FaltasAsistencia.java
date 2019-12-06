package arraylist;
import java.util.ArrayList;
public class FaltasAsistencia {
    private ArrayList <Integer> totalFaltasMes;
    private ArrayList <ArrayList <Integer>> faltasCurso;
    
    /* CONSTRUCTOR */
    FaltasAsistencia(){
        faltasCurso = new ArrayList <>();
        totalFaltasMes = new ArrayList<>();
        
        // llenamos el arrayList bidimensional con todo ceros
        for (int i = 0; i < 12; i++) {
            faltasCurso.add(new ArrayList<Integer>());
            for (int j = 0; j < 31; j++) {
                faltasCurso.get(i).add(0);
            }
        }
        // llenamos el arrayList con todo ceros
        for (int i = 0; i < 12; i++) {
            totalFaltasMes.add(0);
        }
        
    } 
    
    /* FIN CONSTRUCTOR */
    
    /* METODOS */
    
    public void anadirFalta(int mes, int dia, int falta){
        // para añadir en un array bidimensional usamos arreglo.get(fila).set(columna, valorAInsertar);
        faltasCurso.get(mes-1).set(dia-1, falta);
    }
    
    public void anularFata(int mes, int dia){
        faltasCurso.get(mes-1).set(dia-1, 0);
    }
    
    public int consultarFaltas(int mes, int dia){
        int faltasdia;
        faltasdia = faltasCurso.get(mes-1).get(dia-1);
        return faltasdia;
    }
    
    public ArrayList<Integer> getTotalFaltasMes(){
        return this.totalFaltasMes;
    }
    
    public ArrayList<ArrayList<Integer>> getFaltasCurso(){
        return this.faltasCurso;
    }
    
    public void actualizarTotalFaltasMes(){
        int total = 0;
        for (int i = 0; i < faltasCurso.size(); i++) {
            for (int j = 0; j < faltasCurso.get(i).size(); j++) {
                total += faltasCurso.get(i).get(j);
            }
            totalFaltasMes.set(i, total);
            total=0;
        }
    }

    /* FIN METODOS */

} /* FIN CLASS */
