package Projects.Project3.com.mile1.service;

import Projects.Project3.com.mile1.bean.Student;
import Projects.Project3.com.mile1.exception.NullMarksArrayException;
import Projects.Project3.com.mile1.exception.NullNameException;
import Projects.Project3.com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String findGrades(Student s) {
        int [] arr = s.getMarks();
        int sum = 0;

        for (int i : arr) {
            if (i < 35) {
                s.setGrade("F");
                return s.getGrade();
            }
            sum = sum + i;
        }

        if (sum >= 250) {
            return "A+";
        }
        else if (sum >= 200) {
            return "A";
        }
        else if (sum >= 150) {
            return "B";
        }
        else {
            return "C";
        }
    }

    public String validate(Student s) throws NullStudentObjectException, NullNameException, NullMarksArrayException {
        if (s == null) {
            throw new NullStudentObjectException("Student object is null");
        }
        if (s.getName() == null) {
            throw new NullNameException("Student name is null");
        }
        if (s.getMarks() == null) {
            throw new NullMarksArrayException("Marks array is null");
        }
        return "VALID";
    }
}
