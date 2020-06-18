package be.vdab;

import java.util.Arrays;

public class Arrays101 {
    public static void main(String[] args) {

        int[] numbers = new int [3];
        int sum = 0;
        numbers [0] = 25;
        numbers [1] = 75;
        numbers [2] = 80;

        //System.out.println(Arrays.toString(numbers));
        //System.out.println("Element number 0 is: "+ numbers[0]);
        //System.out.println("Element number 1 is: "+ numbers[1]);
        //System.out.println("Element number 2 is: "+ numbers[2]);

        int lengthOfNumbersArray = numbers.length;
        // System.out.println("length of the current array is: "+ lengthOfNumbersArray);

        for (int counter = 0; counter <numbers.length; counter++) {
            sum += numbers[counter];
            //System.out.println(counter);
        }
        for (int number : numbers){
            System.out.println(number);
        }
        int average = sum / numbers.length;
        //System.out.println(average);
    }
}


