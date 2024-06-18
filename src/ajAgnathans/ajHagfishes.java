package ajAgnathans;

public class ajHagfishes {
    private String nombre;


    public ajHagfishes(String nombre) {
        this.nombre = nombre;
    }

    public String ajgetNombre() {
        return nombre;
        
    }

    public void ajsetNombre(String nombre) {
        this.nombre = nombre;

    }

    public String ajSaludar() {
        return nombre + " saluda.";
    }

    public String ajSaludarCompaneros() {
        return nombre + " saluda a sus compañeros.";
    }
}
