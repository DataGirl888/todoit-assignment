package se.lexicon.zainabahmed.data;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Sequencer;

public class PersonSequencerTest extends TestCase {
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }
    @Test
    public void testIncrementID() {
        //Arrange
        PersonSequencer apersonSequencer = new PersonSequencer();

        //Act
        for (int i =0; i<3; i++) {
            PersonSequencer.nextPersonId();
            System.out.println("ID incremented to: " + apersonSequencer.getPersonId());
        }
        System.out.println("Final ID: " + apersonSequencer.getPersonId());

        //Assert
        assertTrue(apersonSequencer.getPersonId()==3);
    }
    @Test
    public void testReset() {
        //Arrange
        PersonSequencer pSequencer = new PersonSequencer();

        //Act
        for (int i =0; i<5; i++) {
            PersonSequencer.nextPersonId();
            System.out.println("ID incrementing: " + pSequencer.getPersonId());
        }
        System.out.println("Current ID: " + pSequencer.getPersonId());
        PersonSequencer.reset();
        System.out.println("ID after reset: " + pSequencer.getPersonId());
        //Assert
        assertTrue(pSequencer.getPersonId()==0);
    }
}