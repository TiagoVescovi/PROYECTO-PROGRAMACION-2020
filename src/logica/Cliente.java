package logica;


public class Cliente extends Persona{
    private boolean preferencial;

    public Cliente(boolean preferencial, String CI, String apellido) {
        super(CI, apellido);
        this.preferencial = preferencial;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }
}
