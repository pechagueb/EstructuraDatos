import java.util.HashMap;
import java.util.Map;


class AlumnosNotas {

    public static void main(String[] args) {

        // Crear un HashMap para almacenar notas de alumnos
        Map<String, Double> notasAlumnos = new HashMap<>();

        // Agregar datos al HashMap
        notasAlumnos.put("Juan", 8.5);
        notasAlumnos.put("María", 9.0);
        notasAlumnos.put("Pedro", 7.5);
        notasAlumnos.put("Luisa", 8.0);
        notasAlumnos.put("Ana", 9.5);

        // Acceder a las notas de los alumnos
        double notaMaria = notasAlumnos.get("María");
        double notaPedro = notasAlumnos.get("Pedro");

        System.out.println("La nota de María es: " + notaMaria);
        System.out.println("La nota de Pedro es: " + notaPedro);

        // Modificar la nota de un alumno
        notasAlumnos.put("Pedro", 8.2); // Actualizamos la nota de Pedro

        // Imprimir todas las notas de los alumnos
        System.out.println("Notas de los alumnos:");

        for (Map.Entry<String, Double> entry : notasAlumnos.entrySet()) {
            String nombre = entry.getKey();
            double nota = entry.getValue();
            System.out.println(nombre + ": " + nota);
        }

        // Ver si existe un elemento
        System.out.println("Contiene 'Carlos'? " + notasAlumnos.containsKey("Carlos") );
    }
}
