import java.util.Stack;
public class FoodStack {
    public static void main(String[] args){
        //create a Stack to store food items
        Stack<String> foodStack = new Stack<>();
        //push items onto the stack
        foodStack.push("Pizza");
        foodStack.push("Burger");
        foodStack.push("Hot dog");
        foodStack.push("Chicken fried");
        foodStack.push("Chicken soup");
        foodStack.push("Seafood Salad");

        //get the size of the stack
        int stackSize = foodStack.size();
        //printout the size
        System.out.println("\nStack size: " + stackSize);

        //printout the top item in the stack, using peek(), which means the item was added last
        System.out.println("\n\nTop of the stack (Seafood salad): " + foodStack.peek());



        //using pop() to removing and retrieving all elements one by one from top to bottom in the foodStack.
        while (!foodStack.isEmpty()){
            System.out.println("\nPop all the items and display them: " + foodStack.pop());
        }

        //checking to see if the stack is empty
        System.out.println("\nIs the stack empty?\n" + foodStack.isEmpty());

        //add more items into the stack again
        foodStack.push("Rice noddle soup");
        foodStack.push("Seaweed soup");
        foodStack.push("Rice paper");

        //print out the new items
        System.out.println("\nDisplay the top item (Rice paper): " + foodStack.peek());

        //print the updated stack
        System.out.println("\nUpdated stack: \n" + foodStack);

        //need to use a helper method to remove a specific item from the stack
        removeItemFromStack(foodStack, "Seaweed soup");

        //printout
        System.out.println("\nStack after removing Seaweed soup: \n" + foodStack);

        //get the updated stack size
        stackSize = foodStack.size();
        //printout the size
        System.out.println("\nThe updated stack size: " + stackSize);

    }
    //helper method
    private static void removeItemFromStack(Stack<String> stack, String itemToRemove){
        Stack<String> tempStack = new Stack<>();

        //pop items from the original stack and push them on the temp stack until the item (Seaweed soup) to remove it
        while (!stack.isEmpty()){
            String item = stack.pop();
            if(!item.equals(itemToRemove)){
                tempStack.push(item);
            }

        }
        //push the items back to the original stack
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }
}
