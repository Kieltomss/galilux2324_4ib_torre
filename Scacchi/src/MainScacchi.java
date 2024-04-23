/* 
 * 
 * 
 * @author  Kieltomss 
 * LOG:
 * - Date 0.1: 03.07.2024
 * 
 * 
 */
import java.util.Scanner;

public class MainScacchi {
    public static void main(String[] args) {
        MovimentoRook m = new MovimentoRook();
        // Set up the initial positions of the rooks on the board
        RookBianco rookBianco = new RookBianco();
        RookNero rookNero = new RookNero();

        m.setPezzo(0, 0, rookBianco.getSimbolo());
        m.setPezzo(7, 0, rookNero.getSimbolo());


        // Display the initial board
        m.stampaScacchieraConPezzi();

        // Let the game begin
        Scanner scanner = new Scanner(System.in);
        boolean turnoBianco = true;
        boolean continuaGioco = true;
        while (continuaGioco) {
            m.effettuaMossa(turnoBianco);
            System.out.println("Vuoi continuare il gioco? (s/n):");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("n")) {
                continuaGioco = false;
            }
            turnoBianco = !turnoBianco; // Cambia il turno dopo ogni mossa
        }

        // Log all movements to FileLog
        FileLog fileLog = new FileLog("movimenti.txt");
        fileLog.logMovements(m.getMovimenti());
    }
}