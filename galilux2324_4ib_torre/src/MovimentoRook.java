/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Kieltomss
 */ 
import java.util.Scanner;

public class MovimentoRook extends ScacchieraRook { // Estende la classe ScacchieraRook

    private String movimenti = ""; // Stringa per memorizzare i movimenti effettuati
    private int numeroMossaBianco = 1; // Contatore delle mosse del giocatore bianco
    private int numeroMossaNero = 1; // Contatore delle mosse del giocatore nero

    public void effettuaMossa(boolean turnoBianco) { // Metodo per effettuare una mossa
        Scanner scanner = new Scanner(System.in); // Oggetto Scanner per l'input
        char simboloPezzo = turnoBianco ? 'R' : 'r'; // Simbolo del pezzo in base al turno
        String colorePezzo = turnoBianco ? "Bianco" : "Nero"; // Colore del pezzo in base al turno

     System.out.println("Guida per l'inserimento delle mosse:");
    System.out.println("- Inserisci la mossa nel formato 'PosizioneIniziale - PosizioneFinale'.");
    System.out.println("- Esempio: Se vuoi come prima mossa puoi spostare la torre in A1 alla posizione A3, per farlo devi inserire 'A1-A3'.");
    System.out.println("Nota: Ricordati che la torre può muoversi solamente in orizzontale e in verticale");
    System.out.println("Nota: Per inserire le mosse devi usare solamente le lettere maiuscole");

        while (true) { // Loop finché non viene inserita una mossa valida
            System.out.println("Turno del giocatore " + colorePezzo + " '"+simboloPezzo+"'"); // Visualizza il turno e il pezzo
            System.out.println("Inserisci la mossa del rook"); // Prompt per l'input
            System.out.println("Formato mossa (PosizioneIniziale - PosizioneFinale):");
            System.out.println("N.B il '-' e' obbligatorio,Non e Case Sensitive");
            String mossa = scanner.nextLine(); // Leggi la mossa dall'input

            String[] coordinate = mossa.split("-"); // Dividi la stringa di input per ottenere le coordinate di partenza e di destinazione
            int fromRow = Character.getNumericValue(coordinate[0].charAt(1)) - 1; // Converti la riga di partenza in numero e inverti la conversione (gli indici partono da 0)
            int fromCol = coordinate[0].charAt(0) - 'A'; // Converti la colonna di partenza nel corrispondente indice (da A a H)
            int toRow = Character.getNumericValue(coordinate[1].charAt(1)) - 1; // Converti la riga di destinazione in numero e inverti la conversione
            int toCol = coordinate[1].charAt(0) - 'A'; // Converti la colonna di destinazione nel corrispondente indice

            char pezzoMuovendosi = getPezzo(fromRow, fromCol); // Ottieni il pezzo nella casella di partenza

            // Controllo se la casella di partenza contiene una pedina del colore corretto
            if ((turnoBianco && pezzoMuovendosi == 'R') || (!turnoBianco && pezzoMuovendosi == 'r')) {
                if (pezzoMuovendosi != '-') { // Verifica se la casella di partenza non è vuota
                    char pezzoSpostandosi = getPezzo(toRow, toCol); // Ottieni il pezzo nella casella di destinazione
                    // Controlla se la casella di destinazione è vuota o contiene una pedina di colore opposto
                    if (pezzoSpostandosi == '-' || (turnoBianco && Character.toUpperCase(pezzoSpostandosi) != 'R') || (!turnoBianco && Character.toUpperCase(pezzoSpostandosi) != 'R')) {
                        if (isValidMove(fromRow, fromCol, toRow, toCol)) { // Verifica se la mossa è valida
                            setPezzo(toRow, toCol, pezzoMuovendosi); // Sposta il pezzo nella casella di destinazione
                            setPezzo(fromRow, fromCol, '-'); // Svuota la casella di partenza
                            String mossaNotazione = String.valueOf(simboloPezzo) + (char) ('A' + fromCol) + (fromRow + 1) + " " +
                                                    String.valueOf(simboloPezzo) + (char) ('A' + toCol) + (toRow + 1);
                            String mossaLog = mossaNotazione + " " + (turnoBianco ? "Bianco" : "Nero"); // Aggiungi il colore del giocatore alla notazione
                            movimenti += mossaLog + "\n"; // Aggiungi la mossa ai movimenti registrati
                            stampaScacchieraConPezzi(); // Stampare la scacchiera con i pezzi dopo la mossa
                            break; // Esci dal loop se la mossa è valida e completa
                        } else {
                            System.out.println("Mossa non valida: la torre si può muovere solo in orizzontale o verticale."); // Avviso per mossa non valida
                        }
                    } else {
                        System.out.println("Mossa non valida: non puoi muovere il pezzo su una pedina dello stesso colore o avversaria."); // Avviso per mossa non valida
                    }
                } else {
                    System.out.println("Mossa non valida: non puoi muovere una casella vuota."); // Avviso per mossa non valida
                }
            } else {
                System.out.println("Non puoi muovere una pedina avversaria."); // Avviso per mossa non valida
            }
        }
    }

    public String getMovimenti() { // Metodo per ottenere i movimenti registrati
        return movimenti; // Ritorna i movimenti
    }

    private boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
       return fromRow == toRow || fromCol == toCol;
    }
}

