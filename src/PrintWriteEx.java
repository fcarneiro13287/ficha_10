
import java.io.*;

public class PrintWriteEx{
    public static void main(String[] args) {

    File f = new File("data\\resultado.txt");
    try {
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("Escrevendo em um ficheiro de texto.");
        pw.close();
    } catch(IOException ioe){
        System.out.println("IO Exception");}
    }

}
