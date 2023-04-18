import java.time.Duration;
import java.time.LocalDate;

public abstract class Atividade 
{   

    private String codigo;
    private String descricao;
    private LocalDate dataRealizacao;
    private Duration tempo;
    
    public Atividade() 
    {

    }

    public Atividade (Atividade copia) 
    {
        this.codigo = copia.codigo;
        this.descricao = copia.descricao;
        this.dataRealizacao = LocalDate.of(copia.dataRealizacao.getYear(), copia.dataRealizacao.getMonth(), copia.dataRealizacao.getDayOfMonth());
        this.tempo = copia.tempo
    }
    
}
