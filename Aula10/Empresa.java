import java.util.ArrayList;
public class Empresa{
    private ArrayList<Cliente> clientes;
    
    public Empresa(){
        clientes = new ArrayList<Cliente>();
    }
    
    public void addCliente(Cliente c){
        clientes.add(c);
    }
    public void rmCliente(Cliente c){
        for(Cliente cli : clientes){
            if(cli.getNome().equals(c.getNome())){
                clientes.remove(c);
            }
        }
    }
    public void imprimirEmpresas(){
        for(Cliente cli : clientes){
            cli.imprimir();
            System.out.println();
        }
    }
    
    public void contarEmpresa(){
        for(Cliente cli: clientes){
        }
    }
}
