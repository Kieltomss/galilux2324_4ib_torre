/*
 * 
 * 
 * @Author Kieltomss
 * 
 * 
 */
import java.io.FileWriter;
import java.io.IOException;
public class FileLog {
    public static void logMovements(String movements) {
        try {
            FileWriter writer = new FileWriter("movimenti.txt");
            String[] moves = movements.split("\n");

            for (int i = 0; i < moves.length; i++) {
                String move = moves[i];
                String notation = getMoveNotation(move.charAt(0), move.charAt(1), move.charAt(3), move.charAt(4));
                writer.write((i + 1) + ". " + notation + "\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file di log: " + e.getMessage());
        }
    }

    private static String getMoveNotation(char fromCol, char fromRow, char toCol, char toRow) {
        String fromSquare = getSquareNotation(fromCol, fromRow);
        String toSquare = getSquareNotation(toCol, toRow);
        return fromSquare + toSquare;
    }

    private static String getSquareNotation(char col, char row) {
        int column = col - 'A' + 1;
        int rowNumber = 8 - (row - '1');
        return String.valueOf(column) + String.valueOf(rowNumber);
    }
}