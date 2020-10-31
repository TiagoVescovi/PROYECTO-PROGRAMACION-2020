 
package logica;

public class Importado extends Articulo {
    private int  añoImportacion;
    private double impuesto;

    public Importado(int añoImportacion, double impuesto, int codigo, String nombre, double precioCosto, int unidades) {
        super(codigo, nombre, precioCosto, unidades);
        this.añoImportacion = añoImportacion;
        this.impuesto = impuesto;
    }

    public int getAñoimportacion() {
        return añoImportacion;
    }

    public void setAñoimportacion(int añoimportacion) {
        this.añoImportacion = añoimportacion;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    @Override
    public double precioVenta() {
        if (añoImportacion <=2008) {
            return super.precioVenta() + (super.precioVenta() * 0.80);
        }else {
            return super.precioVenta() + (super.precioVenta() * 1.00);
        }
    }
}

