/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 4INFB
 */
public class MovimentoRook extends ScacchieraRook {
     private static Scanner scanner = new Scanner(System.in);
    
     
    // Muove la torre sulla schacchiera
        public static void muoviTorre() {
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
    public static boolean isValidTorreMove(int fromRow, int fromCol, int toRow, int toCol) {
        // Controlla se la torre si sta muovendo lungo la stessa riga o colonna
        return fromRow == toRow || fromCol == toCol;
    }
}
