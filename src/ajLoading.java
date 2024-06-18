
public class ajLoading  {
    
    public void ajMostrarSpinner() {
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + i + "% " + (i % 4 == 0 ? "|" : i % 4 == 1 ? "/" : i % 4 == 2 ? "-" : "\\"));
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(" 100%");
        System.out.println();
        System.out.println("ARBOL FILOGENÉTICO :");

    }
    
    
}
