package logica;

import java.util.ArrayList;

public class Sistema { //clase encargada de guardar datos

    private ArrayList<Cliente> listaClientes = new ArrayList();
    private ArrayList<Empleado> listaEmpleados = new ArrayList();
    private ArrayList<Articulo> listaArticulos = new ArrayList();
    private ArrayList<Factura> listaFacturas = new ArrayList();

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ArrayList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> lista) {
        this.listaArticulos = lista;
    }

    public Sistema() {
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaCliente(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    //Métodos para lista de Empleados
    public Empleado buscarEmpleado(String cedula) {
        Empleado buscarEmp;
        for (int i = 0; i < listaEmpleados.size(); i++) {
            buscarEmp = listaEmpleados.get(i);
            if (buscarEmp.getCI().equals(cedula)) {
                return buscarEmp;
            }
        }
        return null;
    }

    public void añadirEmpleado(Empleado emp) {
        if (!perteneceEmpleado(emp)) {
            listaEmpleados.add(emp);
        }
    }

    public boolean perteneceEmpleado(Empleado emp) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCI().equals(emp.getCI())) {
                return true;
            }
        }
        return false;
    }
    //Métodos de Clientes

    public Cliente buscarCliente(String cedula) {
        Cliente buscarCli;
        for (int i = 0; i < listaClientes.size(); i++) {
            buscarCli = listaClientes.get(i);
            if (buscarCli.getCI().equals(cedula)) {
                return buscarCli;
            }
        }
        return null;
    }

    public void añadirCliente(Cliente cli) {
        if (!perteneceCliente(cli)) {
            listaClientes.add(cli);
        }
    }

    public boolean perteneceCliente(Cliente cli) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getCI().equals(cli.getCI())) {
                return true;
            }
        }
        return false;
    }

    //Métodos para lista de Artículos
    public boolean perteneceArticuloPorCodigo(int codigo) {
        if (perteneceArticulo((buscarArticulo(codigo)))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean perteneceArticulo(Articulo a) {
        if(!listaArticulos.isEmpty()){
        for (int i = 0; i < listaArticulos.size(); i++) {
            if (listaArticulos.get(i).getCodigo() == a.getCodigo()) {
                return true;
            }
        }
        }return false;
    }

    public void eliminarArticulo(Articulo art) {
        if (perteneceArticulo(art)) {
            listaArticulos.remove(art);
        } else {
            System.out.println("Articulo inexistente");//USAR JOptionPanel
        }
    }

    public void añadirArticulo(Articulo art) {
        if (!perteneceArticulo(art)) {
            listaArticulos.add(art);
        } else {
            System.out.println("Este articulo ya existe"); //JOptionPanel
        }
    }

    public Articulo buscarArticulo(int codigo) {
        for (int i = 0; i < listaArticulos.size(); i++) {
            if (listaArticulos.get(i).getCodigo() == codigo) {
                return listaArticulos.get(i);
            }
        }
        return null;
    }

    
}
