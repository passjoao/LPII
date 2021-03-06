public class Cliente{
    private String nome;
    private String endereco;
    private String telefone;
    
    public Cliente(String n, String e, String t){
        this.nome = n;
        this.endereco = e;
        this.telefone = t;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void imprimir(){
        System.out.println("Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nTelefone: " + telefone);
    }
}
