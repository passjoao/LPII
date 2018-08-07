public class Credit{
	private int credito;
	public Credit(){ credito = 1000;}
	public Credit(int val){
		if(val > 0){
			credito = val;
		}
		else{
			System.out.println("Erro: Não pode adicionar valores negativos nesse campo\nSaldo atribuido: 0");
			credito = 0;
		} 
	}

	public int getCredito(){
		return credito;
	}
	public void setCredito(int val){
		if(val > 0){
                        credito = val;
                }
                else{
                        System.out.println("Erro: Não pode adicionar valores negativos nesse campo\nSaldo atribuido: 0");
                        credito = 0;
		}

	}
	public void addCredito(int val){
		if(val <0){
			System.out.println("Não é possivel adicionar valores negativos");
		}
		else{
			credito = credito + val;
		}
	}
	public void remCredito(int val){
		int resu = credito - val;
		if(resu < 0){
			System.out.println("Credito insuficiente!!!!"); 
		}
		else{
			credito = resu;
		} 
	}
}
