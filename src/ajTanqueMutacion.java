

// import ajAgnathans.ajHagfishesMutada;
// import java.util.Random;
// import java.util.Scanner;

// public class ajTanqueMutacion {
//     private static final String CLAVE_CORRECTA = "321mutar";
//     private static final String ANSI_RED = "\u001B[31m";
//     private static final String ANSI_GREEN = "\u001B[32m";
//     private static final String ANSI_YELLOW = "\u001B[33m";
//     private static final String ANSI_CYAN = "\u001B[36m";
//     private static final String ANSI_RESET = "\u001B[0m";

//     public static boolean ingresarClave() {
//         Scanner scanner = new Scanner(System.in);
//         String clave;
//         do {
//             System.out.print(ANSI_YELLOW + "Ingrese clave del tanque de Mutacion: ");
//             clave = scanner.nextLine();
//             if (!CLAVE_CORRECTA.equals(clave)) {
//                 System.out.println(ANSI_RED + "Clave incorrecta. Intente nuevamente.");
//             }
//         } while (!CLAVE_CORRECTA.equals(clave));
//         return true;
//     }

//     public void AJBarraPorciento() {
//         int longitudBarra = 20;
//         int porcentaje = 100;
//         int delayMilisegundos = 100;

//         for (int i = 0; i <= porcentaje; i++) {
//             int caracteresLlenos = (i * longitudBarra) / 100;
//             mostrarBarraDeProgreso(caracteresLlenos, longitudBarra);
//             try {
//                 Thread.sleep(delayMilisegundos);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//         System.out.println(); // Salto de línea al finalizar la barra de progreso
//     }

//     private static void mostrarBarraDeProgreso(int caracteresLlenos, int longitudBarra) {
//         System.out.print(ANSI_CYAN + "[");
//         for (int i = 0; i < longitudBarra; i++) {
//             if (i < caracteresLlenos) {
//                 if (i == caracteresLlenos - 1) {
//                     System.out.print(ANSI_GREEN + ">");
//                 } else {
//                     System.out.print(ANSI_GREEN + "=");
//                 }
//             } else {
//                 System.out.print(" ");
//             }
//         }
//         System.out.print(ANSI_CYAN + "] " + caracteresLlenos * 5 + "%" + ANSI_RESET + "\r");
//     }

//     public static void mutar(ajHagfishesMutada animal) {
//         if (ingresarClave()) {
//             Random random = new Random();
//             int radiacion = random.nextInt(901) + 100; // Genera un número entre 100 y 1000
//             System.out.println(ANSI_RED + animal.ecSaludar() + " está en proceso de mutación:");
//             System.out.println(ANSI_YELLOW + "Irradiando:");
//             ajTanqueMutacion oLoading5 = new ajTanqueMutacion();
//             oLoading5.AJBarraPorciento();
//             System.out.println();
//             System.out.println(ANSI_YELLOW + "Radiación aplicada: " + ANSI_RED + radiacion + " mSv" + ANSI_RESET);
//         }
//     }
// }
import ajAgnathans.ajHagfishesMutada;
import java.util.Random;

public class ajTanqueMutacion {
    private static final String CLAVE_CORRECTA = "321mutar";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static boolean ingresarClave(String clave) {
        if (!CLAVE_CORRECTA.equals(clave)) {
            System.out.println(ANSI_RED + "Clave incorrecta. Intente nuevamente.");
            return false;
        }
        return true;
    }

    public static void AJBarraPorciento() {
        int longitudBarra = 20;
        int porcentaje = 100;
        int delayMilisegundos = 100;

        for (int i = 0; i <= porcentaje; i++) {
            int caracteresLlenos = (i * longitudBarra) / 100;
            mostrarBarraDeProgreso(caracteresLlenos, longitudBarra);
            try {
                Thread.sleep(delayMilisegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Salto de línea al finalizar la barra de progreso
    }

    private static void mostrarBarraDeProgreso(int caracteresLlenos, int longitudBarra) {
        System.out.print(ANSI_CYAN + "[");
        for (int i = 0; i < longitudBarra; i++) {
            if (i < caracteresLlenos) {
                if (i == caracteresLlenos - 1) {
                    System.out.print(ANSI_GREEN + ">");
                } else {
                    System.out.print(ANSI_GREEN + "=");
                }
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(ANSI_CYAN + "] " + caracteresLlenos * 5 + "%" + ANSI_RESET + "\r");
    }

    public static void mutar(ajHagfishesMutada animal, String clave) {
        if (ingresarClave(clave)) {
            Random random = new Random();
            int radiacion = random.nextInt(901) + 100; // Genera un número entre 100 y 1000
            System.out.println(ANSI_RED + animal.ajSaludar() + " está en proceso de mutación:");
            System.out.println(ANSI_YELLOW + "Irradiando:");
            AJBarraPorciento();
            System.out.println();
            System.out.println(ANSI_YELLOW + "Radiación aplicada: " + ANSI_RED + radiacion + " mSv" + ANSI_RESET);
        }
    }
}
