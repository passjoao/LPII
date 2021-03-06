public class Juridica extends Cliente{
    private String cnpj;
    private String nomeFantasia;
    
    public Juridica(String n, String e, String t, String cnpj, String nomeFantasia){
        super(n, e, t);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getNomeFantasia(){
        return this.nomeFantasia;
    }
    
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("CNPJ: " + cnpj+ "\nNome Fantasia: " + nomeFantasia);
    }
}
