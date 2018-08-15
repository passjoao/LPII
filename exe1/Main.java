public class Main{
        public static void main(String[] args){
                Credit p1 = new Credit();  
		System.out.println("valor: " + p1.getCredito());
		p1.addCredito(-1000);
		System.out.println("valor: " + p1.getCredito());
		p1.remCredito(1500);
		System.out.println("valor: " + p1.getCredito()); 
	}

}

