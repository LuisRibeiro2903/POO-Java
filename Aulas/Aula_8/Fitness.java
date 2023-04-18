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
        Atividade aux = new Atividade(ativ);
    }
}
