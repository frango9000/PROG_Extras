package PROG_Extras_04_Almacen;
/**
 * @author fsancheztemprano
 */
public class Controlador {
    public BD bd = new BD();
    public Almacen almacen = new Almacen();
    public Productos productos = new Productos();
    
    private static int ref = 100;
    
    public void agregar(String codigo, int unidades, float precio){
        if (!bd.contiene(codigo)) {
            bd.agregar(ref, codigo);
            almacen.agregar(ref, unidades);
            productos.agregar(ref, precio);
            ref++;
        }else{
            int thisRef = bd.getRef(codigo);
            almacen.restock(thisRef, unidades);
            productos.cambiarPrecio(thisRef, precio);
        }        
    }
    public void setPrecio(String codigo, float nuevoPrecio){        
            int thisRef = bd.getRef(codigo);
            productos.cambiarPrecio(ref, nuevoPrecio);
    }
    public void print(){
        Object[] codigos = bd.arrayOfKeys();
        float total = 0;
            System.out.printf("%3s, %4s, %4s, %4s, %9s%n","Ref", "Codigo", "Stock", "Precio", "Total");
        for (int i = 0; i < codigos.length; i++) {
            String thisCodigo =(String) codigos[i];
            int thisRef = bd.getRef(thisCodigo);
            int thisUnidades = almacen.getUnidades(thisRef);
            float thisPrecio = productos.getPrecio(thisRef);
            float semiPrecio = thisUnidades * thisPrecio;
            total += semiPrecio;
            System.out.printf("%3d, %6s, %5d, %6.2f, %9.2f%n",thisRef, thisCodigo, thisUnidades, thisPrecio, semiPrecio );
            
        }
        System.out.printf("Total almacen = %5.2f%n%n",total);
        
        
    }
}
