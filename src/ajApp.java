import ajAgnathans.ajHagfishes;
import ajAgnathans.ajHagfishesMutada;
import ajFanerozoico.Hagfishes;

public class ajApp {
    public static void main(String[] args) throws Exception {
        
        ajLoading ajLoading = new ajLoading();
        ajLoading.ajMostrarSpinner();
        Hagfishes hagfishes = new Hagfishes();
        ajHagfishes tortuga = new ajHagfishes("Anguila");
        System.out.println(tortuga.ecgetNombre() + " es una hagfishe");
        System.out.println(tortuga.ecSaludar());
        System.out.println(tortuga.ecSaludarCompaneros());

        // Crear una instancia de TurtleMutada y mutarla
        ajHagfishesMutada tortugaMutada = new ajHagfishesMutada("Jario Mutado");
        ajTanqueMutacion.mutar(tortugaMutada);
    }
}





