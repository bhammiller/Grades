package com.example.demo;

import java.util.Scanner;

public class Grades {
    public String grading() {
        Double total_possible_score = 50.;
        Character letter_grade;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter student name");
        String student_name = keyboard.nextLine();
        System.out.println("please enter student number");
        Integer student_number = keyboard.nextInt();
        System.out.println("please enter test score");
        Double test_score = keyboard.nextDouble();
        Double student_percentage = test_score / total_possible_score;
        if ((student_percentage >=90) && (student_percentage <=100)) {
            letter_grade = 'A';
        }
        else if ((student_percentage >=80) && (student_percentage <=89)) {
            letter_grade = 'B';
        }
        else if ((student_percentage >=70) && (student_percentage <=79)) {
            letter_grade = 'C';
        }
        else if ((student_percentage >=60) && (student_percentage <=69)) {
            letter_grade = 'D';
        }
        else {
            letter_grade = 'F';
        }
        String output = ("Student Number is " + student_number + "\nStudent name is " + student_name + "\nStudent's test score is " + test_score + "\nStudent's grade is " + letter_grade);
        System.out.println(output);
        return "Student Number is " + student_number + "<br/>Student name is " + student_name + "<br/>Student's test score is " + test_score + "<br/>Student's grade is " + letter_grade;
    }
}
