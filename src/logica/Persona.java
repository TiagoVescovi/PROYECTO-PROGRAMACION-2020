
package logica;

public class Persona {
    private String CI;
    private String apellido;

    public Persona(String CI, String apellido) {
        this.CI = CI;
        this.apellido = apellido;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
