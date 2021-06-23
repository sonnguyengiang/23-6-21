import java.util.Comparator;

public class sortname implements Comparator<Preson> {
    @Override
    public int compare(Preson o1, Preson o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
