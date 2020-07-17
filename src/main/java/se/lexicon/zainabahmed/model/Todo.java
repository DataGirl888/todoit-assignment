    package se.lexicon.zainabahmed.model;
    import se.lexicon.zainabahmed.data.People;

    import java.util.Random;
    import java.lang.Math;
    import java.util.Arrays;

    public class Todo {
        // attributes / instance variables / fields

        final int todoID;
        String description; // placeHolder = "d";
        boolean done;
        Person assignee = new Person();

        //Constructors
        //No arg Constructor
         public Todo(){
             this(1,"Task");
         }
        //Constructor
        public Todo( int todoId, String description) {
            this.todoID = todoId;
             this.description = description;
        }
        //getters (accessors) and setters (mutators)

        public int getTodoID() {
            return this.todoID;
        }

        public String getDescription() {
            return this.description;
        }
    // Choosing a random task if space or single character passed
        public void setDescription(String description) {
            //int numberTasks = 10;

             String[] defaultTasks = new String[]
                      {"Code", "Debug", "Test", "Chores", "Bills",
                       "Read", "Exercise", "Pray", "Groceries",
                       "Email", "Red tape", "Meditate", "Relax", "Other"};

            Random rnd = new Random();
            int randomTask = rnd.nextInt(defaultTasks.length-1);
            if (description.length() < 2){
                this.description = defaultTasks[randomTask];
            } else {
                this.description = description;
            }

        }

        public boolean isDone() {
            return done;
        }

        public void setDone(boolean done) {
            this.done = done;
        }

        public Person getAssignee() {

            return assignee;
        }

        public void setAssignee(int personID) {
            this.assignee = People.findById(personID);
        }

    }
