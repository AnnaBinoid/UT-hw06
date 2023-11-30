package main;

import java.util.Arrays;
import java.util.Random;

public class ModelList {

    public ModelList() {}

    public int[] createOurArray(){
        Random random = new Random();
        int[] arr = random.ints(0, 10)
                .distinct().limit(5).toArray();
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public double getArrayAverage(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        double arrAverage = Math.round(sum/ array.length);
        System.out.println("Average of list is: " + arrAverage);
        return arrAverage;
    }

    public void compareArray (double firstArrAverage, double secondArrAverage) {
        if (firstArrAverage > secondArrAverage){
            System.out.println("First array has lager average then second array.");
        }
        else if (secondArrAverage > firstArrAverage) {
            System.out.println("Second array has lager average then first array.");
        }
        else System.out.println("The average values of the arrays are equal");
    }
}
