package Task1;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(in.nextInt());
            }

            System.out.println("Case #" + i + ": " + reversSort(list));
        }
    }


    private static int reversSort(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int j = getMinIndex(list, i);
            sum += j - i + 1;
            Collections.reverse(list.subList(i, j + 1));
        }
        return sum;
    }

    private static int getMinIndex(List<Integer> list, int start) {
        int min = list.get(start);
        int minIndex = start;
        for (int i = start + 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                minIndex = i;
                min = list.get(i);
            }
        }
        return minIndex;
    }

}

