import java.time.LocalDate;
import java.util.Arrays;
public class Encomenda 
{
    private String nomeCliente;
    private int NIF;
    private String moradaCliente; 
    private int nrEncomenda;
    private LocalDate dataEncomenda;
    private LinhaEncomenda linhas[];
    private int pos;

    //Construtores

    public Encomenda ()
    {
        this.nomeCliente = "N/A";
        this.NIF = 0;
        this.moradaCliente = "N/A";
        this.nrEncomenda = 0;
        this.dataEncomenda = LocalDate.now();
        this.linhas = new LinhaEncomenda[10];
        this.pos = 0;
    }

    public Encomenda (String nomeCliente, int NIF, String moradaCliente, int nrEncomenda, LocalDate dataEncomenda, LinhaEncomenda linhas[], int linhas_pos)
    {
        this.nomeCliente = nomeCliente;
        this.NIF = NIF;
        this.moradaCliente = moradaCliente;
        this.nrEncomenda = nrEncomenda;
        this.dataEncomenda = LocalDate.of(dataEncomenda.getYear(), dataEncomenda.getMonth(), dataEncomenda.getDayOfMonth());
        this.linhas = new LinhaEncomenda[linhas_pos];
        for(int i = 0; i < linhas_pos; i++)
            this.linhas[i] = linhas[i].clone();
        this.pos = linhas_pos;
    }

    public Encomenda (Encomenda copia)
    {
        this.nomeCliente = copia.nomeCliente;
        this.NIF = copia.NIF;
        this.moradaCliente = copia.moradaCliente;
        this.nrEncomenda = copia.nrEncomenda;
        this.dataEncomenda = LocalDate.of(copia.dataEncomenda.getYear(), copia.dataEncomenda.getMonth(), copia.dataEncomenda.getDayOfMonth());
        this.linhas = new LinhaEncomenda[copia.pos];
        for(int i = 0; i < copia.pos; i++)
            this.linhas[i] = copia.linhas[i].clone();
        this.pos = copia.pos;
    }

    //Getters e Setters

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

    public LinhaEncomenda[] getLinhas() 
    {
        return linhas;
    }


    /**
     * @brief Define o array LinhaEncomenda de raiz
     * 
     * @param linhas array a guardar
     * @param pos número de linhas do array a guardar
     */
    public void setLinhas(LinhaEncomenda[] linhas, int pos) 
    {
        this.linhas = new LinhaEncomenda [pos];
        this.linhas = Arrays.copyOf(linhas, pos);
        this.pos = pos;
    }

    public int getPos() 
    {
        return pos;
    }
    
    // Alínea (B)

    public double calculaValorTotal()
    {
        double sum = 0;
        for(int i = 0; i < this.pos; i++)
        {
            sum += this.linhas[i].calculaValorLinhaEnc();
        }
        return sum;
    }

    // Alínea (C)

    public double calculaValorDesconto()
    {
        double sum = 0;
        for(int i = 0; i < this.pos; i++)
        {
            sum += this.linhas[i].calculaValorDesconto();
        }
        return sum;
    }

    // Alínea (D)

    public int numeroTotalProdutos ()
    {
        return this.getPos();
    }

    // Alínea (E)

    public boolean existeProdutoEncomenda (String refProduto)
    {
        /*
        Esta maneira funcionaria se o array de linhas estivesse ordenado pela referencia do produto
        O que neste contexto não sei se é possível fazer, pois não sei se a ordem poderá ser alterada

        int i = Arrays.binarySearch(this.linhas, refProduto);  

        (i < 0) ? return false : return true;
        */

        for (int i = 0; i < this.pos; i++)
        {
            if (this.linhas[i].getReferencia() == refProduto)
                return true;
        }
        return false;
    }

    // Alínea (F)
    
    public void adicionaLinha (LinhaEncomenda linha)
    {
        int length1 = this.linhas.length;
        if (this.pos > length1)
        {
            int i;
            LinhaEncomenda novo[] = new LinhaEncomenda[length1 * 2];
            for (i = 0; i < length1; i++)
                novo[i] = this.linhas[i].clone();
            novo[i] = linha.clone();
            this.pos++;
        }
        else
            this.linhas[this.pos++] = linha.clone();
        
    }
}
