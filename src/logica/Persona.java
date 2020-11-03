
package logica;

public class Persona {
    public String CI;
    public String apellido;

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

    @Override
    public String toString() {
        return "sr/a"+ apellido+ "  CI: "+CI;
    }
   
}
