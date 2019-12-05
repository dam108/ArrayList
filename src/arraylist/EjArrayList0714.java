package arraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class EjArrayList0714 {
    public static Scanner teclado;
    public static Factura fac1;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int opcion = 0;
                
        do {
            // elegimos lo que queremos hacer con la factura
            opcion = opcionFactura();
            // ejecutamos la opcion elegida
            ejecutarOpcion(opcion);
            
            
        } while (opcion != 0);

    }   // fin main
    /* FUNCIONES */
    
    public static int opcionFactura(){
        System.out.println("1. Crear factura.");
        System.out.println("2. Ver Factura.");
        System.out.println("3. Modificar factura");
        System.out.println("0. Salir");
        return teclado.nextInt();
    }

    public static void ejecutarOpcion(int n){
        switch(n){
            case 1:
                System.out.println("Introduce un Id: ");
                int id = teclado.nextInt();
                System.out.println("Introduce el numnero de cliente: ");
                int numCliente = teclado.nextInt();
                //creamos una instancia del objeto factura
                fac1 = new Factura(id, numCliente);
                boolean crearF;
                crearF = crearFactura();
                if (crearF){
                    System.out.println("Se ha creado la factura correctamente.");
                    verFactura();
                }
                else System.out.println("no se ha podido crear la factura");
                break;
            case 2:
                verFactura();
                break;
            case 3:
                modificarFactura();
                break;
        }
    }
    
    public static void modificarFactura(){
        int opModFact=100;
        do{
            System.out.println("1. modificar Id de la factura: ");
            System.out.println("2. modificar el numero del cliente: ");
            System.out.println("3. Modificar un producto");
            System.out.println("4. borrar un producto");
            System.out.println("0. Salir");
            opModFact =  teclado.nextInt();

            if (opModFact !=0) {
                switch(opModFact){
                case 1:
                    System.out.println("Introduce el nuemos Id: ");
                    int id = teclado.nextInt();
                    fac1.setID(id);
                    break;
                case 2:
                    System.out.println("Introduce el nuevo numero de cliente: ");
                    int num = teclado.nextInt();
                    fac1.setNumClient(num);
                    
                    break;
                case 3:
                    int numLinea = 100;
                    do {
                        System.out.println("¿Que linea de la factura quieres modificar ?");
                        numLinea = teclado.nextInt();
                        modificarLinea(numLinea);
                    }while (numLinea != 0);
                    break;
                case 4:
                    System.out.println("¿Que linea quieres borrar?");
                    int nL = teclado.nextInt();
                    fac1.borrarLinea(nL);
                    
                    // no funciona el actualizar importe despues de borrar una linea RETOMAR AQUI
                    break;
                }
                fac1.actualizarTotalFactura();
                verFactura();
            }
        }while (opModFact !=0);
        verFactura();
    }
    
    public static void modificarLinea(int numLi){
        System.out.println("En la linea nº "+numLi+" ¿que deseas modificar?");
        System.out.println("1. Modificar la descripcion.");
        System.out.println("2. Modificar el Precio de la unidad.");
        System.out.println("3. Modificar la cantidad.");
        System.out.println("4. Modificar el descuento ");
        int opModLinea = teclado.nextInt();
        
        switch (opModLinea){
            case 1:
                System.out.println("Introduce la nueva descripcion: ");
                String des = teclado.nextLine();
                // llamamos a la factura,pedirmos el arraylist, pedimos la linea que queremos y cambiamos la descripcion
                fac1.getLineaFactura().get(numLi).setDescipcion(des);
                break;
            case 2:
                System.out.println("Introduce el nuevo precio de la unidad: ");
                double precioUnidad = teclado.nextDouble();
                // llamamos a la factura,pedirmos el arraylist, pedimos la linea que queremos y cambiamos la unidad
                fac1.getLineaFactura().get(numLi).setPrecioUnidad(precioUnidad);
                System.out.println(fac1.getLineaFactura().get(numLi).getPrecioUnidad() + " importe linea ");
                System.out.println(fac1.getLineaFactura().get(numLi).getImporteLinea() + " importe total ");
                break;
            case 3:
                System.out.println("Introduce la nueva cantidad: ");
                int cantidad = teclado.nextInt();
                // llamamos a la factura,pedirmos el arraylist, pedimos la linea que queremos y cambiamos la cantidad
                fac1.getLineaFactura().get(numLi).setCantUnidad(cantidad);
                break;
            case 4:
                System.out.println("Introduce el nuevo descuento: ");
                float descuento = teclado.nextFloat();
                // llamamos a la factura,pedirmos el arraylist, pedimos la linea que queremos y cambiamos la descuento
                fac1.getLineaFactura().get(numLi).setDescuento(descuento);
                break;
        }
        fac1.actualizarImporteLinea();
        fac1.calcularIporteTotal();
        verFactura();
    }
    
    public static void verFactura(){
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("Factura nº: "+fac1.getID());
        System.out.println("-------------------------------------------");
        System.out.println("Fecha de expedicion de la factura: "+fac1.getFecha());
        System.out.println("-------------------------------------------");
        System.out.println("Lista de productos: ");
        for (int i = 0; i < fac1.lineaFactura.size(); i++) {
            System.out.println("Descripcion: "+fac1.lineaFactura.get(i).getDescipcion());
            System.out.println("Precio de la unidad: "+fac1.lineaFactura.get(i).getPrecioUnidad());
            System.out.println("Cantida de unidades: "+fac1.lineaFactura.get(i).getCantUnidad());
            System.out.println("Descuento: "+fac1.lineaFactura.get(i).getDescuento());
            System.out.println("Precio total de este producto: "+fac1.lineaFactura.get(i).getImporteLinea()+" euros");
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
        }
        System.out.println("Precio total de la Factura: "+fac1.getImporteTotal()+" euros");
        System.out.println("-------------------------------------------");
    }
    
    public static boolean crearFactura(){
        int opProduc;
        System.out.println("Necesitamos minimo un producto para crear la factura.");
        do {
        System.out.println("¿Quieres crear un producto?");
        System.out.println("1. Crear producto.");
        System.out.println("0. Salir");
        opProduc = teclado.nextInt();
        // buffer 
        teclado.nextLine();
        
        if(opProduc != 0) crearLinea();
        
        } while(opProduc != 0); 
        return true;
    }
    
    public static void crearLinea(){
        String des; float precioUnidad; int cantidad; float descuento;
        System.out.println("Introduce una descripcion.");
        des = teclado.nextLine();
        System.out.println("Introduce el precio del producto.");
        precioUnidad = teclado.nextFloat();
        System.out.println("Introduce la cantidad de unidades");
        cantidad = teclado.nextInt();
        System.out.println("introduce el descuento (si no hay indicar 0).");
        descuento = teclado.nextFloat();
        
        fac1.lineaFactura.add(new LineaFactura(des, precioUnidad, cantidad, descuento));
        fac1.calcularIporteTotal();
    }

}       // fin class
