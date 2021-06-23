package btvn;

import java.util.Comparator;

public class SortId implements Comparator<FormType> {
    @Override
    public int compare(FormType o1, FormType o2) {
        if(o1.getId() > o2.getId()){
            return 1;
        }else if(o1.getId() == o2.getId()){
            return 0;
        }else{
            return -1;
        }
    }
}
