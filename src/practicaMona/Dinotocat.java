package practicaMona;

public class Dinotocat extends Octocat {
    String color = "verde";

    Dinotocat(String nombre) {
        super(nombre);
    }

    void printColor() {
        System.out.println("El color por defecto de Octocat es " + super.color);
        System.out.println("El color del traje de " + nombre + " es " + color);
    }

}
