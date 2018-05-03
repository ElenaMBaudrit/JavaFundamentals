import java.util.*;

class ExcpAndGenTest{
    public static void main(String[] args) {
    ExcpAndGen intList = new ExcpAndGen();
    ArrayList<Object> myList = new ArrayList<>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");
    intList.ExceptionallyGenericLists(myList);
    }
}