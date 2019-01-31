package DemoPack.Lesson11.Interface.ComparableComparatorExample;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {     //objects for comparing entering after "Comparator"

    public int compare(House h1, House h2) {
        if (h1.price == h2.price) {
            return 0;
        }
        if (h1.price > h2.price) {
            return 1;
        } else {
            return -1;
        }
    }
}