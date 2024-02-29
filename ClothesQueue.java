import java.util.LinkedList;
import java.util.Queue;
public class ClothesQueue {
    public static void main(String[] args){
        //create a Queue using LinkedList to store item clothes
        Queue<String> clothesQueue = new LinkedList<>();

        // Add items to the Queue
        clothesQueue.add("Shirts");
        clothesQueue.add("Pants");
        clothesQueue.add("Dresses");
        clothesQueue.add("Skirts");
        clothesQueue.add("jeans");


        //peek at the front item without removing it
        String frontItem = clothesQueue.peek();
        System.out.println("\n\nFront item: " + frontItem);

        //printout all items in the queue
        System.out.println("\nCurrent items in the queue:");
        for (String item: clothesQueue){
            System.out.println("Item: " + item);
        }

        // Printout the size of the queue
        int queueSize = clothesQueue.size();
        System.out.println("\nQueue size: " + queueSize);

        //Remove a specific item (Pants) from the queue. need to use helper metthod below
        removeItemFromQueue(clothesQueue, "Pants");

        // Displaying the updated items in the queue
        System.out.println("\nUpdated items in the queue after removed pants:");
        for (String item : clothesQueue) {
            System.out.println("Item: " + item);
        }

        // Displaying and removing all items from the queue
       // while (!clothesQueue.isEmpty()) {
         //   String item = clothesQueue.poll();
            //System.out.println("Removed: " + item);
       // }

        // Printing the updated size of the queue (should be 0)
        queueSize = clothesQueue.size();
        System.out.println("\nUpdated queue size: " + queueSize);

    }
    //create a helper method outside of the main()
    private static void removeItemFromQueue(Queue<String> queue, String itemToRemove){
        Queue<String> tempQueue = new LinkedList<>();

        //poll items from the original queue and add in to the temp queue until the Pants to remove it
        while (!queue.isEmpty()){
            String item = queue.poll();
            if (!item.equals(itemToRemove)){
                tempQueue.add(item);
            }
        }

        //add the items back to the original queue
        while (!tempQueue.isEmpty()){
            queue.add(tempQueue.poll());
        }
    }
}
