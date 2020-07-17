package se.lexicon.zainabahmed;
import se.lexicon.zainabahmed.data.*;
import se.lexicon.zainabahmed.model.*;
import se.lexicon.zainabahmed.data.PersonSequencer;
import se.lexicon.zainabahmed.model.Person;


/**
 *Just a few random tests, checking code as I go along, also doing that in Junit, though
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "TO DO IT" );
        //Person
        String aName = "Carrot";
        System.out.println("PERSON");
        Person anIndividual = new Person(1, "Cat ","Potato");
        System.out.println( "   Person ID: " + anIndividual.getPersonID()
                          + " Forename: " + anIndividual.getFirstName()
                          + " Surname: " + anIndividual.getLastName() );
        Person anIndividual2 = new Person(2, "Tomato ", "Carrot ");
        Person anIndividual3 = new Person(3, "Princess ", "Angel ");
        Person anIndividual4 = new Person(4, "Happy ", "Panda ");
        Person anIndividual5 = new Person(5, "Tsunami ", "Kitten ");
        anIndividual.setFirstName();
        anIndividual.setLastName();
        anIndividual2.setFirstName();
        anIndividual2.setLastName();
        anIndividual3.setFirstName();
        anIndividual3.setLastName();
        System.out.println( " SetPersonForename " + anIndividual.getFirstName() );
        System.out.println( " SetPersonSurname " + anIndividual.getLastName() );
        //System.out.println("Person with toString Override");
        //System.out.println(anIndividual); //override toString method

        //Todo
        Todo aTask = new Todo(1,"Programming assignment");
        System.out.println("TODO");
        System.out.println("   TODO ID: " + aTask.getTodoID()
                       + " Task: " + aTask.getDescription() );

        //PersonSequencer
        PersonSequencer aPersonSequencer = new PersonSequencer();
        //aPersonSequencer.
        System.out.println("PERSONSEQUENCER");
        for (int i =0; i <4; i++) {
            PersonSequencer.nextPersonId();
            System.out.println("   PersonSequencer ID after increment: " + aPersonSequencer.getPersonId());
        }

        PersonSequencer.reset();
        System.out.println("   PersonSequencer ID after reset:  "  + aPersonSequencer.getPersonId() );

        //People
        People population = new People();
        //System.out.println("Population " + population.getClass());
        System.out.println("First person  " + anIndividual
                         + "\nSecond person " + anIndividual2
                         + "\nThird person  " + anIndividual3 );
        People.createPerson();
        population.findById(1);

    }


}
