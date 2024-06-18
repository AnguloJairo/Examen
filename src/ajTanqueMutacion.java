import ajAgnathans.ajHagfishesMutada;
import java.util.Random;
import java.util.Scanner;

public class ajTanqueMutacion {
    private static final String CLAVE_CORRECTA = "321mutar";
    final static String ANSI_RED = "\u001B[31m";
    final String ANSI_RESET = "\u001B[0m";
    public static boolean ingresarClave() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String clave;
        do {
            System.out.print(ANSI_RED+ "Ingrese clave del tanque de Mutacion: ");
            clave = scanner.nextLine();
            if (!CLAVE_CORRECTA.equals(clave)) {
                System.out.println(ANSI_RED+"Clave incorrecta. Intente nuevamente.");
            }
        } while (!CLAVE_CORRECTA.equals(clave));
        return true;
    }
    public void AJBarraPorciento(){
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
        }
        private static void mostrarBarraDeProgreso(int caracteresLlenos, int longitudBarra) {
            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i < caracteresLlenos) {
                    if (i == caracteresLlenos - 1) {
                        System.out.print(">");
                    } else {
                        System.out.print("=");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + caracteresLlenos * 5 + "%\r");
        }

    public static void mutar(ajHagfishesMutada animal) {
        if (ingresarClave()) {
            Random random = new Random();
            int radiacion = random.nextInt(901) + 100; // Genera un número entre 100 y 1000
            System.out.println(ANSI_RED+ animal.ecSaludar() + " está en proceso de mutación:");
            System.out.println(ANSI_RED+ "Irradiando:");
            ajTanqueMutacion oLoading5 = new ajTanqueMutacion();
            oLoading5.AJBarraPorciento();
            System.out.println();
            System.out.println(ANSI_RED+ "Radiación aplicada: " + radiacion + " mSv");
        }
    }
}
