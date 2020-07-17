package se.lexicon.zainabahmed.data;

import se.lexicon.zainabahmed.model.Todo;
import se.lexicon.zainabahmed.model.Todo;

import java.util.Arrays;

public class TodoItems {

    private static Todo[] doTasks = new Todo[0];


    //constructor
    public TodoItems() {
    }

    //getters, setters
    public static Todo[] getDoTasksasks() {
        return doTasks;
    }

    //methods
    public static int size(Todo[] numberTasks) {
        return numberTasks.length;  //?! expand method to ensure only populated paces are counted
    }

    public static Todo[] findAll(Todo[] allTodos) { // returns Todo Array
        System.out.println(Arrays.toString(allTodos));  //prints it, so far only address
        return allTodos;
    }

    // working here, how to return the stuff
// COMMENTED OUT FOR NOW AS THERE IS AN ERROR UNTIL METHODS ARE WRITTEN
    public Todo findById(int TodoID) {
        int requiredTodoIndex = 0;
        for (int i = 0; i < size(doTasks); i++) {
            if (doTasks[i].equals(TodoID)) {
                //    System.out.println(Arrays.toString(doTasks));
                return doTasks[i];
                //requiredTodoIndex = i;
            } else
            {
                return null;
            }

        }
        return doTasks[requiredTodoIndex];
    }


//    public static Todo createTodo() {  // TodoID from TodoSequencer. Todo setters for names
//        Todo aTodo = new Todo(TodoSequencer.nextTodoId());   //created new Todo
//        Todo[] newComerAdded = Arrays.copyOf(doTasks,doTasks.length+1); // expand Todo[] array by 1
//        newComerAdded[newComerAdded.length-1] = aTodo;
//        doTasks = newComerAdded;  // ??? updating the array with input `    yet findbyID keeps giving null results
//        return aTodo;
//    }

    public static Todo[] clear(Todo[] thePopulation) {  // clears objects by shrinking with copyOf empty array
        //thePopulation = Arrays.copyOf(doTasks, 0);
        //return thePopulation;
        return Arrays.copyOf(doTasks, 0);

    }
/*// override toString
    @Override
    public String toString() {
        return "Number : " + People.size(doTasks) +
                "First Todo : " + People.findById(1) +
                "Second Todo : " + People.findById(2);

    } */
}
