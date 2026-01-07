package ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    //Atributos
    //Lista de productos
    private ArrayList<Producto> productos =  new ArrayList<>();
    //Cantidades Productos
    private ArrayList<Integer> cantidades = new ArrayList<>();


    //Funcionalidades
    public void agregarProducto(Producto producto, int cantidad){
        //Agregamos el producto a la lista
        productos.add(producto);
        //Añadimos la cantidad de producto
        cantidades.add(cantidad);
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
             total += productos.get(i).getPrecio() * cantidades.get(i);
        }
        return total;
    }

    public void eliminarProducto(String nombre){
        for (int i = 0; i < productos.size(); i++) {
            if (nombre.equalsIgnoreCase(productos.get(i).getNombre())){
                productos.remove(i);
                cantidades.remove(i);
                break;
            }
        }
    }

    public void finalizarCompra(){
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cant = cantidades.get(i);
            p.reducirStock(cant);
        }
        //Vaciamos Carrito
        productos.clear();
        cantidades.clear();
    }

    public void mostrarCarrito(){
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cantidad = cantidades.get(i);

            double subtotal = p.getPrecio() * cantidad;

            System.out.println((i+1) + ". " + p.getNombre() + " x" + cantidad + " - " + subtotal + "€");
        }

        System.out.println("Total: " + String.format("%.2f", calcularTotal()) + "€");
    }
}
