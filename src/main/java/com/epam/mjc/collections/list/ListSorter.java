package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

import static java.lang.Math.abs;

public class ListSorter {
    public void sort(List<String> sourceList) {
        if (sourceList.size() > 1) {
            for (int i = 0; i < sourceList.size(); i++) {
                for (int j = i + 1; j < sourceList.size(); j++) {

                    ListComparator lc = new ListComparator();
                    int compareFigure = lc.compare(sourceList.get(i), sourceList.get(j));

                    String tmp;

                    if (compareFigure == abs(Integer.parseInt(sourceList.get(i)))) {
                        tmp = sourceList.get(i);

                        sourceList.set(i, sourceList.get(j));
                        sourceList.set(j, tmp);
                    }
                }
            }

            for (int i = 0; i < sourceList.size(); i++) {
                System.out.println(sourceList.get(i));
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int val1 = abs(Integer.parseInt(a));
        int val2 = abs(Integer.parseInt(b));

        if (val1 < val2) {
            return val2;

        } else {
            return val1;
        }
    }
}
