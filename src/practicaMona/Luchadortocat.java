package practicaMona;

public class Luchadortocat extends Octocat {
    String color = "verde azulado";
    String accesorio;

    Luchadortocat(String nombre, String accesorio) {
        super(nombre);
        this.accesorio = accesorio;
    }

    void printActividad() {
        System.out.println("El color por defecto de Octocat es " + super.color + " y no usa accesorios");
        System.out.println("El color del traje de " + nombre + " es " + color + " y siempre le gusta usar como accesorio una " + accesorio);

    }
}
