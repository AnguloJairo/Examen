import ajAgnathans.ajHagfishes;
import ajAgnathans.ajHagfishesMutada;
import ajFanerozoico.Hagfishes;

public class ajApp {
    public static void main(String[] args) throws Exception {
        
        ajLoading ajLoading = new ajLoading();
        ajLoading.ajMostrarSpinner();
        Hagfishes hagfishes = new Hagfishes();
        ajHagfishes tortuga = new ajHagfishes("Anguila");
        System.out.println(tortuga.ajgetNombre() + " es una hagfishe");
        System.out.println(tortuga.ajSaludar());
        System.out.println(tortuga.ajSaludarCompaneros());

        // Crear una instancia de TurtleMutada y mutarla

        ajHagfishesMutada animal = new ajHagfishesMutada("Anguila-Angulo"); // Crear instancia del animal mutado
        ajBiologoRuso biologo = new ajBiologoRuso();

        biologo.ejecutarProcesoMutacion(animal);

        //ajHagfishesMutada tortugaMutada = new ajHagfishesMutada("Jario Mutado");
        //ajTanqueMutacion.mutar(tortugaMutada, clave);
    }
}





