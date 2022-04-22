package practicaMona;

class Octocat {
    String nombre;
    String color = "negro";


    Octocat(String nombre) {
        this.nombre = nombre;
    }

    void actividad() {
        System.out.println("Al octocat " + nombre + " le gusta hacer muchas cosas");
    }
}

