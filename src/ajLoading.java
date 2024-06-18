
// public class ajLoading  {
    
//     public void ajMostrarSpinner() {
//         System.out.println();
//         for (int i = 1; i <= 100; i++) {
//             System.out.print("\r" + i + "% " + (i % 4 == 0 ? "|" : i % 4 == 1 ? "/" : i % 4 == 2 ? "-" : "\\"));
//             try {
//                 Thread.sleep(20);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//         System.out.print(" 100%");
//         System.out.println();
//         System.out.println("ARBOL FILOGENÉTICO :");

//     }
    
    
// }
public class ajLoading {

    // Códigos ANSI para colores
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_CYAN = "\u001B[36m";

    public void ajMostrarSpinner() {
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + i + "% " + (i % 4 == 0 ? ANSI_RED + "|" :
                                                i % 4 == 1 ? ANSI_GREEN + "/" :
                                                i % 4 == 2 ? ANSI_YELLOW + "-" :
                                                ANSI_CYAN + "\\"));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(ANSI_RESET + " 100%");
        System.out.println();
        System.out.println(ANSI_CYAN + "ÁRBOL FILOGENÉTICO:");
    }
}

