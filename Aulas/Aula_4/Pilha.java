import java.util.List;
import java.util.ArrayList;

public class Pilha 
{
    
    private List<String> pilha;
    
    
    public Pilha() 
    {
        this.pilha = new ArrayList<String>();
    }

    public Pilha(ArrayList<String> lista)
    {
        this.pilha = lista;
    }

    public Pilha(Pilha pilha)
    {
        this.setPilha(pilha.getPilha());
    }

    public List<String> getPilha() {
        return this.pilha;
    }

    public void setPilha(List<String> lista) 
    {
        //this.pilha = new ArrayList<String>(lista);

        for(String a : lista)
        {
            this.pilha.add(a);
        }
    }

    public String top()
    {
        return this.pilha.get(0);
    }

    public void push(String a)
    {
        this.pilha.add(a);
    }

    public void pop()
    {
        if(!this.pilha.isEmpty())
        {
            this.pilha.remove(0);
        }
    }
    
    public boolean empty()
    {
        return this.pilha.isEmpty();
    }

    public int length()
    {
        return this.pilha.size();
    }

    
}
