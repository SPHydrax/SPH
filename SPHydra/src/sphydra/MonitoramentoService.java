package sphydra;

public class MonitoramentoService {
    
    
    public void monitorarPressaoEntrada(){
        LeituraService pressaoE = new LeituraService();
        pressaoE.getPressao_entrada_agua();
    }
    
    public void monitorarPressaoSaida(){
        LeituraService pressaoS = new LeituraService();
        pressaoS.getPressao_saida_agua();
    }
    
    public void monitorarVolumeAgua(){
        LeituraService volumeA = new LeituraService();
        volumeA.getVolume_agua();
    }
}
