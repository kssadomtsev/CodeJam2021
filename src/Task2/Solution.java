package Task2;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        in.nextLine();
        for (int i = 1; i <= t; ++i) {
            String input = in.nextLine();
            String[] array = input.split(" ");
            int x = Integer.parseInt(array[0]);
            int y = Integer.parseInt(array[1]);
            System.out.println("Case #" + i + ": " + minCost(x, y, array[2]));
        }
    }

    private static int minCost(int x, int y, String mural) {
        int sum = 0;
        boolean started = false;
        boolean prevC = false;
        for (int i = 0; i < mural.length(); i++) {
            if (started && mural.charAt(i) == 'C') {
                if (!prevC) {
                    sum += y;
                }
                prevC = true;
            } else if(started && mural.charAt(i) == 'J'){
                if (prevC){
                    sum += x;
                }
                prevC = false;
            } else if(!started && mural.charAt(i) != '?'){
                started = true;
                if (mural.charAt(i) == 'C'){
                    prevC = true;
                }
            }
        }
        return sum;
    }
}
