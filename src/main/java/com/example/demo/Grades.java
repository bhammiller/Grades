package com.example.demo;

import java.util.Scanner;

public class Grades {
    Double total_possible_score = 50.;
    Character letter_grade;
    Integer student_number;
    String student_name;
    Double test_score;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter student name");
    String fence_type = keyboard.nextLine();
    System.out.println("please enter length of fence perimeter");
    Double fence_footage = keyboard.nextDouble();
    System.out.println("please enter number of gates");
    number_gates = keyboard.nextInt();
    Double student_percentage = test_score / total_possible_score;
    IF student_percentage is between 90 and 100 THEN
            letter_grade = 'A';
    ELSE IF student_percentage is between 80 and 89 THEN
            letter_grade = B
    ELSE IF student_percentage is between 70 and 79 THEN
            letter_grade = C
    ELSE IF student_percentage is between 60 and 69 THEN
            letter_grade = D
    ELSE
            letter_grade = F
    ENDIF

    Print student_number, student_name, test_score, letter_grade
}
