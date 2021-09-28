package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total Number of Marks");
        int totalMarks = input.nextInt();
        System.out.println("Enter the number of marks achieved by student");
        int marksAchieved = input.nextInt();

        int gradePercentage = ((marksAchieved / totalMarks) * 100);

        if (gradePercentage >= 80) {
            System.out.println("Grade Achieved is an A");

        } if (gradePercentage <= 79) && (gradePercentage >= 70) {
            System.out.println("Grade Achieved is a B");
        }
            if (gradePercentage ) {

            }
            }
            }
        }
