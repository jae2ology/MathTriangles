import java.util.Scanner;

/**
* File: PAssign06.java
* Class: CSCI 1301 A H
* Author: Jae Jackson
* Created on: March 22, 2025
* Last Modified: March 22, 2025
* Description: nested loops to create a triangle based on the variable in different patterns
*/

public class PAssign06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxMultiples = 0;
        int i = 1;
        int patternCount = 0;

        while (patternCount != 4){
            // loop goes while patternCount doesn.t equal 4!


            System.out.println("Enter max number of multiples:");
            maxMultiples = input.nextInt(); // enter the number of times for the loop


            if (maxMultiples < 0){
                // if number entered is a negative number then loop goes again until its positive
                System.out.println("Please enter a positive value.");
            }

            else {
                System.out.println();
                
                System.out.println("Pattern A:");
                // pattern a
                for (i = 1; i <= maxMultiples; i++){
                    for ( int j = 1; j <= i; j++){
                        System.out.print(5 * j + " ");
                    }

                    System.out.println();
                }
                patternCount++;

                System.out.println();

                System.out.println("Pattern B:");
                // pattern b
                for (int s = maxMultiples; s >= 1; s--){
                    for (int c = 1; c <= s; c++){
                        System.out.print(5 * c + " ");
                    }
                    
                    System.out.println();
                }
                patternCount++; // adds to the count for the pattern for the loop


                System.out.println();

                System.out.println("Pattern C:");
                // pattern c
                for (int a = 1; a <= maxMultiples; a++){
                    for (int b = a; b >= 1; b--){
                        System.out.print(5 * b + " ");
                    }

                    System.out.println();
                }
                patternCount++;

                System.out.println();

                System.out.println("Pattern D:");
                // pattern d
                for (int d = maxMultiples; d >= 1; --d){
                    for ( int o = d; o >= 1; --o){
                        System.out.print(5 * o + " ");
                    }

                    System.out.println();
                }
                patternCount++;
            }
        }
        

        
    }
        
}