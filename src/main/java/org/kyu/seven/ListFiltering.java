package org.kyu.seven;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> filteredList = new ArrayList<>();
        for (Object o : list) {
            if (!(o instanceof String)) {
                filteredList.add(o);
            }
        }
        return filteredList;
    }
}
