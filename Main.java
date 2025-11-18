import javax.swing.JFileChooser;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Tommaso Bistocchi
 * @version 1.0
 * @see Cavallo
 */
public class Main {

    public static void main(String[] args) {

        // === SCELTA DEL FILE DI OUTPUT (semplice) ===
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Scegli il file in cui salvare l'output");

        File outputFile;
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            outputFile = chooser.getSelectedFile();
        } else {
            outputFile = new File("risultato_gara.txt");  // fallback semplice
        }

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Inserisci la lunghezza del percorso (in metri): ");
        int lunghezzaPercorso = input.nextInt();
        input.nextLine();

        ArrayList<Cavallo> cavalli = new ArrayList<>();
        cavalli.add(new Cavallo("moscio "));
        cavalli.add(new Cavallo("anto"));
        cavalli.add(new Cavallo("todo"));
        cavalli.add(new Cavallo("cassio"));
        cavalli.add(new Cavallo("bisto"));

        boolean garaFinita = false;
        int passo = 5;

        // === STREAM INCAPSULANTI (FileOutputStream + BufferedOutputStream) ===
        try (FileOutputStream fos = new FileOutputStream(outputFile);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            bos.write("--- INIZIO GARA ---\n\n".getBytes());
            System.out.println("\n--- INIZIO GARA ---");
