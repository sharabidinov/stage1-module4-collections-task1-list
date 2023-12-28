package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();

        for (String item: sourceList) {
            int index = sourceList.indexOf(item) + 1;
            if (index % 3 == 0) {
                result.add(item);
                result.add(item);
            }
        }
        return result;
    }
}
