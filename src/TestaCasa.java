
public class TestaCasa
{
    public static void main (String [] args)
    {
    
        
     
        
        Porta p1 = new Porta("Preto",10,14,16);
        p1.fecha();
        Porta p2 = new Porta("Laranja",10,14,16);
        p2.fecha();
        Porta p3 = new Porta("Vermelho",10,14,16);
        p3.abre();
        
        Casa c1 = new Casa("Verde",p1,p2,p3);
       
  
        System.out.println(c1.quantasPortasEstaoAbertas());
        
    }
}
