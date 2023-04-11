import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class EncEficiente implements Comparable<EncEficiente>
{
    private String nomeCliente;
    private int NIF;
    private String moradaCliente; 
    private int nrEncomenda;
    private LocalDate dataEncomenda;
    private List<LinhaEncomenda> linhas;

    // Construtores

    public EncEficiente()
    {
        this.nomeCliente = "N/A";
        this.NIF = 0;
        this.moradaCliente = "N/A";
        this.nrEncomenda = 0;
        this.dataEncomenda = LocalDate.now();
        this.linhas = new ArrayList<LinhaEncomenda>();
    }

    public EncEficiente (String nomeCliente, int NIF, String moradaCliente, int nrEncomenda, LocalDate dataEncomenda, List<LinhaEncomenda> linhas, int linhas_pos)
    {
        this.nomeCliente = nomeCliente;
        this.NIF = NIF;
        this.moradaCliente = moradaCliente;
        this.nrEncomenda = nrEncomenda;
        this.dataEncomenda = LocalDate.of(dataEncomenda.getYear(), dataEncomenda.getMonth(), dataEncomenda.getDayOfMonth());
        this.linhas = new ArrayList<LinhaEncomenda>();
        for(LinhaEncomenda a: linhas)
        {
            this.linhas.add(a.clone());
        }
    }

    public EncEficiente (EncEficiente copia)
    {
        this.nomeCliente = copia.nomeCliente;
        this.NIF = copia.NIF;
        this.moradaCliente = copia.moradaCliente;
        this.nrEncomenda = copia.nrEncomenda;
        this.dataEncomenda = LocalDate.of(copia.dataEncomenda.getYear(), copia.dataEncomenda.getMonth(), copia.dataEncomenda.getDayOfMonth());
        this.linhas = new ArrayList<LinhaEncomenda>();
        for(LinhaEncomenda a : copia.getLinhas())
        {
            this.linhas.add(a.clone());
        }
    }


    // Getters e Setters


    public String getNomeCliente() 
    {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) 
    {
        this.nomeCliente = nomeCliente;
    }
    
    public int getNIF() 
    {
        return NIF;
    }
    
    public void setNIF(int nIF) 
    {
        NIF = nIF;
    }
    
    public String getMoradaCliente() 
    {
        return moradaCliente;
    }
    
    public void setMoradaCliente(String moradaCliente) 
    {
        this.moradaCliente = moradaCliente;
    }
    
    public int getNrEncomenda() 
    {
        return nrEncomenda;
    }

    public void setNrEncomenda(int nrEncomenda) 
    {
        this.nrEncomenda = nrEncomenda;
    }

    public LocalDate getDataEncomenda() 
    {
        LocalDate data = LocalDate.of(this.dataEncomenda.getYear(), this.dataEncomenda.getMonth(), this.dataEncomenda.getDayOfMonth());
        return data;
    }

    public void setDataEncomenda(LocalDate dataEncomenda) 
    {
        this.dataEncomenda = LocalDate.of(dataEncomenda.getYear(), dataEncomenda.getMonth(), dataEncomenda.getDayOfMonth());
    }

    public List<LinhaEncomenda> getLinhas() 
    {
        return this.linhas;
    }

    public EncEficiente clone ()
    {
        return new EncEficiente(this);
    }

    public void setLinhas(List<LinhaEncomenda> linhas) 
    {
        this.linhas = new ArrayList<LinhaEncomenda>();
        for(LinhaEncomenda a : linhas)
        {
            this.linhas.add(a.clone());
        }
    }

    public double calculaValorTotal()
    {
        double sum = 0;
        
        for(LinhaEncomenda i : this.linhas)
        {
            sum += i.calculaValorLinhaEnc();
        }
        return sum;
    }

    @Override
    public int compareTo(EncEficiente arg0) 
    {
        int ret = 0;
        if(this.nrEncomenda > arg0.getNrEncomenda())
            ret = 1;
        if(this.nrEncomenda < arg0.getNrEncomenda())
            ret = -1;
        return ret;
    }
}
