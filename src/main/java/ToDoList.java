import java.util.*;

/**
 * CSAwesome Unit 7 Programming Challenges Criteria
 * 7.2 Programming Challenge: Array to ArrayList
 * Rewrite the following code that uses an Array to use an ArrayList instead. In the comments write why you think an ArrayList is a better data structure to use than an array for this problem.
 * This project is named ToDoList
 */
public class ToDoList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        // Rewrite this code to use an ArrayList instead of an array
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Do homework");
        toDoList.add("Help make dinner");
        toDoList.add("Call grandma");

        // changing element 1
        // rewrite this block for an ArrayList
        // toDoList[1] = "Order pizza";
        toDoList.set(1, "Order pizza");
        System.out.println(toDoList.size() + " things to do!");
        System.out.println("Here's the first thing to do: " + toDoList.get(0));

        // remove item 0 and move everything up
        // rewrite this block for an ArrayList
        // this can be done in 1 command with ArrayList toDoList[0] = toDoList[1];
        toDoList.remove(0);

        // rewrite for an ArrayList
        System.out.println("Here's the next thing to do: " + toDoList.get(0));

        // why is an ArrayList better than an array for a toDoList?
        // type your answer here
        /*
            Since ArrayList changes size dynamically as you add, remove, replace things.
         */
    }
}

/*
    public static void main(String[] args) {
        // Rewrite this code to use an ArrayList instead of an array
        String[] toDoList = new String[3];
        toDoList[0] = "Do homework";
        toDoList[1] = "Help make dinner";
        toDoList[2] = "Call grandma";
        // changing element 1
        // rewrite this block for an ArrayList
        // toDoList[1] = "Order pizza";
        System.out.println(toDoList.length + " things to do!");
        System.out.println("Here's the first thing to do: " + toDoList[0]);

        // remove item 0 and move everything up
        // rewrite this block for an ArrayList
        // this can be done in 1 command with ArrayList toDoList[0] = toDoList[1];
        toDoList[1] = toDoList[2];
        toDoList[2] = "";

        // rewrite for an ArrayList
        System.out.println("Here's the next thing to do: " + toDoList[0]);
        // why is an ArrayList better than an array for a toDoList? // type your answer here
    }
 */
 