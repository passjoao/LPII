import java.util.*;
public class Turma{
    private ArrayList<Aluno> alunos;
    
    public Turma(){
        alunos = new ArrayList<Aluno>();
    }
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public double caulcularMedia(){
        double soma= 0;
        for(int i = 0; i < alunos.size(); i++) {
            soma += alunos.get(i).caulcularMedia();
        }
        return soma/alunos.size();
    }
}
