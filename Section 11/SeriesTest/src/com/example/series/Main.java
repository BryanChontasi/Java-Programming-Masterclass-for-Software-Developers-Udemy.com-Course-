package com.example.series;
/**
 * @author Bryan Chontasi
 * @project PackagesChallengeExercise
 */

import com.bryanchontasi.mylibrary.Series;

public class Main {

    public static void main(String[] args) {

        // Create a new project and add your Series library, then test the
        // three methods in the main() method of your new project.


        //test Series.nSum
        System.out.println("test Series.nSum ===============");
        for (int i = 0; i <= 10; i ++){
            System.out.println(Series.nSum(i));
        }

        //test Series.factorial
        System.out.println("test Series.factorial ===============");
        for (int i = 0; i <= 10; i++){
            System.out.println(Series.factorial(i));
        }

        //test Series.fibonacci
        System.out.println("test Series.fibonacci ===============");
        for (int i = 0; i <= 10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}
