import java.util.ArrayList; //import data type
public class AnimalArrayList {
    public static void main(String[] args){
        //create an ArrayList to store animal names
        ArrayList<String> animals = new ArrayList<>();

        //add animals to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Rhino");
        animals.add("Monkey");
        animals.add("Bear");

        //printout the list
        System.out.println("\n\nOriginal animals in the zoo: \n" + animals);

        //printout the size(number of elements/animals)
        int size = animals.size();
        System.out.println("\nNumber of animals in the zoo: " + size);


        //add more items to the list, they will appear at the last
        animals.add("Fish");
        animals.add("Bird");

        //prinout the updated Arraylist
        System.out.println("\nUpdated 2 more animals in the zoo at the end of the list: \n" + animals);

        //add animals at specific location in the arraylist
        animals.add(1, "Giraffe");
        animals.add(7,"Whale");

        //printouot the updated list
        System.out.println("\nAdd in 2 more animals at different locations: \n" + animals);

        //now remove the first/last animals in the Arraylist
        animals.remove(0);//first
        animals.remove(animals.size()-1); //last
        System.out.println("\nAnimals after removed the 1st and last (Lion & Bird\n" + animals);

        //check if an animal exists
        boolean isMonkey = animals.contains("Monkey");
        if (isMonkey){
            System.out.println("\nThe zoo has Monkey");
        }else{
            System.out.println("\nThe zoo has no Monkey");
        }

        //add in more animals
        animals.add(8,"Crocodile");
        animals.add(9,"Turtle");

        //printout the animals using loop to display in a different way (vertical)
        System.out.println("\nTotal animals in the zoo:");
        for (String animal:animals){
            System.out.println(animal); //note that printout animal NOT entire animals
        }
        // Print the size of the ArrayList after making updates
        int updateSize = animals.size();
        System.out.println("\nSize of the ArrayList after updated: " + updateSize);


    }
}
