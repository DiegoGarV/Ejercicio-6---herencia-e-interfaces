import java.util.ArrayList;


public class Tienda {
    private ArrayList<Producto> productos;
    private ArrayList<Producto> carrito;
    private ArrayList<Cliente> facturas;
    private ArrayList<Sucursal> sucursales;

    public Tienda() {
        this.productos = new ArrayList<Producto>();
        this.carrito = new ArrayList<Producto>();
        this.facturas = new ArrayList<Cliente>();
        this.sucursales = new ArrayList<Sucursal>();
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public ArrayList<Producto> getCarrito() {
        return this.carrito;
    }

    public ArrayList<Cliente> getFacturas() {
        return this.facturas;
    }

    public ArrayList<Sucursal> getSucursales() {
        return this.sucursales;
    }

    public void agruegarProducto(double precio, int serie, String tipo, String marca, String fechaFabric, String marcadorAR, int cantidad) {
        Producto produc = new Producto(precio, serie, tipo, marca, fechaFabric, marcadorAR, cantidad);
        productos.add(produc);
    }

    public void eliminarProductoManual(int num){
        productos.remove(num-1);
    }

    public void eliminarProductoAuto(){
        for (int i=0; i<productos.size(); i++){
            if (productos.get(i).getCantidad()==0){
                productos.remove(i);
            }
        }
    }

    public void agruegarSucursal(String direccion, int codigo, String pais, String ciudad) {
        Sucursal sucur = new Sucursal(direccion, codigo, pais, ciudad);
        sucursales.add(sucur);
    }

    public void eliminarSucursal(int num){
        sucursales.remove(num-1);
    }

    public void agruegarAlCarrito(int num) {
        Producto produc = productos.get(num-1);  
        carrito.add(produc);
    }

    public void eliminarDelCarrito(int num){
        carrito.remove(num-1);
    }

    public String hacerCompra(String nombre, int nit){
        Cliente client = new Cliente(nombre, nit);
        double totalPagar = 0;
        for (int i=0;i<carrito.size();i++){
            totalPagar = totalPagar+carrito.get(i).getPrecio();
        }
        client.setCarrito(carrito);
        client.setaPagar(totalPagar);
        carrito.clear();
        facturas.add(client);
        return client.toString();
    }

    public String mostrarProductos(){
        String cadena = "";
        if (!productos.isEmpty()){
            for (int i=0;i<productos.size();i++){
                cadena = cadena + "\nProducto "+(i+1)+"\n"+productos.get(i).toString() + "\n";
            }
        }
        else {
            System.out.println("Lo sentimos, actualmente no tenemos productos disponibles :(");
        }
        return cadena;
    }

    public String mostrarCarrito(){
        String cadena = "";
        if (!carrito.isEmpty()){
            for (int i=0;i<carrito.size();i++){
                cadena = cadena + "\nProducto "+(i+1)+"\n"+carrito.get(i).toString() + "\n";
            }
        }
        else {
            System.out.println("Aun no tienes ningun producto en tu carrito de compras");
        }
        return cadena;
    }

    public String mostrarSucursales(){
        String cadena = "";
        if (!sucursales.isEmpty()){
            for (int i=0;i<sucursales.size();i++){
                cadena = cadena + "\nSucursal "+(i+1)+"\n"+sucursales.get(i).toString() + "\n";
            }
        }
        else {
            System.out.println("Aun no contamos con sucursales");
        }
        return cadena;
    }

    public String mostrarFacturas(){
        String cadena = "";
        if (!facturas.isEmpty()){
            for (int i=0;i<carrito.size();i++){
                cadena = cadena + "\n" + facturas.get(i).toString() + "\n";
            }
        }
        else {
            System.out.println("Aun no se ha emitido ninguna factura");
        }
        return cadena;
    }
}
