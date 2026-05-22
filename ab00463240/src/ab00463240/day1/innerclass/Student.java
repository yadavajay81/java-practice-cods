package ab00463240.day1.innerclass;


public class Student {


 private String studentName;
 private int rollNumber;
 private double marks;

 // Constructor with validation
 public Student(String studentName, int rollNumber, double marks) {
     this.studentName = studentName;
     this.rollNumber = rollNumber;
     setMarks(marks); // validation through setter
 }

 
 public void setMarks(double marks) {
     if (marks < 0 || marks > 100) {
         throw new IllegalArgumentException("Marks must be between 0 and 100.");
     }
     this.marks = marks;
 }

 // Getters
 public String getStudentName() {
     return studentName;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public double getMarks() {
     return marks;
 }

 // Display details
 public void displayStudentDetails() {
     System.out.println("Student Name: " + studentName);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Marks: " + marks);
 }

 // ==========================
 // Inner Class: GradeCalculator
 // ==========================
 public class GradeCalculator {

     public String calculateGrade() {
         // Accessing private member of outer class (marks)
         if (marks >= 90) {
             return "A+";
         } else if (marks >= 80) {
             return "A";
         } else if (marks >= 70) {
             return "B";
         } else if (marks >= 60) {
             return "C";
         } else if (marks >= 50) {
             return "D";
         } else {
             return "F";
         }
     }

     public void displayGrade() {
         System.out.println("Final Grade: " + calculateGrade());
     }
 }

 // ==========================
 // Static Nested Class: GradePolicy
 // ==========================
 public static class GradePolicy {
     public static void showPolicy() {
         System.out.println("\n--- Grading Policy ---");
         System.out.println("90-100 : A+");
         System.out.println("80-89  : A");
         System.out.println("70-79  : B");
         System.out.println("60-69  : C");
         System.out.println("50-59  : D");
         System.out.println("Below 50 : F (Fail)");
     }
 }


 public static void main(String[] args) {
     try {
         // Valid student
    	 Student s1 = new Student("Ajay Bahadur", 101, 85.0);
         s1.displayStudentDetails();

         // Show grading policy (static nested class)
         GradePolicy.showPolicy();

         // Use inner class to calculate grade
         Student.GradeCalculator calc = s1.new GradeCalculator();
         System.out.println("\n--- Grade Calculation ---");
         calc.displayGrade();

         // Invalid marks example
         System.out.println("\n--- Testing Exception Handling ---");
         Student s2 = new Student("Ravi Kumar", 102, 120); // invalid marks
         s2.displayStudentDetails();

     } catch (IllegalArgumentException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

