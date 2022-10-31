public class Producto implements Caracteristicas{
    protected double precio;
    protected int serie;
    protected String tipo;
    protected String marca;
    protected String fechaFabric;
    protected String marcadorAR;
    protected int cantidad;

    public Producto() {
        this.precio = 0;
        this.serie = 0;
        this.tipo = "";
        this.marca = "";
        this.fechaFabric = "";
        this.marcadorAR = "";
        this.cantidad = 0;
    }

    public Producto(double precio, int serie, String tipo, String marca, String fechaFabric, String marcadorAR, int cantidad) {
        this.precio = precio;
        this.serie = serie;
        this.tipo = tipo;
        this.marca = marca;
        this.fechaFabric = fechaFabric;
        this.marcadorAR = marcadorAR;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSerie() {
        return this.serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaFabric() {
        return this.fechaFabric;
    }

    public void setFechaFabric(String fechaFabric) {
        this.fechaFabric = fechaFabric;
    }

    public String getMarcadorAR() {
        return this.marcadorAR;
    }

    public void setMarcadorAR(String marcadorAR) {
        this.marcadorAR = marcadorAR;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + getTipo() + "\n" +
            "Marca: " + getMarca() + "\n" +
            "Serie: " + getSerie() + "\n" +
            "Fecha de fabricacion" + getFechaFabric() + "\n" +
            " Precio: Q" + getPrecio() + "\n" +
            " Marcador AR: " + getMarcadorAR() + "\n" +
            "Disponibles: " + getCantidad() + " unidades";
    }

    @Override
    public String llamada(){
        return "Realizando llamada desde mi "+getTipo()+" "+getMarca();
    }

    @Override
    public String foto(){
        return "Tomando fotografia desde mi "+getTipo()+" "+getMarca();
    }

    @Override
    public String repVideo(){
        return "Reproduciendo video desde mi "+getTipo()+" "+getMarca();
    }

    @Override
    public String navInternet(){
        return "Visitando el sitio web desde mi "+getTipo()+" "+getMarca();
    }

    @Override
    public String portable(){
        return "El producto "+getTipo()+" "+getMarca()+" si es portatil";
    }

    @Override
    public String videojuego(){
        return "Iniciando el juego desde mi "+getTipo()+" "+getMarca();
    }
}
