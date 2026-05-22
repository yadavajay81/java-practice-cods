package ab00463240.day1.enumassment;


public class Scheduler {

 // Enum for days of the week
 public enum Day {
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 }

 // Method to assign tasks based on the day using switch-case
 public void assignTask(Day day) {
     System.out.println("Day: " + day);

     switch (day) {
         case MONDAY:
             System.out.println("Task: Team meeting and planning for the week.");
             break;

         case TUESDAY:
             System.out.println("Task: Work on project implementation.");
             break;

         case WEDNESDAY:
             System.out.println("Task: Mid-week progress review.");
             break;

         case THURSDAY:
             System.out.println("Task: Code refactoring and testing.");
             break;

         case FRIDAY:
             System.out.println("Task: Client demo and report submission.");
             break;

         case SATURDAY:
             System.out.println("Task: Team training and skill development.");
             break;

         case SUNDAY:
             System.out.println("Task: Day off! Relax and recharge.");
             break;

         default:
             System.out.println("Invalid day!");
             break;
     }
 }

 // Main method for demonstration
 public static void main(String[] args) {
     Scheduler scheduler = new Scheduler();

     System.out.println("--- Weekly Task Schedule ---\n");

     // Loop through all enum values
     for (Day day : Day.values()) {
         scheduler.assignTask(day);
         System.out.println(); // line break between days
     }
 }
}

