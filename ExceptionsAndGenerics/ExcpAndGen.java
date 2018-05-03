import java.util.*;

public class ExcpAndGen{

    public void ExceptionallyGenericLists(ArrayList<Object> myList){
        for (int i = 0; i < myList.size(); i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("The value was changed to integer");
            }
            catch(ClassCastException e){
                System.out.println("Value cannot be changed to integer");
            }
        }
        System.out.println(myList);
    }
}