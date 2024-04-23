/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Kieltomss
 */ 
import java.util.Scanner;

public class MovimentoRook extends ScacchieraRook {
    private String movimenti = "";
    private int numeroMossaBianco = 1;
    private int numeroMossaNero = 1;


    public void effettuaMossa(boolean turnoBianco) {
        Scanner scanner = new Scanner(System.in);
        char simboloPezzo = turnoBianco ? 'R' : 'r'; // Simbolo del pezzo in base al turno
        String colorePezzo = turnoBianco ? "Bianco" : "Nero"; // Colore del pezzo in base al turno
    
        while (true) {
            System.out.println("Turno del giocatore " + colorePezzo);
            System.out.println("Inserisci la mossa del rook (formato: colonna-riga):");
            String mossa = scanner.nextLine();
    
            String[] coordinate = mossa.split("-");
            int fromRow = Character.getNumericValue(coordinate[0].charAt(1)) - 1; // Inverti la conversione delle righe
            int fromCol = coordinate[0].charAt(0) - 'A'; // Colonne vengono rappresentate da A a H
            int toRow = Character.getNumericValue(coordinate[1].charAt(1)) - 1; // Inverti la conversione delle righe
            int toCol = coordinate[1].charAt(0) - 'A'; // Colonne vengono rappresentate da A a H
    
            char pezzoMuovendosi = getPezzo(fromRow, fromCol);
    
            // Controllo se la casella di partenza contiene una pedina del colore corretto
            if ((turnoBianco && pezzoMuovendosi == 'R') || (!turnoBianco && pezzoMuovendosi == 'r')) {
                if (pezzoMuovendosi != '-') {
                    char pezzoSpostandosi = getPezzo(toRow, toCol);
                    // Controlla se la casella di destinazione è vuota o contiene una pedina di colore opposto
                    if (pezzoSpostandosi == '-' || (turnoBianco && Character.toUpperCase(pezzoSpostandosi) != 'R') || (!turnoBianco && Character.toUpperCase(pezzoSpostandosi) != 'R')) {
                        if (isValidMove(fromRow, fromCol, toRow, toCol)) {
                            setPezzo(toRow, toCol, pezzoMuovendosi);
                            setPezzo(fromRow, fromCol, '-');
                            String mossaNotazione = String.valueOf(simboloPezzo) + (char) ('A' + fromCol) + (fromRow + 1) + " " +
                                                    String.valueOf(simboloPezzo) + (char) ('A' + toCol) + (toRow + 1);
                            String mossaLog = mossaNotazione + " " + (turnoBianco ? "Bianco" : "Nero"); // Aggiungi il colore del giocatore alla notazione
                            movimenti += mossaLog + "\n";
                            stampaScacchieraConPezzi();
                            break; // Esci dal loop se la mossa è valida e completa
                        } else {
                            System.out.println("Mossa non valida: la torre si può muovere solo in orizzontale o verticale.");
                        }
                    } else {
                        System.out.println("Mossa non valida: non puoi muovere il pezzo su una pedina dello stesso colore o avversaria.");
                    }
                } else {
                    System.out.println("Mossa non valida: non puoi muovere una casella vuota.");
                }
            } else {
                System.out.println("Non puoi muovere una pedina avversaria.");
            }
        }
    }
    
    
    
      
    public String getMovimenti() {
        return movimenti;
    }

    private boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // Movimento lungo la stessa riga o la stessa colonna
        return fromRow == toRow || fromCol == toCol;
    }
    
    

}