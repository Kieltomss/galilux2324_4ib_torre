/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
import java.util.Scanner;

public class MainScacchi {
   
    private static char[][] scacchiera = new char[8][8]; // La schacchiera
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inizializzaScacchiera(); // Inizializza la schacchiera
        disegnaScacchiera(); // Disegna la schacchiera iniziale
          boolean turnoBianco = true;

        while (true) {
           // char giocatoreCorrente = turnoBianco ? 'B' : 'N'; //GESTIONE BIANCO NERO(PER ADESSO NON VA)
            //System.out.println("Turno del giocatore " + (turnoBianco ? "bianco" : "nero"));

            // Implementa qui la logica per la mossa della pedina
            // ad esempio, puoi richiamare una funzione muoviPedina() con i parametri necessari
            muoviTorre(); // Chiamata per muovere la torre
            disegnaScacchiera(); // Disegna la schacchiera dopo ogni mossa
            // Fai avanzare il turno al prossimo giocatore
           // turnoBianco = !turnoBianco;
        
       
        }
    }

    // Inizializza la schacchiera con le posizioni iniziali
    private static void inizializzaScacchiera() {
        for (int riga = 0; riga < 8; riga++) {
            for (int colonna = 0; colonna < 8; colonna++) {
                scacchiera[riga][colonna] = ' ';
            }
        }
        // Posizione iniziale della torre
        scacchiera[0][0] = 'T'; // Per esempio, la torre si trova in A1
    }

    // Disegna la schacchiera corrente
    private static void disegnaScacchiera() {
        for (int riga = 7; riga >= 0; riga--) {
            System.out.print((riga + 1) + " ");
            for (int colonna = 0; colonna < 8; colonna++) {
                System.out.print(scacchiera[riga][colonna] + " ");
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");
    }

    // Muove la torre sulla schacchiera
        private static void muoviTorre() {
         System.out.println("Inserisci la mossa della torre (es. A1-B1): ");
         String mossa = scanner.nextLine();
         String[] coordinate = mossa.split("-");
         String from = coordinate[0];
         String to = coordinate[1];

         int fromRow = Character.getNumericValue(from.charAt(1)) - 1; // Inverti la conversione delle righe
         int fromCol = from.charAt(0) - 'A'; // Colonne vengono rappresentate da A a H
         int toRow = Character.getNumericValue(to.charAt(1)) - 1; // Inverti la conversione delle righe
         int toCol = to.charAt(0) - 'A';

         // Controllo se la mossa è valida per la torre
         if (isValidTorreMove(fromRow, fromCol, toRow, toCol)) {
             scacchiera[toRow][toCol] = 'T'; // Muovo la torre alla nuova posizione
             scacchiera[fromRow][fromCol] = '-'; // Cancello la posizione precedente
         } else {
             System.out.println("Mossa non valida per la torre!");
         }
     }

    // Controlla se la mossa è valida per la torre
    private static boolean isValidTorreMove(int fromRow, int fromCol, int toRow, int toCol) {
        // Controlla se la torre si sta muovendo lungo la stessa riga o colonna
        return fromRow == toRow || fromCol == toCol;
    }
}

    