import java.util.*;

public class Puzzling{
// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
// Print the sum of all numbers in the array. 
// Also have the function return an array that only includes numbers that are greater than 10 
    // public ArrayList<Integer> firstPuzzle(int[] firstP){
    //     ArrayList<Integer> myArray = new ArrayList<Integer>(); 
    //     int sum = 0;
    //     for (int i = 0; i< firstP.length; i++){
    //         sum = sum + i;
    //         System.out.println(sum);
    //         if (firstP[i] >= 10){
    //             myArray.add(firstP[i]);
    //         }
    //     }
    //     return myArray;
    // }
// Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
// Shuffle the array and print the name of each person. 
// Have the method also return an array with names that are longer than 5 characters.
    // public List secondPuzzle(String[] names){
    //     List<String> names_list = Arrays.asList(names);
    //     Collections.shuffle(names_list);
    //     System.out.println(names_list);
    //     return names_list; 
    //     } 
    // }  
    public ArrayList<String> secondPuzzle(String[] names){
        ArrayList<String> nameThis = new ArrayList<String>();  
        for (int i=0; i<names.length; i++){
            char[] word = names[i].toCharArray();
            if (word.length>5){
                nameThis.add(names[i]);
            }
        }
        System.out.println(nameThis);
        return nameThis;
    }
// Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
// Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. 
// If the first letter in the array is a vowel, have it display a message
    // public void thirdPuzzle(String[] aBCD){
    //     List<String> aBCDList = Arrays.asList(aBCD);
    //     Collections.shuffle(aBCDList);
    //     String firstChar = aBCDList.get(0);
    //     String lastChar = aBCDList.get(25);
    //     System.out.println(aBCDList); 
    //     System.out.println(firstChar);    
    //     System.out.println(lastChar); 
    // }

// Generate and return an array with 10 random numbers between 55-100.
// The new Random().nextInt((max - min) + 1) + min, replaces "element" (to be added).
    // public ArrayList<Integer> tenRandom55to100 (){
    //     ArrayList<Integer> newArray = new ArrayList<Integer>();
    //     for (int i = 0; i < 10; i++) {
    //         newArray.add(new Random().nextInt((100 - 55) + 1) + 55);
    //     }
    //     return newArray;
    // }
// Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). 
// Display all the numbers in the array. 
// Next, display the minimum value in the array as well as the maximum value.

    // public ArrayList<Integer> tenRandomNum55To100SortedMinMax(){
    //     ArrayList<Integer> newArr = new ArrayList<Integer>();
    //     for (int i=0; i<10; i++){
    //         newArr.add(new Random().nextInt((100 - 55) + 1) + 55);
    //     }
    //     System.out.println(newArr);
    //     Collections.sort(newArr); //Comentario as per Esteban's recommendation. Actually, this sort-thing helps the newArr elements to be in asc order.
    //     Integer min = newArr.get(0);
    //     Integer max = newArr.get(9);
    //     System.out.println(min);
    //     System.out.println(max);
    //     return newArr;
    // }
// Create a random string that is 5 characters long.
    // public void newRandomString(){
    //     String alphabet = "abcdefghijklmnopqrstuvwxyz";
    //     String newString = "";
    //     Random random = new Random();
    //     int randomLen = 1+random.nextInt(5);
    //     for (int i = 0; i <5; i++) {
    //         char c = alphabet.charAt(random.nextInt(26));
    //         newString+=c;
    //     }
    //     System.out.print(newString);
    // }
// Generate an array with 10 random strings that are each 5 characters long
    public void new10RandomString(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        for (int i = 0; i<10; i++){
            String newString = "";
            for (int x = 0; x <5; x++) {
                char c = alphabet.charAt(random.nextInt(26));
                newString+=c;
            }
        System.out.println(newString);
        }
    }
}