package practicaHarry;

public class PresentacionMagos {
    public static void main(String[] args) {
        primerMago();
        segundoMago();
        tercerMago();
        cuartoMago();
        quintoMago();
    }

    public static void primerMago() {
        Mago harry = new Mago();

        harry.setNombre("Harry James Potter");
        harry.setGenero("Masculino");
        harry.setCasa("Gryffindor");
        harry.setBorggart("Dementor");
        harry.setPatronus("Ciervo");

        String msg = "Mago: ";
        msg += "\nNombre: " + harry.getNombre();
        msg += "\nGenero: " + harry.getGenero();
        msg += "\nCasa: " + harry.getCasa();
        msg += "\nBorggart: " + harry.getBorggart();
        msg += "\nPatronus: " + harry.getPatronus() + "\n\n";

        System.out.print(msg);
    }

    public static void segundoMago() {
        Mago tom = new Mago();

        tom.setNombre("Tom Sorvolo Ryddle");
        tom.setGenero("Masculino");
        tom.setCasa("Slytherin");
        tom.setBorggart("Su propia muerte");
        tom.setPatronus("Inexistente");

        String msg = "Mago: ";
        msg += "\nNombre: " + tom.getNombre();
        msg += "\nGenero: " + tom.getGenero();
        msg += "\nCasa: " + tom.getCasa();
        msg += "\nBorggart: " + tom.getBorggart();
        msg += "\nPatronus: " + tom.getPatronus() + "\n\n";

        System.out.print(msg);
    }

    public static void tercerMago() {
        Mago albus = new Mago();

        albus.setNombre("Albus Percival Wulfric Brian Dumbledore");
        albus.setGenero("Masculino");
        albus.setCasa("Gryffindor");
        albus.setBorggart("El cuerpo de su hermana");
        albus.setPatronus("Fenix");

        String msg = "Mago: ";
        msg += "\nNombre: " + albus.getNombre();
        msg += "\nGenero: " + albus.getGenero();
        msg += "\nCasa: " + albus.getCasa();
        msg += "\nBorggart: " + albus.getBorggart();
        msg += "\nPatronus: " + albus.getPatronus() + "\n\n";

        System.out.print(msg);
    }

    public static void cuartoMago() {
        Mago luna = new Mago();

        luna.setNombre("Luna Lovegood");
        luna.setGenero("Femenino");
        luna.setCasa("Ravenclaw");
        luna.setBorggart("Ver morir a su padre");
        luna.setPatronus("Liebre");

        String msg = "Mago: ";
        msg += "\nNombre: " + luna.getNombre();
        msg += "\nGenero: " + luna.getGenero();
        msg += "\nCasa: " + luna.getCasa();
        msg += "\nBorggart: " + luna.getBorggart();
        msg += "\nPatronus: " + luna.getPatronus() + "\n\n";

        System.out.print(msg);
    }

    public static void quintoMago() {
        Mago tonks = new Mago();

        tonks.setNombre("Nymphadora Lupin");
        tonks.setGenero("Femenino");
        tonks.setCasa("Hufflepuff");
        tonks.setBorggart("Perder sus habilidades");
        tonks.setPatronus("Lobo");

        String msg = "Mago: ";
        msg += "\nNombre: " + tonks.getNombre();
        msg += "\nGenero: " + tonks.getGenero();
        msg += "\nCasa: " + tonks.getCasa();
        msg += "\nBorggart: " + tonks.getBorggart();
        msg += "\nPatronus: " + tonks.getPatronus();

        System.out.print(msg);
    }
}
