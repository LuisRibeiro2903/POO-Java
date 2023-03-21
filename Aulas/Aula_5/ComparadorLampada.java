import java.util.Comparator;

public class ComparadorLampada implements Comparator<Lampada>
{

    @Override
    public int compare(Lampada lampada1, Lampada lampada2) 
    {
        return lampada1.compareTo(lampada2);
    }
}
