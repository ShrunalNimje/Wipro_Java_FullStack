package Projects.Project3.com.mile1.main;

import Projects.Project3.com.mile1.bean.Student;
import Projects.Project3.com.mile1.service.StudentReport;
import Projects.Project3.com.mile1.service.StudentService;

public class StudentMain {
    static Student[] students = new Student[6];

    StudentMain() {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        students[0] = new Student("Shrunal", new int[] {85, 75, 95});
        students[1] = new Student("Nimje", new int[] {25, 85, 45});
        students[2] = new Student(null, new int[] {11, 22, 33});
        students[3] = null;
        students[4] = new Student("Harsh", null);
        students[5] = new Student("Santosh", new int[] {});
    }

    public static void main(String[] args) {
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();

        for (int i = 0; i < students.length; i++) {
            try {
                String result = studentReport.validate(students[i]);
                if (result.equals("VALID")) {
                    String grade = studentReport.findGrades(students[i]);
                    System.out.println("Student " + i + " Grade: " + grade);
                }
            }
            catch (Exception e) {
                System.out.println("Student " + i + " Exception: " + e.getClass().getSimpleName());
            }
        }

        System.out.println("Number of Null objects = " + studentService.findNumberOfNullObjects(students));
        System.out.println("Number of Null names = " + studentService.findNumberOfNullNames(students));
        System.out.println("Number of Null marks = " + studentService.findNumberOfNullMarks(students));
    }
}

