package Task1;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < array.length; j++) {
                array[j] = in.nextInt();
            }

            System.out.println("Case #" + i + ": " + reversSort(array));
        }
    }


    private static int reversSort(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int j = getMinIndex(array, i);
            sum += j - i + 1;
            revers(array, i, j);
            System.out.println(Arrays.toString(array));
        }
        return sum;
    }

    private static int getMinIndex(int[] array, int start) {
        int min = array[start];
        int minIndex = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < min) {
                minIndex = i;
                min = array[i];
            }
        }
        return minIndex;
    }


    static void revers(int[] array, int start, int stop) {
        int size = stop - start;
        for (int i = start; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }

    }
}

