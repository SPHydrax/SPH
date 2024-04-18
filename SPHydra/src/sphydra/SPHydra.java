
package sphydra;

import java.util.Arrays;
import java.util.Random;

public class SPHydra {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        DataSimulator d = new DataSimulator();
        int quantD = 1;
        System.out.println("Dados Adquiridos");
        System.out.println("Dado pressão entrada: "+ Arrays.toString(d.dadosPressaoEntrada(quantD)));
        System.out.println("Dado pressão saída: "+ Arrays.toString(d.dadosPressaoSaida(quantD))); 
        System.out.println("Dado volume água: "+ Arrays.toString(d.dadosVolumeAgua(quantD)));
        
        /*for(int i = 0; i < quantD; i++){
            //System.out.println("Dado "+ (i+1) + ": "+ presaoEnt.get(i));
            System.out.println("Dado "+ (i+1) + ": "+ Arrays.toString(d.dadosPressaoEntrada(quantD)));
        }*/
        


    }
    
}
