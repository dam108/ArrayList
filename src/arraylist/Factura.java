package arraylist;
import java.time.LocalDate;
import java.util.ArrayList;
public class Factura {
    private int ID, numClient;
    private final static float iva = 21;
    private LocalDate fecha;
    private double importeTotal;
    public ArrayList <LineaFactura> lineaFactura;
    
    Factura(int id, int nC){
        ID = id;
        numClient = nC;
        importeTotal = 0;//calcularIporteTotal();
        lineaFactura = new ArrayList <> ();
        fecha = LocalDate.now();
        
    } // FIN CONSTRUCTOR

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public void setLineaFactura(ArrayList<LineaFactura> lineaFactura) {
        this.lineaFactura = lineaFactura;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public int getNumClient() {
        return numClient;
    }

    public static float getIva() {
        return iva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public ArrayList<LineaFactura> getLineaFactura() {
        return lineaFactura;
    }
    
    public double sumarImportesLinea(){
        double total = 0;
        System.out.println(lineaFactura.size());
        for (int i = 0; i < lineaFactura.size(); i++) {
            total += lineaFactura.get(i).getImporteLinea();
        }
        return total;
    }
    
    public double calcularIporteTotal(){
        double total = sumarImportesLinea();
        this.importeTotal = total + ((total * iva)/100);
        return this.importeTotal;
    }
    
    public void actualizarImporteLinea(){

        for (int i = 0; i < lineaFactura.size(); i++) {
             int cant = lineaFactura.get(i).getCantUnidad();
             double preU = lineaFactura.get(i).getPrecioUnidad();
             float des = lineaFactura.get(i).getDescuento();
             double totalLinea = (preU * cant) - des;
             lineaFactura.get(i).setImporteLinea(totalLinea);
        }
    }
    
    public void actualizarTotalFactura(){
        actualizarImporteLinea();
        double actImporTotal = calcularIporteTotal();
        setImporteTotal(actImporTotal);
        
    }
    
    public void borrarLinea(int num){
        lineaFactura.remove(num);
        actualizarImporteLinea();
    }
    

} // FIN CLASS
