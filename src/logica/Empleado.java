package logica;

public class Empleado extends Persona {

    private Fecha ingreso;
    private int categoria;
    private String antiguedad;

    public Empleado(Fecha ingreso, int categoria, String antiguedad, String CI, String apellido) {
        super(CI, apellido);
        this.ingreso = ingreso;
        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }

    public Fecha getIngreso() {
        return ingreso;
    }

    public void setIngreso(Fecha ingreso) {
        this.ingreso = ingreso;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }
    @Override
    public String toString() {
        return "ingreso: "+ingreso+" categoria: "+categoria+" antiguedad: "+antiguedad+" CI: "+CI+" apellido: "+apellido;
    }
    
    }

