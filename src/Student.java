
public class Student {
  private String name;
  private int studentID;
  private double[] grades;
  private static final double PASS_MARK = 50.0; // Assume passing mark is 50%

  // Constructor
  public Student(String name, int studentID, double[] grades) {
    this.name = name;
    this.studentID = studentID;
    this.grades = grades;
  }

  // Method to calculate average grade
  public double calculateAverage() {
    double sum = 0;
    for (double grade : grades) {
      sum += grade;
    }
    return sum / grades.length;
  }

  // Method to display individual grades
  public void displayGrades() {
    System.out.println("Grades for " + name + " (ID: " + studentID + "): ");
    for (double grade : grades) {
      System.out.println(grade);
    }
  }

  // Method to determine if student passed or failed
  public boolean hasPassed() {
    return calculateAverage() >= PASS_MARK;
  }

  // Method to display student info
  public void displayStudentInfo() {
    System.out.println("Student Name: " + name);
    System.out.println("Student ID: " + studentID);
    System.out.printf("Average Grade: %.2f\n", calculateAverage());
    System.out.println("Status: " + (hasPassed() ? "Passed" : "Failed"));
  }
}
