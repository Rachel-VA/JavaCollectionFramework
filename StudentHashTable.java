import java.util.Hashtable;
import java.util.Enumeration;

public class StudentHashTable {
    public static void main(String[] args) {
        // Create a Hashtable to store student names with their IDs
        Hashtable<Integer, String> students = new Hashtable<>();

        // Adding students to the Hashtable
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Finley");

        // printout all student IDs and names
        System.out.println("\n\nInitial list of students: " + students);

        //get the hashtable size
        int size = students.size();
        System.out.println("\nNumber of students in the table: " + size);

        // Retrieve a student's name using their ID
        String name = students.get(102);
        System.out.println("\nStudent with ID 102: " + name);

        // Checking if a particular ID exists
        if (students.containsKey(104)) {
            System.out.println("\nStudent with ID 104 exists.");
        } else {
            System.out.println("\nStudent with ID 104 does not exist.");
        }

        // Updating a student's name
        students.put(101, "Alex");

        // Removing a student using their ID
        students.remove(103);
        // Displaying the updated list of students
        System.out.println("Updated list of students after removed student 103: " + students);

        // Print the size after removing a student
        System.out.println("\nUpdated size of hashtable after removing a student: " + students.size());

        //adding more students
        students.put(200, "Thu");
        students.put(201, "Phuong");
        System.out.println("\nUpdated students in the table: \n" + students);

        // Print the size after removing a student
        System.out.println("\nUpdated Size of the Hashtable after add in more students: " + students.size());

        // Iterating over student IDs
        System.out.println("\nIterating over student IDs:");
        Enumeration<Integer> studentIds = students.keys();
        while (studentIds.hasMoreElements()) {
            Integer id = studentIds.nextElement();
            System.out.println("Student ID: " + id + ", Name: " + students.get(id));
        }

    }
}

