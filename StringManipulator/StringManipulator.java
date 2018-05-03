// // Create a StringManipulator class that implements the following methods:

// // String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string.

// // StringManipulator manipulator = new StringManipulator();
// // String str = manipulator.trimAndConcat("    Hello     ","     World    ");
// // System.out.println(str); // HelloWorld 


// public class StringManipulator {
//     // public String trimAndConcat (String firstWord, String secondWord){
// //         String concatWd = firstWord.concat(secondWord);
// //         System.out.println(firstWord.trim()+ secondWord.trim()); // HelloWorld 
// //     return concatWd;
// //     }
// // }
  
// // Integer getIndexOrNull(String, char): 
// // Get the index of the character and return either the index or null. If the character appears multiple times, return the first index.

//     // public Object getIndexOrNull(String bunchofletters, char letter){
//         // int a = bunchofletters.indexOf(letter);
//     //     if (a == -1){
//     //         return null;
//     //     }
//     //     else{
//     //         return a;
//     //     }
//     // }
// // Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null.        StringManipulator manipulator = new StringManipulator();
//     // public Object getIndexOrNull(String getSubString, String subString){
//     //     int a = getSubString.indexOf(subString);
//     //     if (a == -1){
//     //         return null;
//     //     }
//     //     else{
//     //         return a;
//     //     }
//     // }

// // String concatSubstring(String, int, int, String): 
// // Get a substring using a starting and ending index, and concatenate that with the second string input to our method.
    public String concatSubstring(String firstWd, int subSt, int subSt2, String lastWd){
        String word = (firstWd.substring(1,2)).concat(lastWd);
        return word;
    }
}

