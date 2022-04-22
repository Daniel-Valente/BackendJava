package practicaMona;

public class Yogitocat extends Octocat {
    String actividad;

    Yogitocat(String nombre, String actividad) {
        super(nombre);
        this.actividad = actividad;
    }

    void display() {
        System.out.println("La actividad favorita de " + nombre + " es la " + actividad);
    }
}
