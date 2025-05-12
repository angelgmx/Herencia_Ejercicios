package productos;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorProductos {
     /*
     Esta clase no debe tener statics ya que son funciones que va a usar cada objeto y no queremos llamarlo desde
     fuera.
     Esta clase se va a encagar de gestionar los productos en el Main principal
      */

    // Creamos un array list donde vamos a guardar los productos
    private ArrayList<Producto> listProductos = new ArrayList<>();

    // esta función agrega el producto al arraylist
    public void agregarProducto(Producto producto) {
        listProductos.add(producto);
    }

    // Eliminar un producto en una posición específica
    public void eliminarProductos(int indice) {

        // Primero hacemos las comprobaciones
        //Todo: Si es mayor que 0
        //Todo: si no es menor que el tamaño de la lista

        if (indice > 0 && indice < listProductos.size()) { //.size para sacar el tamaño de un arraylist
            listProductos.remove(indice);
        }
    }
    // Añadir un producto en una posición específica
    //todo: necesito el indice donde quiero añadir el producto
    //todo: necesito el producto que quiero añadir

    public void insertarProducto(int indice, Producto producto){
        if (indice > 0 && indice < listProductos.size()) {
            listProductos.add(indice, producto);
        }
    }

    // mirar como funciona el iterator
    public void mostrarProductos() {
        Iterator<Producto> it = listProductos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void eliminarTodos() {
        listProductos.clear();
    }

    public int obtenerTamano() {
        return listProductos.size();
    }

}
