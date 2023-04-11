import java.util.Comparator;

public class ComparadorEncomendas implements Comparator<EncEficiente>
{
    @Override
    public int compare(EncEficiente o1, EncEficiente o2)
    {
        return o1.compareTo(o2);
    }    
}
