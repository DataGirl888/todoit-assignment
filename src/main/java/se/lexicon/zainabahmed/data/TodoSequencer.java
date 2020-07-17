package se.lexicon.zainabahmed.data;
import se.lexicon.zainabahmed.model.*;

public class TodoSequencer {
    private static int todoId;

    //constructor
    public TodoSequencer() {
    }

    //getter
    public int getTodoId(){
        return TodoSequencer.todoId;
    }

    //methods
    public static int nextTodoId() {
        return TodoSequencer.todoId++;
    }

    public static void reset(){
        TodoSequencer.todoId =0;
    }

}
