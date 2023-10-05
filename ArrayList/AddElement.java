package ArrayList;
import java.util.ArrayList;
/**
 * AddElement
 */
 
public class AddElement {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);


        // we can also insert an element into specific index in array
        array.add(3,44);// here we insert 44 at index 3 

        for(Integer arr : array){
            System.out.print(arr + " ");
        }

    }
}