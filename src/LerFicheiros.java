import java.io.*;
import java.util.*;

public class LerFicheiros {
    public static void main (String arg[]) {
        File file = new File ("tempos.txt");
        float num,tempo=1000, maximo=0, minimo=1000, av_num=0;
        int n=0,volta=0,volta1=0;
        String nome=null,nome2=null,sobrenome=null,sobrenome2=null;
        try {
            Scanner scanner = new Scanner(file);
            scanner.useLocale(Locale.US);
            //System.out.println(scanner.locale().getDisplayCountry());

            while(scanner.hasNext()) {
                if (scanner.hasNextFloat() && !scanner.hasNextInt()) {
                    num = scanner.nextFloat();
                    n++;
                    //System.out.println ("Numero: " +num);
                    if (maximo<= num){
                        maximo= num;
                    }
                    if (num<=minimo){
                        minimo= num;
                        volta=n;
                    }
                    av_num= (av_num+num)/2;
                    if (n==5){
                        LerFicheiros escrita = new LerFicheiros();
                        escrita.EscreverFicheiro(maximo,minimo,av_num,nome,sobrenome);
                        if (minimo<=tempo){
                            volta1=volta;
                            tempo=minimo;
                            nome2=nome;
                            sobrenome2=sobrenome;
                        }
                        maximo=0;
                        minimo=1000;
                        av_num=0;
                        n=0;
                    }
                } else{
                    nome = scanner.next();
                    sobrenome = scanner.next();
                    //System.out.println(nome);
                    //System.out.println(sobrenome);
                }
            }

        } catch (InputMismatchException e) {
            System.out.println ("Mismatch exception:" + e);
        } catch (FileNotFoundException e) {
            System.out.println ("Ficheiro não encontrado!");
            System.exit (0); }
        LerFicheiros escrita = new LerFicheiros();
        escrita.EscreverFicheiro2(tempo,volta1,nome2,sobrenome2);
    }

    public LerFicheiros(){};
    public void EscreverFicheiro(float maximo, float minimo, float av_num, String nome,String sobrenome){
        File f = new File("data\\resultado.txt");
        try {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(nome+" "+sobrenome);
            pw.println("tempo maximo: "+maximo+" tempo minimo: "+minimo+" media do tempo: "+av_num);
            pw.close();
        } catch(IOException ioe){
            System.out.println("IO Exception");}
    }
    public void EscreverFicheiro2(float tempo, int volta, String nome,String sobrenome){
        File f = new File("data\\resultado.txt");
        try {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("melhor condutor: "+nome+" "+sobrenome);
            pw.println("melhor tempo da prova: "+tempo+" na volta: "+volta);
            pw.close();
        } catch(IOException ioe){
            System.out.println("IO Exception");}
    }
}



