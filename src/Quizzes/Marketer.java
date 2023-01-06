package Quizzes;// Jon Formantes
// CS 211
// Winter 2023 - 1/6/2023
// Marketer class that extends Employee - has getSalary which provides 10000 more and a toString which prints a phrase


import Chapter9a.Employee;

public class Marketer extends Employee {

    // returns $10,000 more than employee salary
    @Override
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }

    // returns string of phrase "Act now while supplies last"
    public String advertise() {
        return "Act now, while supplies last!";
    }

    // returns string of phrase
    public String toString() {
        return "Act now, while supplies last!";
    }

}