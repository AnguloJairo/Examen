package ajAgnathans;

public class ajHagfishes {
    private String nombre;


    public ajHagfishes(String nombre) {
        this.nombre = nombre;
    }

    public String ecgetNombre() {
        return nombre;
        
    }

    public void ecsetNombre(String nombre) {
        this.nombre = nombre;

    }

    public String ecSaludar() {
        return nombre + " saluda.";
    }

    public String ecSaludarCompaneros() {
        return nombre + " saluda a sus compañeros.";
    }
}
