import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MercadoFrutas {

    // ====== FASE 1: ENUM ======
    enum Fruta {
        MANZANA, PERA, PLATANO, NARANJA
    }

    public static void main(String[] args) {

        // Fruta favorita
        Fruta frutaEstrella = Fruta.MANZANA;
        System.out.println("Mi fruta estrella es: " + frutaEstrella);

        // ====== FASE 2: LISTA DE CLIENTES ======
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Ana");
        clientes.add("Luis");
        clientes.add("María");
        clientes.add("Carlos");
        clientes.add("Sofía");

        System.out.println("\nLista de clientes:");
        clientes.forEach(System.out::println); // versión moderna

        // Eliminar un cliente
        clientes.remove("Carlos");

        System.out.println("\nLista actualizada de clientes:");
        clientes.forEach(System.out::println);

        // ====== FASE 3: HASHMAP DE VENTAS ======
        HashMap<Fruta, Integer> ventas = new HashMap<>();
        ventas.put(Fruta.MANZANA, 10);
        ventas.put(Fruta.PERA, 5);
        ventas.put(Fruta.PLATANO, 8);

        // Simular ventas
        ventas.put(Fruta.MANZANA, ventas.get(Fruta.MANZANA) + 3); // vendí 3 manzanas más
        ventas.put(Fruta.PERA, ventas.get(Fruta.PERA) - 2);       // error: resto 2 peras

        System.out.println("\nInventario final de ventas:");
        ventas.forEach((fruta, cantidad) ->
                System.out.println(fruta + " → " + cantidad)
        );

        // ====== FASE FINAL: RESUMEN ======
        System.out.println("\n=== RESUMEN DEL MERCADO ===");

        // 1. Frutas disponibles
        System.out.println("\nFrutas disponibles:");
        for (Fruta f : Fruta.values()) {
            System.out.println("- " + f);
        }

        // 2. Clientes atendidos
        System.out.println("\nClientes atendidos:");
        clientes.forEach(cliente -> System.out.println("- " + cliente));

        // 3. Ventas registradas
        System.out.println("\nVentas registradas:");
        ventas.forEach((fruta, cantidad) ->
                System.out.println(fruta + " → " + cantidad)
        );

        // 4. Informe: fruta más vendida y clientes atendidos
        Fruta frutaMasVendida = null;
        int maxVentas = Integer.MIN_VALUE;
        for (Map.Entry<Fruta, Integer> entrada : ventas.entrySet()) {
            if (entrada.getValue() > maxVentas) {
                maxVentas = entrada.getValue();
                frutaMasVendida = entrada.getKey();
            }
        }

        System.out.println("\n📊 Informe:");
        System.out.println("Fruta más vendida: " + frutaMasVendida + " con " + maxVentas + " ventas");
        System.out.println("Clientes atendidos en total: " + clientes.size());
    }
}
