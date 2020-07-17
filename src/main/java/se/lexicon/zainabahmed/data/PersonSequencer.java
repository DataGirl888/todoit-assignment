package se.lexicon.zainabahmed.data;
import se.lexicon.zainabahmed.model.*;

public class PersonSequencer {
    private static int personId = 1;
    //System.out.println("stuff");

    //constructors

    //getters
    public int getPersonId(){
    return PersonSequencer.personId;
    }
    //methods
    public static int nextPersonId()
    {
        return PersonSequencer.personId++;
    }
    public static void reset()
    {
     PersonSequencer.personId = 0;
    }

}

