public class Main{
    public static void main(String[] args){
        Fisica joao = new Fisica("João", "Ali", "4002-8922", "5555555555");
        Cliente maria = new Juridica("Maria", "Logo Ali", "4002-8922", "85274196310", "Maria Sex Shop");
        
        Empresa batata = new Empresa();
        
        batata.addCliente(joao);
        batata.addCliente(maria);
        
        batata.imprimirEmpresas();
    }
}
