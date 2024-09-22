import java.util.Scanner;

public class StudentGradeCalculator {

  // Method to calculate class average
  public static double calculateClassAverage(Student[] students) {
    double totalSum = 0;
    int numberOfGrades = 0;
    for (Student student : students) {
      totalSum += student.calculateAverage();
      numberOfGrades++;
    }
    return totalSum / numberOfGrades;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input for multiple students
    System.out.print("Enter number of students: ");
    int numStudents = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    Student[] students = new Student[numStudents];

    // Loop to input student details
    for (int i = 0; i < numStudents; i++) {
      System.out.println("Enter details for student " + (i + 1) + ": ");
      System.out.print("Name: ");
      String name = scanner.nextLine();
      System.out.print("Student ID: ");
      int studentID = scanner.nextInt();

      System.out.print("Enter number of grades: ");
      int numGrades = scanner.nextInt();
      double[] grades = new double[numGrades];
      for (int j = 0; j < numGrades; j++) {
        System.out.print("Enter grade " + (j + 1) + ": ");
        grades[j] = scanner.nextDouble();
      }
      scanner.nextLine(); // Consume newline

      // Create student object and store in array
      students[i] = new Student(name, studentID, grades);
    }

    // Display individual student details
    System.out.println("\nStudent Details:");
    for (Student student : students) {
      student.displayStudentInfo();
      System.out.println();
    }

    // Calculate and display class average
    double classAverage = calculateClassAverage(students);
    System.out.printf("Class Average: %.2f\n", classAverage);

    // Close the scanner
    scanner.close();
  }
}
