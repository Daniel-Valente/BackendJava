package practicaMona;

public class Justicetocat extends Octocat {

    Justicetocat(String nombre) {
        super(nombre);
    }

    @Override
    void actividad() {
        System.out.println("A este " + nombre +" prefiere la justicia antes que la venganza");
    }
}
