import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Fitness {
    
    private Map<String, Utilizador> users;

    public boolean existeUtilizador (String email)
    {
        return users.containsKey(email);
    }

    public int quantos()
    {
        return users.size();
    }
    
    public int quantos(String atividade, String email)
    {
        int total = 0;
        Utilizador target = users.get(email);
        for (Atividade f : target.getAtividades())
            if(f.getClass().getSimpleName().equals(atividade))
                total++;
        return total;
    }

    public Utilizador geUtilizador (String email)
    {
        return new Utilizador(users.get(email));
    }

    public void adiciona(String email, Atividade ativ)
    {
        Utilizador user = this.users.get(email);
        user.adicionaAtividade(ativ);
    }
    
    public List<Atividade> getAllAtividades()
    {
        List<Atividade> listaFinal = new ArrayList<Atividade>();
        for(Map.Entry<String, Utilizador> entry : this.users.entrySet())
        {
            entry.getValue().getAtividades().addAll(listaFinal);
        }
        return listaFinal;
    }

    public void adiciona(String email, Set<Atividade> ativs)
    {
        Utilizador user = this.users.get(email);
        for(Atividade ativ : ativs)
        {
            user.adicionaAtividade(ativ.clone());
        }
    }

    public int tempoTotalUtilizador (String email)
    {
        Utilizador user = this.users.get(email);
        Set<Atividade> atividadesUser = user.getAtividades();
        Duration total = Duration.ZERO;
        for(Atividade ativ : atividadesUser)
        {
            total.plus(ativ.getTempo());
        }
        return (int) total.toMinutes();
    }
}
