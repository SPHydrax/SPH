package sphydra;

public class AutenticacaoService {
    private int usuario_id;
    private String nome;
    private String email;
    private String senha;

    //Métodos Especiais
        //Getters and Setters
    public int getUsuario_id() {
        return usuario_id;
    }
    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
     //Métodos 
    public void autenticar(String email, String senha){
        
    }
    
    public void autorizar(){
        
    }
    
}
