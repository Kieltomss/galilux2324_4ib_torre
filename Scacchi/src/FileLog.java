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
    private String fileName;

    public FileLog(String fileName) {
        this.fileName = fileName;
    }

    public void logMovements(String movements) {
        try {
            FileWriter writer = new FileWriter(fileName);
            String[] moves = movements.split("\n");
    
            int numeroMossa = 1;
            for (int i = 0; i < moves.length; i += 2) {
                String moveBianco = moves[i];
                String moveNero = "";
    
                // Se ci sono ancora mosse nere, prendi il loro movimento
                if (i + 1 < moves.length) {
                    moveNero = moves[i + 1];
                }
    
                String[] partsBianco = moveBianco.split(" ");
                String notationBianco = partsBianco[1].toLowerCase(); // Converti la notazione in minuscolo
    
                // Se il pezzo è un Rook, mantieni la R maiuscola
                if (partsBianco[0].equals("R")) {
                    notationBianco = "R" + notationBianco.substring(1);
                }
    
                String notationNero = "";
    
                // Se ci sono mosse nere, prendi la loro notazione
                if (!moveNero.isEmpty()) {
                    String[] partsNero = moveNero.split(" ");
                    notationNero = partsNero[1].toLowerCase(); // Converti la notazione in minuscolo
    
                    // Se il pezzo è un Rook, mantieni la R maiuscola
                    if (partsNero[0].equals("R")) {
                        notationNero = "R" + notationNero.substring(1);
                    }
                }
    
                String notation = numeroMossa + ". " + notationBianco + " " + notationNero;
                writer.write(notation + "\n");
    
                numeroMossa++;
            }
    
            writer.close(); // Chiusura del file di log dopo che tutte le mosse sono state registrate
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file di log: " + e.getMessage());
        }
    }
}