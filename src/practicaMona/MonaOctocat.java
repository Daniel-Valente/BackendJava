package practicaMona;

public class MonaOctocat {
    public static void main(String[] args) {
        Sentrytocat sentry = new Sentrytocat("Sentrytocat", "bombero");
        sentry.display();

        Yogitocat yogi = new Yogitocat("Yogitocat", "yoga");
        yogi.display();

        Octocat justice = new Justicetocat("Justicetocat");
        justice.actividad();

        Dinotocat dino = new Dinotocat("Dinotocat");
        dino.printColor();

        Octocat film = new Filmtocat("Filmtocat", "peliculas");
        film.actividad();

        new Luchadortocat("Luchadortocat", "mascara").printActividad();
    }
}
