import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        // Añadir elementos al final de la lista
        lista.add("Manzana");
        lista.add("Platano");
        lista.add("Naranja");

        // Añadir en una posición específica
        lista.add(1,"Pera");

        // Acceder a un elemento específico
        System.out.println("Elemento en el indice: 1 " + lista.get(1));
        System.out.println("Elemento en el indice: 0 " + lista.get(0));
        System.out.println("Elemento en el último " + lista.getLast());

        // Modificar un elemento
        lista.set(2,"Mango");

        // Eliminar elemento por indice
        lista.remove(2);

        // Eliminar por valor
        lista.remove("Naranja");

        // Buscar un valor en la lista
        boolean contiene = lista.contains("Platano");



    }
}
