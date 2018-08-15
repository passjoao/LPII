import java.util.*;

public class CountString
{
	private String texto;
	
	public CountString(){
		texto = "";
	}
	public CountString(String text){
		texto = text;
	}
	public void contarPalavras(){
		
		Map<String, Integer> palavras = new HashMap<String, Integer>();
		String array[] = texto.split("[\\W]");
		for(String i:array){
        	if (palavras.get(i) == null){
        		palavras.put(i, 1);
        	}
        	else {
        		int cont = palavras.get(i);
        		cont += 1;
        		palavras.put(i, cont);
        	}
    	}
    	for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
