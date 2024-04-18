package sphydra;

import java.util.Random;

public class DataSimulator {
    public float[] dadosPressaoEntrada(int quant) throws InterruptedException{
        float dadosE[] = new float[quant];
        Random r = new Random();
        for(int i=0; i < quant; i++){
            float dado = r.nextFloat(250) * 100;
            Thread.sleep(quant * 1000);
            dadosE[i] = dado;
        }
        return dadosE;
        
    }
    
    public double[] dadosPressaoSaida(int quant) throws InterruptedException{
        double dadosS[] = new double[quant];
        Random r = new Random();
        for (int i = 0; i < quant; i++){
            double dado = r.nextDouble() *100;
            Thread.sleep(quant * 1000);
            dadosS[i] = dado;
        }
        return dadosS;
        
    }
    
    public double[] dadosVolumeAgua(int quant) throws InterruptedException{
        double dadosV[] = new double[quant];
        Random r = new Random();
        for (int i = 0; i < quant; i++){
            double dado = r.nextDouble() * 100;
             Thread.sleep(quant * 1000);
            dadosV[i] = dado;
        }
        return dadosV;
        
    }
}
