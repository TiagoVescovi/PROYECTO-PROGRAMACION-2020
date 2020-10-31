package logica;

import java.util.ArrayList;


public class Producto {
//SACAR TODOS LOS STATIC Y EL MAIN
    private static ArrayList<Articulo> lista = new ArrayList(); //guarda articulos que tiene el supermercado

    public ArrayList<Articulo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Articulo> lista) {
        this.lista = lista;
    }

   
    
//    
//    Articulo art = new Articulo();
//    
//    public Sistema(int codigo, String nombre, double precioCosto, int unidades) {
//        super(codigo, nombre, precioCosto, unidades);
//
//        Scanner cod = new Scanner(System.in);
//        Scanner nom = new Scanner(System.in);
//        Scanner pre = new Scanner(System.in);
//        Scanner uni = new Scanner(System.in);
//        
//        System.out.println("Ingrese el codigo del Articulo");
//        art.setCodigo(cod.nextInt());
//        System.out.println("Ingrese el nombre del Articulo");
//        art.setNombre(nom.next());
//        System.out.println("Ingrese el precio costo del Articulo");
//        art.setPrecioCosto(pre.nextDouble());
//        System.out.println("Ingrese las unidades del Articulo");
//        art.setUnidades(uni.nextInt());
//        Lista.add(art);
//
//    }
//
//}
//    public static boolean pertenece(Articulo art) {  //es static porque es PRUEBA en main
//        return lista.contains(art);
//    }
    public static boolean pertenece(Articulo a){
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

    public static void añadirArticulo(Articulo art) {
        if (!pertenece(art)) {
            lista.add(art);
        } else {
            System.out.println("Este articulo ya existe"); //JOptionPanel
        }
    }

    public static Articulo buscarArticulo(int codigo) {   //TERMINAR METODO BUSCAR ARTICULO Y SACAR EL STATIC
     
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo() == codigo) { 
                return lista.get(i);
            }
            
        }
        return null;
    }

    @Override
    public String toString() {
        return "Producto{" + '}';
    }

}
