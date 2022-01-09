import java.io.*;
import java.util.*;

public class LerFicheiros {
    public static void main (String arg[]) {
        File file = new File ("C:\\Users\\Francis\\Documents\\TeSP\\2021_2022\\3_semestre\\Programacao_II_Valeria_Pequeno\\exercicio\\ficha_10\\tempos.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                //double num = scanner.nextDouble();
                //System.out.println ("Numero inteiro: " +num);
                System.out.println (scanner.next());
            }
        } catch (InputMismatchException e) {
            System.out.println ("Mismatch exception:" + e);
        } catch (FileNotFoundException e) {
            System.out.println ("Ficheiro não encontrado!");
            System.exit (0); } }
}
