package se.lexicon.zainabahmed.model;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TodoTest extends TestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGetTodoID() {
        //Arrange
        int testID = 1,
            testID2 = 2,
            testID3 = 3;
        String testDescription = " Eat sleep think Java",
               testDescription2 = "",
                testDescription3 = "";
        boolean testDone = true;
        Person testAssignee = new Person();


        //Act
        Todo testTodo = new Todo(testID, testDescription);
        Todo testTodo2 = new Todo(testID2, testDescription2);
        Todo testTodo3 = new Todo(testID3, testDescription3);
        System.out.println("Task 1 : " + testTodo.getTodoID()  + testTodo.getDescription());
           System.out.println("Task 2 : " + testTodo2.getTodoID()  + testTodo2.getDescription());
        System.out.println("Task 3 : " + testTodo3.getTodoID()  + testTodo3.getDescription());

        //Assert
        assertFalse(testTodo.getTodoID() < 1 ) ;  //ensuring no 0 inputs

    }


}