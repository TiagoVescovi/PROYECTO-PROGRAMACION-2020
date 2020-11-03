package logica;

public class Empleado extends Persona {

    private int categoria;
    private Fecha antiguedad;

    public Empleado(Fecha antiguedad, int categoria, String CI, String apellido) {
        super(CI, apellido);
        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }

   
    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public Fecha getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Fecha antiguedad) {
        this.antiguedad = antiguedad;
    }
    
}

