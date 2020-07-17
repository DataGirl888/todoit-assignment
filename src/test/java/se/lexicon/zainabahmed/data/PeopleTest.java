package se.lexicon.zainabahmed.data;

import junit.framework.TestCase;
import org.junit.Test;
import se.lexicon.zainabahmed.model.*;
import se.lexicon.zainabahmed.data.*;
import java.util.Random;


public class PeopleTest extends TestCase {
    @Test
    public void testGetIndividual() {
        //Arrange
        //Act
        //Assert
    }
    @Test
    public void testSize() {
        //Arrange
        //Act
        //Assert
    }
    @Test
    public void testFindAll() {
        //Arrange
        //Act
        //Assert
    }
    @Test
    public void testFindById() {  // this test is not working
        //Arrange
        People people = new People();
        Person[] newMembers = new Person[4];  // creating Array, Person objects to test
        int newMember =0, aZero = 0;
        Random rnd = new Random();

        for (int i =0; i<3; i++){
            newMembers[i] = People.createPerson();
            System.out.println("First Name  " + newMembers[i].getFirstName().toString()); //printing it for my benefit
            System.out.println("PersonID " + newMembers[i].getPersonID()); //printing it for my benefit
        }

        //Person foundPerson = newMembers[rnd.nextInt(3)];
        //Act
        //foundPerson = People.findById(1);
        System.out.println("findByID " + people.findById(2)); //printing it for my benefit

// checking that the name for this ID exists (length non zero), in the array
        //Assert
        assertFalse(people.findById(2).getFirstName().length()==0);
    }

    @Test
    public void testCreatePerson() {
        //Arrange
        Person[] newMembers = new Person[4];
        int newMember =0;

        //Act
        for (int i =0; i<3; i++){
            newMembers[i] = People.createPerson();
            System.out.println("member id " + newMembers[i].getPersonID() + " Name " + newMembers[i].getFirstName());
        }

        //Assert
        assertTrue(newMembers[2].getPersonID() ==3); // randomly checking an assigned personID (index -1)
    }
    @Test
    public void testClear() {
        //Arrange
        //Act
        //Assert
    }
}