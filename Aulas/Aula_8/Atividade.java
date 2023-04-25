import java.time.Duration;
import java.time.LocalDate;

public abstract class Atividade implements Cloneable
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
        this.tempo = Duration.ofSeconds(copia.tempo.getSeconds()).plusNanos(copia.tempo.getNano());
    }
    
    public abstract Atividade clone();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(LocalDate dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public Duration getTempo() {
        return tempo;
    }

    public void setTempo(Duration tempo) {
        this.tempo = tempo;
    }
}
