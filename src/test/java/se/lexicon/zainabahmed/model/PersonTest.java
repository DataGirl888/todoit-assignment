package se.lexicon.zainabahmed.model;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testInstantiation() {
        //Arrange
        int personID = 2;
        String firstName = "John";
        String lastName ="Bull";

        //Act
        Person aPerson = new Person(personID, firstName, lastName);

        //Assert
        assertEquals(personID, aPerson.getPersonID());
        assertEquals(firstName, aPerson.getFirstName());
        assertEquals(lastName, aPerson.getLastName());
    }
    @Test
    public void testSetters() {
        //Arrange
        int testID = 5;
        String newFirstName = "Joan";
        String newLastName = "of Arc";

        //Act
        Person anotherPerson = new Person(testID, newFirstName, newLastName);
        anotherPerson.setFirstName();
        anotherPerson.setLastName();

        //Assert
        assertEquals(testID, anotherPerson.getPersonID());
        assertEquals(newFirstName, anotherPerson.getFirstName());
        assertEquals(newLastName, anotherPerson.getLastName());
    }

}