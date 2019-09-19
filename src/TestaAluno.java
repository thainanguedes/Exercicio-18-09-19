
public class TestaAluno {
    
    
    public static void main (String [] args)
    {
        Data d = new Data(16,12,1994);
        
        Aluno n = new Aluno("thainan", "999-999-999-99", d);
        
        String dados = n.getNome()+"\n"+n.getCpf()+"\n"+n.getDataDeNascimento().imprimir();
        
        System.out.println(dados);
        
        

    
        
    }
  
    
}
