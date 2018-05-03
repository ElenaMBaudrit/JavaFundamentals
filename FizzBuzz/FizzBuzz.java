public class FizzBuzz {
    public String fizzBuzz(int number) {
        String condThree = "Fizz";
        String condFive = "Buzz";
        String condThreeFive = condThree.concat(condFive);
        String notDiv = String.format("%s is not divisible by 3 nor 5", number);
        if (number%5 ==0 && number%3 == 0){
            return condThreeFive;
        }
        else if (number %3 == 0){
            return condThree;
        }
        else if (number%5 ==0){
            return condFive;
        }
        else{
            return notDiv;
        }
    }
}