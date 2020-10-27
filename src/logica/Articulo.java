package logica;

//Clase dedicada a la creacion de Articulos
public class Articulo {

// Atributos de nuestro Objeto de tipo Articulo
    private int codigo;
    private String nombre;
    private double precioCosto;
    private int unidades;

//Construcores
    public Articulo() {
    }
    public Articulo(int codigo, String nombre, double precioCosto, int unidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCosto = precioCosto;
        this.unidades = unidades;
    }

//Getters and Setters de nuestros Atributos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

//Metodo para calcular el Precio de Venta
    public double precioVenta() {

        double precioVenta = precioCosto * (100 / 100 - (precioCosto * 0.2));
        return precioVenta;
    }

    @Override
    public String toString() {
        return "Articulo:" + "codigo: " + codigo + ", nombre: " + nombre + ", precioCosto: " + precioCosto + ", unidades: " + unidades;
    }

}
