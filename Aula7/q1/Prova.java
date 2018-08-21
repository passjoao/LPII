public class Prova{
	private double notaParte1;
	private double notaParte2;
	
	public Prova(double notaParte1, double notaParte2){
	    this.notaParte1 = notaParte1;
	    this.notaParte2 = notaParte2;
	}
	
	public double calcularNotaTotal(){
	    double soma = notaParte1 + notaParte2;
	    if(soma > 10){
            return 10.0;
	    }
	    else{
	        return soma;
	    }
	}
	
}
