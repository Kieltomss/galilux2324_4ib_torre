/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 4INFB
 */
public class ScacchieraRook {
     static char[][] scacchiera = new char[8][8];
     public static void inizializzaScacchiera() {
        for (int riga = 0; riga < 8; riga++) {
            for (int colonna = 0; colonna < 8; colonna++) {
                scacchiera[riga][colonna] = ' ';
            }
        }
        // Posizione iniziale della torre
        scacchiera[0][0] = 'T'; // Per esempio, la torre si trova in A1
    }

    // Disegna la schacchiera corrente
    public static void disegnaScacchiera() {
        for (int riga = 7; riga >= 0; riga--) {
            System.out.print((riga + 1) + " ");
            for (int colonna = 0; colonna < 8; colonna++) {
                System.out.print(scacchiera[riga][colonna] + " ");
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");
    }
}
