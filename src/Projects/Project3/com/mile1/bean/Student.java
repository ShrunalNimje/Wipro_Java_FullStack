package Projects.Project3.com.mile1.bean;

public class Student {

    private String name;
    private String grade;
    private int[] marks;

    public Student() {

    }

    public Student(String name,int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public int[] getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
