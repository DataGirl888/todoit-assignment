package se.lexicon.zainabahmed.data;

import se.lexicon.zainabahmed.model.Person;

import java.util.Arrays;
import java.util.Arrays.*;
import java.util.Random;

/**
 PEOPLE CLASS
 */

public class People {
    // !? instantiate it, non null
    private static Person[] individuals = new Person[0];
    //Arrays.fill(individual, 0);

    //constructor
    public People() {
    }

    //getters, setters
    public static Person[] getIndividual() {
        return individuals;
    }

    //methods
    public static int size(Person[] numberPersons) {
        return numberPersons.length;  //?! expand method to ensure only populated paces are counted
    }

    public static Person[] findAll(Person[] allPersons) { // returns person Array
        System.out.println(Arrays.toString(allPersons));  //prints it, so far only address
        return allPersons;
    }

    // working here, how to return the stuff
// COMMENTED OUT FOR NOW AS THERE IS AN ERROR UNTIL METHODS ARE WRITTEN
    public static Person findById(int personID) {
        int requiredPersonIndex = 0;
        for (int i = 0; i < size(individuals); i++) {
            if (individuals[i].equals(personID)) {
            //    System.out.println(Arrays.toString(individuals));
                requiredPersonIndex = i;
                return individuals[i];

            }
            return individuals[requiredPersonIndex];
        }
        return individuals[requiredPersonIndex];
    }


    public static Person createPerson() {  // personID from PersonSequencer. Person setters for names
     Person aPerson = new Person(PersonSequencer.nextPersonId());   //created new person
     Person[] newComerAdded = Arrays.copyOf(individuals,individuals.length+1); // expand Person[] array by 1
        newComerAdded[newComerAdded.length-1] = aPerson;
        individuals = newComerAdded;  // ??? updating the array with input `    yet findbyID keeps giving null results
        return aPerson;
    }

    public static Person[] clear(Person[] thePopulation) {  // clears objects by shrinking with copyOf empty array
        //thePopulation = Arrays.copyOf(individuals, 0);
        //return thePopulation;
        return Arrays.copyOf(individuals, 0);

    }
/*// override toString
    @Override
    public String toString() {
        return "Number : " + People.size(individuals) +
                "First Person : " + People.findById(1) +
                "Second Person : " + People.findById(2);

    } */
}
