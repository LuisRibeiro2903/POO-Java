import java.util.*;
import java.util.stream.Collectors;

public class GestaoEncomenda {

    private Map <String,EncEficiente> encomendaMap;
    //private Set<EncEficiente> encomendaSet;

    public GestaoEncomenda(){       // 3 construtores = parametrizado, por omissão e de cópia
        this.encomendaMap = new HashMap<>();
        this.encomendaMap.put("id2", new EncEficiente());
    }

    public GestaoEncomenda (Map<String,EncEficiente> encomendaMap){
        this.encomendaMap = encomendaMap.entrySet().stream()
                .collect(Collectors.toMap((e)->e.getKey(), (e)->e.getValue().clone()));
    }

    public GestaoEncomenda (GestaoEncomenda copia){
        this.encomendaMap = new HashMap<String,EncEficiente>();
        for(Map.Entry<String,EncEficiente> entry : copia.getEncomendaMap().entrySet()){
            this.encomendaMap.put(entry.getKey(),entry.getValue());
        }
    }

    public Map<String,EncEficiente> getEncomendaMap(){
        Map<String,EncEficiente> result = new HashMap<String,EncEficiente>();
        for(Map.Entry<String, EncEficiente> entry : this.encomendaMap.entrySet()){
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public void setEncomendaMap (Map<String,EncEficiente> encomendas){
        Map<String,EncEficiente> result = new HashMap<>();
        for(Map.Entry<String,EncEficiente> entry : encomendaMap.entrySet()){
            result.put(entry.getKey(), entry.getValue());
        }
        this.encomendaMap = result;
    }

/*    public void iteradores(){

        //Iterar por chave valor
        for(Map.Entry<String, EncEficiente> entry : this.encomendaMap.entrySet()){
            entry.getKey();
            entry.getValue();
        }

        //Iterador por chaves
        Set<String> chaves = this.encomendaMap.keySet();
        for(String chave : chaves){

        }

        //Iterador pelos valores
        Collection<EncEficiente> encomendas = this.encomendaMap.values();
    } */
}
