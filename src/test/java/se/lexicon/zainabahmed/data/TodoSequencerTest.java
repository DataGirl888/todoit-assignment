package se.lexicon.zainabahmed.data;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TodoSequencerTest extends TestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }
    @Test
    public void testNextTodoId() {
        //Arrange
        TodoSequencer todoSequencer = new TodoSequencer();
        int todo1, todo2, todo3;


        //Act
        TodoSequencer.nextTodoId();
        todo1 = todoSequencer.getTodoId();
        TodoSequencer.nextTodoId();
        todo2 = todoSequencer.getTodoId();
        TodoSequencer.nextTodoId();
        todo3 = todoSequencer.getTodoId();

        //Assert
        assertTrue(todo1 == 1);
        assertTrue(todo2 == 2);
        assertTrue(todo3 == 3);
    }

}