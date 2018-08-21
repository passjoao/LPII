public class Aluno{
    private Prova prova1;
    private Prova prova2;
    
    public Aluno(Prova prova1, Prova prova2){
        this.prova1 = prova1;
        this.prova2 = prova2;
    }
    
    public double caulcularMedia(){
        double p1 = prova1.calcularNotaTotal();
        double p2 = prova2.calcularNotaTotal();
        return (p1 + p2)/2;
    }
}
