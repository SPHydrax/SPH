package sphydra;

public class LeituraService {
    private int leitura_id;
    private int edificio_id;
    private String data_hora;
    private DataSimulator pressao_entrada_agua;
    private DataSimulator pressao_saida_agua;
    private DataSimulator volume_agua;

    public int getLeitura_id() {
        return leitura_id;
    }
    public void setLeitura_id(int leitura_id) {
        this.leitura_id = leitura_id;
    }

    public int getEdificio_id() {
        return edificio_id;
    }
    public void setEdificio_id(int edificio_id) {
        this.edificio_id = edificio_id;
    }

    public String getData_hora() {
        return data_hora;
    }
    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public DataSimulator getPressao_entrada_agua() {
        return pressao_entrada_agua;
    }
    public void setPressao_entrada_agua(DataSimulator pressao_entrada_agua) {
        this.pressao_entrada_agua = pressao_entrada_agua;
    }

    public DataSimulator getPressao_saida_agua() {
        return pressao_saida_agua;
    }
    public void setPressao_saida_agua(DataSimulator pressao_saida_agua) {
        this.pressao_saida_agua = pressao_saida_agua;
    }

    public DataSimulator getVolume_agua() {
        return volume_agua;
    }
    public void setVolume_agua(DataSimulator volume_agua) {
        this.volume_agua = volume_agua;
    }
    
    
    public void registrarLeitura(int edificio_id){
        this.setData_hora(data_hora);
        this.setPressao_entrada_agua(pressaoEntrada);
        
    }
    
    public void consultarHistorico(){
        
    }
}
