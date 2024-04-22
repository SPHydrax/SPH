package sphydra;

import java.util.Random;

public class DataSimulator {
    private double[] pressaoEntrada;
    private double[] pressaoSaida;
    private double[] volumeAgua;

    //Métodos Especiais
        //Getters and Setters
    public double[] getPressaoEntrada() {
        return pressaoEntrada;
    }
    public void setPressaoEntrada(double[] pressaoEntrada) {
        this.pressaoEntrada = pressaoEntrada;
    }

    public double[] getPressaoSaida() {
        return pressaoSaida;
    }
    public void setPressaoSaida(double[] pressaoSaida) {
        this.pressaoSaida = pressaoSaida;
    }

    public double[] getVolumeAgua() {
        return volumeAgua;
    }
    public void setVolumeAgua(double[] volumeAgua) {
        this.volumeAgua = volumeAgua;
    }
    
    
    
    public double[] dadosPressaoEntrada(int quant) throws InterruptedException{
        double dadosE[] = new double[quant];
        Random r = new Random();
        for(int i=0; i < quant; i++){
            double dado = r.nextDouble(250) * 100;
            Thread.sleep(quant * 1000);
            dadosE[i] = dado;
        }
        this.setPressaoEntrada(dadosE);
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
        this.setPressaoSaida(dadosS);
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
        this.setVolumeAgua(dadosV);
        return dadosV;
        
    }
}
