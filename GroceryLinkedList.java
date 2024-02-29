//import data type-LinkedList
import java.util.LinkedList;

public class GroceryLinkedList {
    public static void main(String[] args){
        //create a LinkedList to store data/grocery items
        LinkedList<String> groceries = new LinkedList<>();

        //add items to the LinkedList
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Grape");
        groceries.add("Coconut");
        groceries.add("Dragon fruit");

        //Printout all items in the LinkedList
        System.out.println("\n\n\tInitial grocery List: \n" + groceries);

        //add an item at the first position
        groceries.addFirst("Potato Bread");

        //add an item at the last position of the LinkedList
        groceries.addLast("Lobster");

        //now printout the updated list
        System.out.println("\n\tThe grocery list has been added first/last items: \n" + groceries);

        //To add an item that is NOT first/last in the list and at a specific location, use index
        groceries.add(2, "Bacon");

        //now print out the updated list
        System.out.println("\nGrocery list after added an item in index 2 between Orange and Banana:\n " + groceries);

        //add another item in the list at a different position/index 1
        groceries.add(1,"Multi-kid vitamin");

        //printout the updated list
        System.out.println("\nGrocery list after added an item at index 1 before orange: \n" + groceries);

        //remove an item in the list using similar technique as add items
        groceries.remove("Banana");

        //printout the list
        System.out.println("\n The list after removed banana: \n" + groceries);

        //remove last/first item
        groceries.removeLast();

        //printout the updated list
        System.out.println("\nThe list after removed the list item (Lobster): \n" + groceries);

        System.out.println("\nDisplay items in the list vertical using a loop\n");
        for(String item:groceries){
            System.out.println(item);
        }


    }
}
