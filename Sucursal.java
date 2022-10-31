public class Sucursal {
    private String direccion;
    private int codigo;
    private String pais;
    private String ciudad;

    public Sucursal() {
        this.direccion = "";
        this.codigo = 0;
        this.pais = "";
        this.ciudad = "";
    }

    public Sucursal(String direccion, int codigo, String pais, String ciudad) {
        this.direccion = direccion;
        this.codigo = codigo;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion: " + getDireccion() + "\n" +
            "Codigo: " + getCodigo() + "\n" +
            "Pais" + getPais() + "\n" +
            "Ciudad: " + getCiudad();
    }
}
