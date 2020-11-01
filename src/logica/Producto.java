package logica;

import java.util.ArrayList;


public class Producto {
    
    private ArrayList<Articulo> lista = new ArrayList(); //guarda articulos que tiene el supermercado

    public ArrayList<Articulo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Articulo> lista) {
        this.lista = lista;
    }
    
    public boolean pertenece(Articulo a){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCodigo()==a.getCodigo()){
                return true;
            }
        }
        return false;
    }
    
    public void eliminarArticulo(Articulo art) {
        if (pertenece(art)) {
            lista.remove(art);
        } else {
            System.out.println("Articulo inexistente");//USAR JOptionPanel
        }
    }

    public void añadirArticulo(Articulo art) {
        if (!pertenece(art)) {
            lista.add(art);
        } else {
            System.out.println("Este articulo ya existe"); //JOptionPanel
        }
    }

    public Articulo buscarArticulo(int codigo) {   //TERMINAR METODO BUSCAR ARTICULO Y SACAR EL STATIC
     
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo() == codigo) { 
                return lista.get(i);
            }
            
        }
        return null;
    }
    public boolean perteneceArticuloPorCodigo(int codigo){
        if(pertenece((buscarArticulo(codigo)))){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Producto{" + '}';
    }

}
