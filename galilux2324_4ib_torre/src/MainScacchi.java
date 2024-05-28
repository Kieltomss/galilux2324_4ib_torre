/* 
 * 
 * 
 * @author  Kieltomss 
 * LOG:
 * - Date 0.1: 03.07.2024
 * - Date 0.2: 21.07.2024
 * 
 * 
 * 
 */
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
public class MainScacchi {
    public static void main(String[] args) {
        MovimentoRook m = new MovimentoRook();
        // Set up the initial positions of the rooks on the board
        RookBianco rookBianco = new RookBianco();
        RookNero rookNero = new RookNero();
        Tutorial t = new Tutorial();

        m.setPezzo(0, 0, rookBianco.getSimbolo());
        m.setPezzo(7, 0, rookNero.getSimbolo());
        m.setPezzo(0, 7, rookBianco.getSimbolo());
        m.setPezzo(7, 7, rookNero.getSimbolo());

        
        t.eseguiTutorial();
        //Scacchiera Iniziale
        m.stampaScacchieraConPezzi();

        //Gioco
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