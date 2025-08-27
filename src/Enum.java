enum diaSemana{
    Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo;

    public boolean esFinde() {
        return this == Sabado || this == Domingo;
    }
}

public class Enum {

    public static void main(String[] args) {

        diaSemana hoy = diaSemana.Miercoles;
        System.out.println("Hoy es: " + hoy);
        System.out.println("¿Es fin de semana? " + ((hoy.esFinde()) ? "Si" : "No"));

    }
}
