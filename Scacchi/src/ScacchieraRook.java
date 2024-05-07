/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kieltomss
 */
public class ScacchieraRook {
    private static char[][] scacchiera = new char[8][8];

    // Disegna la scacchiera corrente
    public static void disegnaScacchiera() {
        // Stampa le pedine in base alla loro posizione sulla scacchiera
        for (int riga = 7; riga >= 0; riga--) {
            System.out.print((riga + 1) + "-");
            for (char colonna = 'A'; colonna <= 'H'; colonna++) {
                char pezzo = getPezzo(riga, convertiColonna(colonna));
                System.out.print(pezzo + " ");
            }
            System.out.println();
        }

        // Stampa le lettere delle colonne sotto i numeri delle righe
        System.out.println("  A B C D E F G H");
    }

    // Restituisce il pezzo sulla scacchiera in base alle coordinate riga e colonna
    public static char getPezzo(int riga, int colonna) {
        return scacchiera[riga][colonna];
    }

    // Imposta il pezzo sulla scacchiera in base alle coordinate riga e colonna
    public static void setPezzo(int riga, int colonna, char pezzo) {
        scacchiera[riga][colonna] = pezzo;
    }

    // Stampa la scacchiera con i pezzi e le lettere delle colonne sotto i numeri delle righe
    public static void stampaScacchieraConPezzi() {
        // Stampa le pedine in base alla loro posizione sulla scacchiera
        for (int riga = 7; riga >= 0; riga--) {
            System.out.print((riga + 1) + " ");
            for (char colonna = 'A'; colonna <= 'H'; colonna++) {
                char pezzo = getPezzo(riga, convertiColonna(colonna));
                System.out.print(pezzo + "  ");
            }
            System.out.println();
        }

        // Stampa le lettere delle colonne sotto i numeri delle righe
        System.out.println("   A B C D E F G H");
    }

    // Converte il carattere della riga nella sua corrispondente coordinata
    public static int convertiRiga(char riga) {
        return Character.getNumericValue(riga) - 1;
    }

    // Converte il carattere della colonna nella sua corrispondente coordinata
    public static int convertiColonna(char colonna) {
        return colonna - 'A';
    }
}
