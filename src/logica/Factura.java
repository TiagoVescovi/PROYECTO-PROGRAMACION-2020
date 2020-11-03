package logica;

import java.util.ArrayList;

public class Factura {

    private Fecha realizada;
    private Empleado vendedor;
    private Cliente comprador;
    private ArrayList<Articulo> listaFactura = new ArrayList();

    public Factura() {

    }

    public Factura(ArrayList<Articulo> listaFactura, Fecha realizada,
            Empleado vendedor, Cliente comprador) {
        this.realizada = realizada;
        this.vendedor = vendedor;
        this.comprador = comprador;
    }

    public ArrayList<Articulo> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(ArrayList<Articulo> listaFactura) {
        this.listaFactura = listaFactura;
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

    @Override
    public String toString() {
        String lista = "";
        for (int i = 0; i < listaFactura.size(); i++) {
            lista = lista + "\n" + listaFactura.get(i);
        }
        return lista;
    }
    
}
