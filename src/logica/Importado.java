
package logica;


public class Importado extends Articulo {
    private int  añoimportacion;
    private double impuesto;

    public Importado(int añoimportacion, double impuesto, int codigo, String nombre, double precioCosto, int unidades) {
        super(codigo, nombre, precioCosto, unidades);
        this.añoimportacion = añoimportacion;
        this.impuesto = impuesto;
    }

    public int getAñoimportacion() {
        return añoimportacion;
    }

    public void setAñoimportacion(int añoimportacion) {
        this.añoimportacion = añoimportacion;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    @Override
    public double precioVenta() {
        if (añoimportacion <=2008) {
            return super.precioVenta() + (super.precioVenta() * 0.80);
        }else {
            return super.precioVenta() + (super.precioVenta() * 1.00);
        }
    }
}

