package ArrayList;

import java.util.ArrayList;

public class UpdateElement {
    
    public static void main(String[] args) {
           
             ArrayList<Integer>  arrlist = new ArrayList<>(); 
  
            // Populating arrlist1 
            arrlist.add(1); 
            arrlist.add(2); 
            arrlist.add(3); 
            arrlist.add(4); 
            arrlist.add(5); 

            // update an element using the set(index,newElement)
            arrlist.set(3,44);
            System.out.println(arrlist);

    }
}
