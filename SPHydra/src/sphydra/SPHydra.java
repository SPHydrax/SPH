package sphydra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class SPHydra {
    public static void main(String[] args) throws InterruptedException {
        DataSimulator d = new DataSimulator();
        int quantD = 1;
        System.out.println("Dados Adquiridos");
        System.out.println("Dado pressão entrada: "+ Arrays.toString(d.dadosPressaoEntrada(quantD)));
        System.out.println("Dado pressão saída: "+ Arrays.toString(d.dadosPressaoSaida(quantD))); 
        System.out.println("Dado volume água: "+ Arrays.toString(d.dadosVolumeAgua(quantD)));
        System.out.println("------------------------------------------------------");
        /*for(int i = 0; i < quantD; i++){
            //System.out.println("Dado "+ (i+1) + ": "+ presaoEnt.get(i));
            System.out.println("Dado "+ (i+1) + ": "+ Arrays.toString(d.dadosPressaoEntrada(quantD)));
        }*/
        
        System.out.println("Pressão Entrada: "+ Arrays.toString(d.getPressaoEntrada()));
        System.out.println("Pressão Saída: "+ Arrays.toString(d.getPressaoSaida()));
        System.out.println("Volume de Água: "+ Arrays.toString(d.getVolumeAgua()));
        System.out.println("------------------------------------------------------");
        LeituraService l = new LeituraService();
        l.registrarLeitura(0);
        /*LocalDateTime hD = LocalDateTime.now();
        String horaData = hD.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(horaData);*/
    }
}
