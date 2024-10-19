import java.util.Collection; 
import java.util.LinkedList; 

class CollectionPractical1 {     
    public static void main(String[] args) {         
        Collection<Integer> c = new LinkedList<>(); 
        c.add(2);         
        c.add(3);         
        c.add(5);         
        c.add(6);         
        c.add(7);  
        System.out.println("Collection is empty?:"+c.isEmpty());
        System.out.println("Size:"+c.size());	
        int elementToCheck = 5;
        System.out.println("Collection contains"+ elementToCheck + "? :" + c.contains(elementToCheck));	
        int elementToRemove = 7;
        c.remove(elementToRemove);
        System.out.println("Removed element: " + elementToRemove);
        System.out.println(c);
    }      
}
