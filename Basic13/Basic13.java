import java.util.ArrayList;
import java.util.Arrays;

public class Basic13 {
// Print 1-255
// Write a method that prints all the numbers from 1 to 255.
    public void print1To255() {
        for (int i = 1; i < 256; i++){
            System.out.println(i);
        } 
    }
// Print odd numbers between 1-255
// Write a method that prints all the odd numbers from 1 to 255.
    public void printOdds1To255(){
        for (int i = 1; i < 256; i+=2){
            System.out.println(i);
        }
    }
// Print Sum
// Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. 
    public void printSum0To255(){
        int sum = 0;
        for (int i=0; i<256; i++){
            sum = sum +i;
            String result = String.format("New number: %s Sum: %s", i, sum);
            System.out.println(result);
        }
    }
// Iterating through an array
// Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. 
// Being able to loop through each member of the array is extremely important.
    public void iterateThroughArr(int[] x){
        // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
        for (int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }
// Find Max
// Write a method (sets of instructions) that takes any array and prints the maximum value in the array. 
// Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public void findMax(int[] myArray){
        int max = myArray[0];
        for (int i=0; i<myArray.length; i++){
            if (myArray[i]>max){
            max = myArray[i];
            }
        }
        System.out.println(max);
    }
// Get Average
// Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5
// Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public void getAvg(int[] myArray){
        int avg = 0;
        for (int i=0; i <myArray.length; i++){
            avg += myArray[i];
        }
        avg = avg/myArray.length;
        System.out.println(avg);
    }
// Array with Odd Numbers
// Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
        // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
        // https://stackoverflow.com/questions/15899699/add-an-element-to-int-array-in-java/15899768
    public void arrayOddList(){
        ArrayList<Integer> myArray = new ArrayList<Integer>(); 
        // --> This comes from the second url
        for (int i=1; i<256; i+=2){
            myArray.add(i); 
        }
        System.out.println(myArray);
    }
// Greater Than Y
// Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. 
// For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public Object greaterThanY(int[] myArray, int y){
        int sumInd=0;
        if (myArray.length==0){
            return "This is empty!";
        }
        else{
            for (int i=0; i<myArray.length; i++){
                if (myArray[i]>y){
                    sumInd++;
                }
            }
            return sumInd;
        }
    }
// Square the values
// Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. 
// When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public void squareVal(int[] myArray){
        int square=0;
        for (int i=0; i<myArray.length; i++){
            square= myArray[i]*myArray[i];
            myArray[i] = square;
        }
        System.out.println(Arrays.toString(myArray));
    }
// Eliminate Negative Numbers
// Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. 
// When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public void negNumb(int[] myArray){
        for (int i=0; i<myArray.length; i++){
            if (myArray[i]<0){
                myArray[i]=0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }   

// Max, Min, and Average
// Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. 
// The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public int[] maxMinAvg(int[] myArray){
            int max= myArray[0];
            int min= myArray[0];
            int avg=0;
        for (int i=0; i<myArray.length-1; i++){
            if (myArray[i]>max){
                max = myArray[i];
            }
            if (myArray[i]<min){
                min = myArray[i];
            }
            avg = avg + myArray[i];
        }
        avg = avg/myArray.length; 
        return new int[] {max, min, avg};
    }
}