package Oops_Inheritance;

// Problem 1
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird pecks at food");
    }

    @Override
    void sleep() {
        System.out.println("Bird sleeps in nest");
    }

    void fly() {
        System.out.println("Bird flies");
    }
}

// Problem 2
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String insuranceNumber;

    public Employee(String name, double annualSalary, int yearStarted, String insuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.insuranceNumber = insuranceNumber;
    }

    public double getAnnualSalary() { return annualSalary; }
    public int getYearStarted() { return yearStarted; }
    public String getInsuranceNumber() { return insuranceNumber; }

    public void setAnnualSalary(double salary) { this.annualSalary = salary; }
    public void setYearStarted(int year) { this.yearStarted = year; }
    public void setInsuranceNumber(String number) { this.insuranceNumber = number; }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + annualSalary);
        System.out.println("Year Joined: " + yearStarted);
        System.out.println("Insurance No: " + insuranceNumber);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();
        a.sleep();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();

        Employee emp = new Employee("Shrunal", 800000, 2023, "IND12345");
        emp.printDetails();
    }
}
