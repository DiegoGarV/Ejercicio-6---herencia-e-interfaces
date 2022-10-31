import java.util.ArrayList;
import java.time.*;
import java.time.format.*;
import java.util.Random;

public class Cliente {
    private String nombre;
    private int nit;
    private String fecha;
    private Random numFactura;
    private ArrayList<Producto> carrito;
    private double aPagar;

    public Cliente() {
        this.nombre = "";
        this.nit = 0;
        LocalDateTime momento1 = LocalDateTime.now();
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        this.fecha = formato1.format(momento1);
        this.numFactura = new Random(1000);
        this.carrito = new ArrayList<Producto>();
        this.aPagar = 0;
    }

    public Cliente(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
        LocalDateTime momento1 = LocalDateTime.now();
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        this.fecha = formato1.format(momento1);
        this.numFactura = new Random(1000);
        this.carrito = new ArrayList<Producto>();
        this.aPagar = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return this.nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Random getNumFactura() {
        return this.numFactura;
    }

    public ArrayList<Producto> getCarrito() {
        return this.carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }
    
    public double getaPagar() {
        return aPagar;
    }

    public void setaPagar(double aPagar) {
        this.aPagar = aPagar;
    }

    @Override
    public String toString() {
        String cadena = "Numero de factura: " + getNumFactura() + "\n" +
        "Fecha: " + getFecha() + "\n" +
        "NIT: " + getNit() + "\n" +
        "Nombre: " + getNombre() + "\n";
        for (int i=0; i<carrito.size(); i++){
            cadena = cadena+"\n"+carrito.get(i).getTipo()+" "+carrito.get(i).getMarca()+"                     Q"+carrito.get(i).getPrecio();
        }
        cadena = cadena+"\n\nTotal a pagar                         Q"+getaPagar();
        return cadena;
    }
}
