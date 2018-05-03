// Integer getIndexOrNull(String, char)
public class StringManipulatorTesting {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        // String stringManipulator = manipulator.trimAndConcat("    Hello    ","    World    ");
        // System.out.println(stringManipulator); // HelloWorld 
        
        // Get the index of the character and return either the index or null. If the character appears multiple times, return the first index.
        // char letter = 'o';
        // System.out.println(manipulator.getIndexOrNull("Coding", letter));
        // System.out.println(manipulator.getIndexOrNull("Hello World", letter));
        // System.out.println(manipulator.getIndexOrNull("Hi", letter));

// Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null.
        // String word = "Hello";
        // String notSubString = "world";
        // String subString = word.substring(2);
        // System.out.println(manipulator.getIndexOrNull("Hello", subString)); // 2
        // System.out.println(manipulator.getIndexOrNull("World", subString));

// String concatSubstring(String, int, int, String): 
// Get a substring using a starting and ending index, and concatenate that with the second string input to our method.
        
        String stringManipulator = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(stringManipulator); // eworld
    }
}
