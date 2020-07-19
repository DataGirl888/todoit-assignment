package se.lexicon.zainabahmed.model;
import java.util.Random;
import java.lang.Math;

/**
 * ASSIGNMENT 03 OOP TODO_IT
 */
public class Person {
    //fields
    final int personID;  //initialize in constructor
    String firstName, lastName;

    //Multiple constructors
    //No arg constructor, setting defaults
    public Person() {
        this(1, "Forename", "Surname");
    }
    //Constructor, personID and the setters to randomly generate the names
    public Person(int personID) {
        this.personID = personID;
        setFirstName();
        setLastName();
    }
    //Constructor, all values
    public Person(int personID, String firstName, String lastName) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters (Accessors) and setters (Mutators)
    public int getPersonID(){
    return personID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName() {       // ASCII dec codes A-Z  65-90, a-z 97-122
        String alphabet = "aeiouaeioubcdefghijklmnopqrstuvwxyzaeiou",  //adding extra vowels in my seed string
               vowels = "aeiou",                          //ASCII decimal lower 97, 101, 105, 111, 117
               consonants = "bcdfghjklmnpqrstvwxyz",
               space = " ",                             // ascii dec code   32
               firstLetter,
               addVowel;
        int nameLength = 3;
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(nameLength);
        for (int i =0; i < nameLength; i++){
                sb.append(alphabet.charAt(rnd.nextInt(alphabet.length()-1)));  // generate string of length nameLength
        }
        sb.insert(rnd.nextInt(nameLength),vowels.charAt(rnd.nextInt(vowels.length()-1)));  // adding a vowel
        firstLetter =  sb.substring(0,1).toUpperCase();   // Capitalizing first letter, replacing in name
        sb.replace(0,1, firstLetter);
        this.firstName = sb.toString();    //converting to string and setting to object local variable first name
        System.out.println(this.firstName);  //printing for my own reference
        //newForename = sb.toString();
        //this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName() {
        String alphabet = "aeiouaeioubcdefghijklmnopqrstuvwxyzaeiou",  //adding extra vowels in my seed string
                vowels = "aeiou",                          //ASCII decimal lower 97, 101, 105, 111, 117
                firstLetter;
        int nameLength = 4;
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(nameLength);
        for (int i =0; i < nameLength; i++){
            sb.append(alphabet.charAt(rnd.nextInt(alphabet.length()-1)));     // generate random name
        } //BELOW: making sure there is at least one vowel
        sb.insert(rnd.nextInt(nameLength),vowels.charAt(rnd.nextInt(vowels.length()-1)));  // adding a vowel
        firstLetter =  sb.substring(0,1).toUpperCase();   // Capitalizing first letter
        sb.replace(0,1, firstLetter);  // Replacing first letter CAPITALIZED
        this.lastName = sb.toString();    //converting to string and setting to object local variable first name
        //this.lastName= newLastName;
    }

    //Method, toString override
    @Override
    public String toString(){
        return " ID: "+ this.personID
             + " FIRST NAME: " + this.firstName
             + " LAST NAME: " +  this.lastName;
    }  // (only  methods required in instructions to be included)

}
