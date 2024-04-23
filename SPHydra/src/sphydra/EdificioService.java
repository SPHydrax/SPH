package sphydra;

public class EdificioService {
    private int edificio_id;
    private String nome;
    private String endereco;

    //Métodos Especiais
        //Getters and Setters
    public int getEdificio_id() {
        return edificio_id;
    }
    public void setEdificio_id(int edificio_id) {
        this.edificio_id = edificio_id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
     //Métodos 
    public void criarEdificio(String nome, String endereco){
        this.setNome(nome);
        this.setEndereco(endereco);
    }
    
    public void criarUsuario(String nome, String email, String senha){
        AutenticacaoService u = new AutenticacaoService();
        u.setNome(nome);
        u.setEmail(email);
        u.setSenha(senha);
    }
    
    public void atualizarEdificio(int edificio_id, String nome, String endereco){
        this.setEdificio_id(edificio_id);
        this.setNome(nome);
        this.setEndereco(endereco);
    }
    
    public void excluirEdificio(int edificio_id){
        
    }
}
