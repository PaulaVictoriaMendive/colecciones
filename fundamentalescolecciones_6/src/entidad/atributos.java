package entidad;
public class atributos {
private String producto;
private Double precio;

    public atributos() {
    }

    public atributos(String producto, Double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "atributos{" + "producto=" + producto + ", precio=" + precio + '}';
    }

}
