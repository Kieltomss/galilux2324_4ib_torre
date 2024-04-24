import java.util.*;

public class TutorialGiocoScacchi {
    private Scanner scan;
    private char[][] scacchiera;

    public TutorialGiocoScacchi() {
        scan = new Scanner(System.in);
        scacchiera = new char[8][8];
        inizializzaScacchiera();
    }

    public void eseguiTutorial() {
        System.out.println("Vuoi procedere con il tutorial prima di giocare? Si o No?");
        String scelta = scan.nextLine();

        switch (scelta) {
            case "Si":
                System.out.println("Procediamo col tutorial:");
                System.out.println("La partita inizia con quattro Torri, due per colore, ognuna in uno degli angoli della scacchiera.");
                pausa();

                System.out.println("La torre si muove orizzontalmente e verticalmente per il numero di caselle che ha a disposizione.");
                pausa();

                System.out.println("La torre cattura un pezzo dell'avversario tramite l'occupazione della casa su cui si trova il pezzo da catturare.");
                pausa();

                System.out.println("Ora proviamo a muovere la torre sulla scacchiera:");
                disegnaScacchiera();
                muoviTorre();
                break;

            case "No":
                System.out.println("Vuoi uscire dal gioco?");
                String scelta2 = scan.nextLine();
                if (scelta2.equals("Si")) {
                    System.exit(0);
                } else {
                    System.out.println("Ok, procedi pure col gioco :)");
                }
                break;

            default:
                System.out.println("Scelta non valida.");
                break;
        }
    }

    private void inizializzaScacchiera() {
        for (int riga = 0; riga < 8; riga++) {
            for (int colonna = 0; colonna < 8; colonna++) {
                scacchiera[riga][colonna] = ' ';
            }
        }
        scacchiera[0][0] = 'T'; // Posizione iniziale della torre
    }

    private void disegnaScacchiera() {
        for (int riga = 7; riga >= 0; riga--) {
            System.out.print((riga + 1) + " ");
            for (int colonna = 0; colonna < 8; colonna++) {
                System.out.print(scacchiera[riga][colonna] + " ");
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");
    }

    private void muoviTorre() {
        try {
            System.out.println("Inserisci la mossa della torre (es. A1-B1): ");
            String mossa = scan.nextLine().toUpperCase();
            String[] coordinate = mossa.split("-");
            String from = coordinate[0];
            String to = coordinate[1];

            int fromRow = Character.getNumericValue(from.charAt(1)) - 1;
            int fromCol = from.charAt(0) - 'A';
            int toRow = Character.getNumericValue(to.charAt(1)) - 1;
            int toCol = to.charAt(0) - 'A';

            if (isValidTorreMove(fromRow, fromCol, toRow, toCol)) {
                scacchiera[toRow][toCol] = 'T'; // Muovo la torre alla nuova posizione
                scacchiera[fromRow][fromCol] = ' '; // Cancello la posizione precedente
                System.out.println("Mossa eseguita con successo:");
                disegnaScacchiera();
            } else {
                System.out.println("Mossa non valida per la torre!");
            }
        } catch (Exception e) {
            System.out.println("Input non valido. Riprova.");
            scan.nextLine(); // Consuma l'input non valido
            muoviTorre(); // Richiama il metodo ricorsivamente
        }
    }

    private boolean isValidTorreMove(int fromRow, int fromCol, int toRow, int toCol) {
        return fromRow == toRow || fromCol == toCol;
    }

    private void pausa() {
        System.out.println("Premi Invio per continuare...");
        scan.nextLine();
    }

    public static void main(String[] args) {
        TutorialGiocoScacchi tutorial = new TutorialGiocoScacchi();
        tutorial.eseguiTutorial();
    }
}
