package arraylist;
import java.time.LocalDate;
import java.util.ArrayList;
public class Factura {
    private int ID, numClient;
    private final static float iva = 21;
    private LocalDate fecha = LocalDate.now();
    private double importeTotal;
    ArrayList <LineaFactura> lineaFactura;
    
    Factura(int id, int nC){
        ID = id;
        numClient = nC;
        importeTotal = calcularIporteTotal();
        lineaFactura = new ArrayList <> ();
        
    } // FIN CONSTRUCTOR
    
    public double sumarImportesLinea(){
        double total = 0;
        for (int i = 0; i < lineaFactura.size(); i++) {
            total += lineaFactura.get(i).getImporteLinea();
        }
        return total;
    }
    
    public double calcularIporteTotal(){
        return sumarImportesLinea() + ((sumarImportesLinea()* iva)/100);
    }
    
} // FIN CLASS
