import java.io.*;
import java.util.*;

public class LerFicheiros {
    public static void main (String arg[]) {
        File file = new File ("C:\\Users\\fjvmc\\Documents\\Tesp\\3_semestre\\Programacao_II\\exercicio\\ficha10\\tempos.txt");
        float num, maximo=0, minimo=1000, av_num=0;
        int p=0,n=0;
        String nome,sobrenome;
        try {
            Scanner scanner = new Scanner(file);
            scanner.useLocale(Locale.US);
            //System.out.println(scanner.locale().getDisplayCountry());

            while(scanner.hasNext()) {
                p++;
                if (scanner.hasNextFloat() && !scanner.hasNextInt()) {
                    num = scanner.nextFloat();
                    System.out.println ("Numero: " +num);
                    if (maximo<= num){
                        maximo= num;
                    }
                    if (num<=minimo){
                        minimo= num;
                    }
                    av_num= (av_num+num)/2;
                    n++;
                    if (n==5){
                        LerFicheiros escrita = new LerFicheiros();
                        escrita.EscreverFicheiro(maximo,minimo,av_num);
                        maximo=0;
                        minimo=1000;
                        av_num=0;
                        n=0;
                    }
                } else if(scanner.hasNext() && !scanner.hasNextInt()){
                    nome = scanner.next();
                    sobrenome = scanner.next();
                    System.out.println(nome);
                    System.out.println(sobrenome);
                }else{
                    scanner.next();
                }

                //System.out.println (scanner.next());
                //System.out.println(scanner.nextFloat());
            }
        } catch (InputMismatchException e) {
            System.out.println ("Mismatch exception:" + e);
        } catch (FileNotFoundException e) {
            System.out.println ("Ficheiro não encontrado!");
            System.exit (0); }
    }

    public LerFicheiros(){};
    public void EscreverFicheiro(float maximo, float minimo, float av_num){
        File f = new File("data\\resultado.txt");
        try {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("tempo maximo: "+maximo+" tempo minimo: "+minimo+" media do tempo"+av_num);
            pw.close();
        } catch(IOException ioe){
            System.out.println("IO Exception");}
    }
}



