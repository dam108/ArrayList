package arraylist;
import java.time.LocalDate;

public class LineaFactura {
    private String descipcion;
    private double precioUnidad, importeLinea;
    private int cantUnidad;
    private float descuento;
    
    LineaFactura(String descip, double precioU, int cantUni, float descu, double imporLinea){
        descipcion = descip;
        precioUnidad = precioU;
        importeLinea = (precioU * cantUni) - descu;
        cantUnidad = cantUni;
        descuento = descu;
                
    } // FIN CONSTRUCTOR

    public String getDescipcion() {
        return descipcion;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public int getCantUnidad() {
        return cantUnidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }

    public void setCantUnidad(int cantUnidad) {
        this.cantUnidad = cantUnidad;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

} // FIN CLASS
