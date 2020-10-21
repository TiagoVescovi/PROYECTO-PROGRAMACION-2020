package logica;

public class Empleado extends Persona {

    private Fecha antiguedad;
    private int categoria;

    public Empleado(Fecha antiguedad, int categoria, String CI, String apellido) {
        super(CI, apellido);
        this.antiguedad = antiguedad;
        this.categoria = categoria;
    }

    public Fecha getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Fecha antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
