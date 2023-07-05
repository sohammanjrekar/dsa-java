package Algorithms.GreedyMethodology;

import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int Weight = 50;
        int[] Valuelist = { 60, 100, 120 };
        int[] Weightlist = { 10, 20, 30 };

        double ratio[][] = new double[Valuelist.length][2];
        // 0th col=> idx; 1st col=> ratio
        for (int i = 0; i < Valuelist.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = Valuelist[i] / (double) Weightlist[i];
        }
        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = Weight;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= Weightlist[idx]) {
                finalVal += Valuelist[idx];
                capacity -= Weightlist[idx];
            } else {
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        for (int i = 0; i < ratio.length; i++) {
            for (int j = 0; j < ratio[i].length; j++) {
                System.out.print(ratio[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("Fianl value :" + finalVal);
    }
}
