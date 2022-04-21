package practicaHarry;

public class Mago {
    // Caracteristicas
    private String casa ,genero, nombre, borggart, patronus;

    public String getCasa() {  return casa;  }
    public String getGenero() {  return genero;  }
    public String getNombre() {  return nombre;  }
    public String getBorggart() {  return borggart;  }
    public String getPatronus() {  return patronus;  }

    public  boolean setCasa(String casa) {
        if(!casa.isEmpty()) {
            this.casa = casa;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero) {
        if(!genero.isEmpty()) {
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setBorggart(String borggart) {
        if(!borggart.isEmpty()) {
            this.borggart = borggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if(!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public String printMago() {
        return "Nombre: " + nombre + "\n" +
                "Genero: " + genero + "\n" +
                "Casa: " + casa + "\n" +
                "Borggart: " + borggart + "\n" +
                "Patronus: " + patronus;
    }
}
