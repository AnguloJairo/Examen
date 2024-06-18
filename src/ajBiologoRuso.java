// public class BiologoRuso {
//     private String clave;

//     public String getClave() {
//         return clave;
//     }

//     public void setClave(String clave) {
//         this.clave = clave;
//     }
    
// }
import ajAgnathans.ajHagfishesMutada;
import java.util.Scanner;

public class ajBiologoRuso {
    private String clave;

    public void pedirClave() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese clave del tanque de Mutacion (o 'salir' para salir): ");
        clave = scanner.nextLine();
    }

    public String getClave() {
        return clave;
    }

    public boolean verificarClave() {
        return ajTanqueMutacion.ingresarClave(clave);
    }

    public void realizarMutacion(ajHagfishesMutada animal) {
        if (verificarClave()) {
            ajTanqueMutacion.mutar(animal, clave);
        }
    }

    public void ejecutarProcesoMutacion(ajHagfishesMutada animal) {
        do {
            pedirClave();
            if ("salir".equalsIgnoreCase(getClave())) {
                System.out.println("Saliendo del programa...");
                return;
            }
        } while (!verificarClave());

        realizarMutacion(animal);
    }
}
