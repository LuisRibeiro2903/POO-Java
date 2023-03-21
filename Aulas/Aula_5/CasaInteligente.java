import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

import Lampada.Modo;

import java.util.Iterator;

public class CasaInteligente 
{
    
    private Set<Lampada> lampadas;
    
    public CasaInteligente()
    {
        this.lampadas = new HashSet<Lampada>();
    }

    public CasaInteligente(Set<Lampada> lampadas)
    {
        this.lampadas = new HashSet<Lampada>();
        for(Lampada i : lampadas)
        {
            this.lampadas.add(i.clone()); 
        }
    }

    public CasaInteligente(CasaInteligente copia)
    {
        this.lampadas = new HashSet<Lampada>();
        for(Lampada i : copia.lampadas)
        {
            this.lampadas.add(i.clone());
        }
    }

    public Set<Lampada> getLampadas() 
    {
        Set<Lampada> ret = new HashSet<Lampada>();
        Iterator<Lampada> iterator = this.lampadas.iterator();
        while(iterator.hasNext())
        {
            Lampada lampada_aux = iterator.next();
            ret.add(lampada_aux.clone());
        }
        return ret;
    }

    public void setLampadas(Set<Lampada> lampadas) 
    {
        this.lampadas = new HashSet<Lampada>();
        Iterator<Lampada> iterator = lampadas.iterator();
        while(iterator.hasNext())
        {
            Lampada lampada_aux = iterator.next();
            this.lampadas.add(lampada_aux.clone());
        }
    }

    public void addLampada (Lampada l)
    {
        this.lampadas.add(l.clone());
    }

    public void ligaLampadaNormal (Lampada l)
    {
        for(Lampada i : this.lampadas)
        {
            if(i.equals(l))
            {
                i.lampON();
            }
        }
    }

    public void ligaLampadaEco (Lampada l)
    {
        for(Lampada i : this.lampadas)
        {
            if(i.equals(l))
            {
                i.lampECO();
            }
        }
    }

    public int qtEmEco()
    {
        int qt = 0;
        for(Lampada i : this.lampadas)
        {
            if(i.getModo() == Lampada.Modo.ECO)
                qt++;
        }
        return qt;
    }

    public void removeLampada (Lampada l)
    {
        Iterator<Lampada> iterator = this.lampadas.iterator();
        while(iterator.hasNext())
        {
            Lampada aux = iterator.next();
            if(aux.equals(l))  iterator.remove();
        }
    }

    public void ligaTodasEco()
    {
        for(Lampada i : this.lampadas)  i.lampECO();
    }

    public void ligaTodasMax()
    {
        for(Lampada i : this.lampadas)  i.lampON();
    }

    public double consumoTotal ()
    {
        double total = 0;
        for(Lampada i : this.lampadas) total += i.getConsumoTotal();
        return total;
    }

    public Lampada maisGastadora ()
    {
        Lampada aux = new Lampada();
        for(Lampada i : this.lampadas)
        {
            if(i.getConsumoTotal() > aux.getConsumoTotal())
                aux = i.clone();
        }
        return aux;
    }

    public Set<Lampada> podiumEconomia()
    {
        ComparadorLampada comparador = new ComparadorLampada();
        Set<Lampada> ret = new TreeSet<Lampada>(comparador);
        return ret;
    }
}