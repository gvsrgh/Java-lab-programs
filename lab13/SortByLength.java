package lab13;

import java.util.Comparator;

public class SortByLength implements Comparator<Cuboid> {
    @Override
    public int compare(Cuboid o1, Cuboid o2) {
        return (int) (o1.getLength() - o2.getLength());
    }
}

