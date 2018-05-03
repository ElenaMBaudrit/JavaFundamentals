import java.util.Arrays;

public class Basic13Test {
    public static void main(String[] args){
        Basic13 iD = new Basic13();
        // Declare and create the object ="instance of the Basic13 class"

        // iD.print1To255();

        // iD.printOdds1To255();

        // iD.printSum0To255();
        
        // iD.iterateThroughArr(new int[] {1,3,5,7,9,13});

        // iD.findMax(new int[] {-3, -5, -7});
    
        // iD.getAvg(new int [] {2,10,3});

        // iD.arrayOddList();
        
        // // already calling Greater than Y from the print thingy. In the other file, it returns, and we want to print the result here.
        // System.out.println(iD.greaterThanY(new int[] {1,2,3,4}, 2));

        iD.squareVal(new int[] {10,20,3,-40});

        iD.negNumb(new int[] {1,-2,-3,4});

        System.out.println(Arrays.toString(iD.maxMinAvg(new int [] {1,2,3,4})));
    }
}