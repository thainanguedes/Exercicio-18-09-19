
public class Aluno
{
    private String nome;
    private String CPF;
    private Data dataDeNascimento;
    
    public Aluno(String n, String c, Data d){
        this.setNome(n);
        this.setCpf(c);
        this.setDataDeNascimento(d);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.CPF;
    }
    
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setCpf(String c){
        this.CPF = c;
    }
    
    public void setDataDeNascimento(Data d){
        this.dataDeNascimento = d;
    }
    
   
}