import java.util.*;
import java.util.stream.Collectors;

public class GestEncomenda 
{
    private Map <String, EncEficiente> encomendaMap;

    public GestEncomenda ()
    {
        this.encomendaMap = new HashMap<>();
        ComparadorEncomendas comparador = new ComparadorEncomendas();
        Comparator<EncEficiente> comparator = (enc1, enc2) -> enc1.getMoradaCliente().compareTo(enc2.getMoradaCliente());

        this.encomendaMap.put("id2", new EncEficiente());
        this.encomendaSet = new TreeSet<>(comparador);

    }


    public GestEncomenda (Map<String, EncEficiente> encomendaMap)
    {
        this.encomendaMap = encomendaMap.entrySet().stream()
            .collect(Collectors.toMap((e)-> e.getKey(), (e)-> e.getValue().clone()));
    }

    public GestEncomenda (GestEncomenda copia)
    {
        this.encomendaMap = new 
    }

    public void interadores()
    {
        //iterar por chave valor

        for(Map.Entry<String, EncEficiente> entry : this.encomendaMap.entrySet())
        {
            entry.getKey();
            entry.getValue();
        }

        //iterador pelas chaves

        Set<String> chaves = this.encomendaMap.keySet();
        for(String chave : chaves)
        {

        }

        //iterador pelos valores

        Collection<EncEficiente> encomendas = this.encomendaMap.values();
    }
    
}
