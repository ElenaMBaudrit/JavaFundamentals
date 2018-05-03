public class Pythagorean{
    public double calculateHypotenuse(int legA, int legB){
        legA =  legA *  legA;
        legB =  legB *  legB;
        double c = Math.sqrt(legA + legB);
        return  c;
    }
}
