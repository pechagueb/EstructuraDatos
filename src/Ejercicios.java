import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


// Definición del enum
enum Colores {
    ROJO, VERDE, AZUL
}

// Definimos el enum de estados
enum EstadoPedido {
    PENDIENTE, ENVIADO, ENTREGADO
}

class Ejercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -Crear un enum Colores con valores: ROJO, VERDE, AZUL.
        // -Imprimir un mensaje según el color elegido.

        // Mostrar opciones
        System.out.println("Elige un color (ROJO, VERDE, AZUL): ");

        String entrada = sc.nextLine().toUpperCase(); // pasamos a mayúsculas para coincidir con enum

        // Convertir texto a valor del enum
        Colores color = Colores.valueOf(entrada);

        // Mensaje según color
        switch (color) {
            case ROJO -> System.out.println("Has elegido ROJO ❤️");
            case VERDE -> System.out.println("Has elegido VERDE 🍀");
            case AZUL -> System.out.println("Has elegido AZUL 🌊");
        }

        // -Crear un ArrayList<String> para almacenar 5 nombres de alumnos.
        // -Mostrar el tamaño de la lista.
        // -Eliminar un alumno y volver a mostrar los elementos.

        // Crear el ArrayList
        ArrayList<String> alumnos = new ArrayList<>();

        // Agregar 5 nombres
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("María");
        alumnos.add("Carlos");
        alumnos.add("Sofía");

        // Mostrar tamaño de la lista
        System.out.println("Número de alumnos: " + alumnos.size());

        // Mostrar todos los alumnos
        System.out.println("Lista de alumnos: " + alumnos);

        // Eliminar un alumno (ej: María)
        alumnos.remove("María");

        // Mostrar de nuevo los elementos
        System.out.println("Después de eliminar a María:");
        System.out.println("Número de alumnos: " + alumnos.size());
        System.out.println("Lista de alumnos: " + alumnos);

        // -Crear un HashMap<String, String> que guarde palabra → traducción en inglés.
        // -Permitir buscar la traducción de una palabra.
        // -Permitir agregar nuevas palabras.

        // Crear el HashMap con palabras iniciales
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");

        // mostrar menu opciones
        int opcion;
        do {
            System.out.println("\n=== DICCIONARIO ESPAÑOL → INGLÉS ===");
            System.out.println("1. Buscar traducción");
            System.out.println("2. Agregar palabra");
            System.out.println("3. Mostrar todas las palabras");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce una palabra en español: ");
                    String palabra = sc.nextLine().toLowerCase();
                    if (diccionario.containsKey(palabra)) {
                        System.out.println("Traducción: " + diccionario.get(palabra));
                    } else {
                        System.out.println("❌ La palabra no está en el diccionario.");
                    }
                }
                case 2 -> {
                    System.out.print("Introduce la palabra en español: ");
                    String esp = sc.nextLine().toLowerCase();
                    System.out.print("Introduce la traducción en inglés: ");
                    String eng = sc.nextLine().toLowerCase();
                    diccionario.put(esp, eng);
                    System.out.println("✅ Palabra añadida.");
                }
                case 3 -> {
                    System.out.println("Palabras en el diccionario:");
                    for (String clave : diccionario.keySet()) {
                        System.out.println(clave + " → " + diccionario.get(clave));
                    }
                }
                case 0 -> System.out.println("👋 Saliendo del diccionario...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);

        // enum EstadoPedido { PENDIENTE, ENVIADO, ENTREGADO }.
        // Lista de pedidos (ArrayList<String>).
        // HashMap que guarde pedido → estado.
        // Imprimir un resumen: qué pedidos están pendientes, enviados o entregados.

        // Lista de pedidos
        ArrayList<String> pedidos = new ArrayList<>();
        pedidos.add("Pedido1");
        pedidos.add("Pedido2");
        pedidos.add("Pedido3");
        pedidos.add("Pedido4");

        // HashMap para guardar el estado de cada pedido
        HashMap<String, EstadoPedido> estados = new HashMap<>();
        estados.put("Pedido1", EstadoPedido.PENDIENTE);
        estados.put("Pedido2", EstadoPedido.ENVIADO);
        estados.put("Pedido3", EstadoPedido.ENTREGADO);
        estados.put("Pedido4", EstadoPedido.PENDIENTE);

        // Imprimir resumen
        System.out.println("=== RESUMEN DE PEDIDOS ===");
        System.out.println("\n📦 Pendientes:");
        for (String pedido : pedidos) {
            if (estados.get(pedido) == EstadoPedido.PENDIENTE) {
                System.out.println(" - " + pedido);
            }
        }

        System.out.println("\n🚚 Enviados:");
        for (String pedido : pedidos) {
            if (estados.get(pedido) == EstadoPedido.ENVIADO) {
                System.out.println(" - " + pedido);
            }
        }

        System.out.println("\n✅ Entregados:");
        for (String pedido : pedidos) {
            if (estados.get(pedido) == EstadoPedido.ENTREGADO) {
                System.out.println(" - " + pedido);
            }
        }

    }
}
