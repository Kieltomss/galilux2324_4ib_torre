import java.util.Scanner;

public class MainScacchi {
   
    private static char[][] scacchiera = new char[8][8]; // La schacchiera
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       MovimentoRook m = new MovimentoRook();

        m.inizializzaScacchiera(); // Inizializza la schacchiera
        m.disegnaScacchiera(); // Disegna la schacchiera iniziale
        //  boolean turnoBianco = true;

        while (true) {
            m.muoviTorre(); // Chiamata per muovere la torre
            m.disegnaScacchiera(); // Disegna la schacchiera dopo ogni mossa
           
        }
    }


}
