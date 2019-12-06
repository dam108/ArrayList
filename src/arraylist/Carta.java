package arraylist;
public class Carta {
    private int numero; 
    private double valor;
    private String palo;
    
    /* CONSTRUCTOR */
    Carta(int n, String p){
        numero = n;
        palo = p;
        if (n > 0 && n <=7) valor = n;
        else valor = 0.5;
    } 
    /* FIN CONSTRUCTOR */
    
    /* METODOS */

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /* FIN METODOS */

} /* FIN CLASS */
