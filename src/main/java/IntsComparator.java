import java.util.Comparator;

public class IntsComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //o1 > o2 => 1
        //o1 == o2 => 0
        //o1 < o2 => -1
        if(o1 > o2) {
            return -1;
        } else if(o1.equals(o2)) {
            return 0;
        } else {
            return 1;
        }
    }
}
