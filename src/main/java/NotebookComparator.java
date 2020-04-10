import java.util.Comparator;

public class NotebookComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        Integer price1 = o1.getPrice();
        Integer price2 = o2.getPrice();
        if(price1 > price2) {
            return -1;
        } else if(price1 < price2) {
            return 1;
        } else {
            return 0;
        }
    }
}
