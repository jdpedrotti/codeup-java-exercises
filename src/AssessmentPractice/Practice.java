package AssessmentPractice;

import java.lang.reflect.Array;

public class Practice {



    public static int subtractTen(int num){
        return num - 10;
    }

    public static double average(){
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
        return (double) average;
    }







    public static void main(String[] args) {

        System.out.println(subtractTen(5));
        System.out.println(average());


    }
}


