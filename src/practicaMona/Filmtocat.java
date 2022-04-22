package practicaMona;

public class Filmtocat extends Octocat {
    String gustos;

    Filmtocat(String nombre, String gustos) {
        super(nombre);
        this.gustos = gustos;
    }

    @Override
    void actividad() {
        System.out.println("A este" + nombre + " le gusta mucho ver " + gustos);
    }
}
