package practicaMona;

public class Sentrytocat extends Octocat {
    String vestuario;

    Sentrytocat(String nombre, String vestuario) {
        super(nombre);
        this.vestuario = vestuario;
    }

    void display() {
        System.out.println(nombre + " " + vestuario);
    }
}
