public class Sala{
    
    //Criacao das saidas e descricao da Sala
    private String descricao;
    private Sala SaidaN;
    private Sala SaidaO;
    private Sala SaidaS;
    private Sala SaidaL;
    private Sala SaidaC;
    private Sala SaidaB;


    public Sala(String descricao){
        this.descricao = descricao;
    }

    public void colocarSaida(Sala norte, Sala oeste, Sala sul, Sala leste, Sala cima, Sala baixo){
        if(norte != null)
        SaidaN = norte;
        
        if(oeste != null)
        SaidaO = oeste;
        
        if(sul != null)
        SaidaS = sul;
        
        if(leste != null)
        SaidaL = leste;
        
        if(cima != null)
        SaidaC = cima;
        
        if(baixo != null)
        SaidaB = baixo;
    }
    
    
}
