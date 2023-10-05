package ArrayList;
import java.util.ArrayList;
import java.util.Iterator; 

/**
 * RemoveElement
 */
public class RemoveElement {
   
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();


        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        
        //remove element by index
        System.out.println("Remove element by index");
        array.remove(1);          
        System.out.println(array);

        //remove element by index
        System.out.println("\nRemove element by element");
        array.remove(Integer.valueOf(1));
        array.remove(Integer.valueOf(2));     
        System.out.println(array);

        //remove element by iterator
        System.out.println("\nRemove element by iterator");
         

        Iterator itr = array.iterator();

        while (itr.hasNext()) {
            int iterator = (Integer)itr.next();
            if(iterator<3)
               itr.remove();
        }
       System.out.println(array);

    }
    
}