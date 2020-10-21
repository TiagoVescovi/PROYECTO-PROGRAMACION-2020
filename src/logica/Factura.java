
package logica;

public class Factura {
    private Producto venta;
    private Fecha realizada;
    private Empleado vendedor;
    private Cliente comprador;

    public Factura(Producto venta, Fecha realizada, Empleado vendedor, Cliente comprador) {
        this.venta = venta;
        this.realizada = realizada;
        this.vendedor = vendedor;
        this.comprador = comprador;
    }

    public Producto getVenta() {
        return venta;
    }

    public void setVenta(Producto venta) {
        this.venta = venta;
    }

    public Fecha getRealizada() {
        return realizada;
    }

    public void setRealizada(Fecha realizada) {
        this.realizada = realizada;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
    
    
}
