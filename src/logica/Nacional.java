package logica;

public class Nacional extends Articulo {

    private String departamento;
    private boolean subsidio;

    public String getDepartamento() {
        return departamento;
    }

    public Nacional(String departamento, boolean subsidio, String nombre,
            int codigo,double precioCosto, int unidades) {
        super(nombre,codigo,precioCosto, unidades);
        this.departamento = departamento;
        this.subsidio = subsidio;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(boolean subsidio) {
        this.subsidio = subsidio;
    }
    
    @Override
    public double precioVenta() {
        if (subsidio) {
            return super.precioVenta();
        }
        if (departamento.equalsIgnoreCase("Montevideo")) {
            return super.precioVenta() + (super.precioVenta() * 0.15);
        } else {
            return super.precioVenta() + (super.precioVenta() * 0.10);
        }
    }
  

    @Override
    public String toString() {
        return "Departamento: " + departamento + "Subsidio: " +subsidio+"Codigo: "
                +super.getCodigo()+"Nombre: "+super.getNombre()+"Precio Costo: "
                +super.getPrecioCosto()+"Unidades: "+super.getUnidades()+".";
    }
}
