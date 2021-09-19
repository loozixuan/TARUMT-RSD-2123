/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Loo Zi Xuan
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class StudentScoreListApp {

    private ArrayList<Integer> scoreList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void displayStudentScores() {
        System.out.println("\n=====================");
        System.out.println(" Student Score List ");
        System.out.println("=====================");
        System.out.printf("%s  %s\n", "No.", "Test Scores");
        for (int i = 0; i < scoreList.size(); i++) {
            System.out.printf("%2d.  %6d\n", (i + 1), scoreList.get(i));
        }
    }

    public void addStudentScore() {
        displayStudentScores();
        System.out.print("\nEnter student score: ");
        int score = scanner.nextInt();
        scoreList.add(score);
    }

    public void displayLowestScore() {
        int lowest = scoreList.get(0);
        for (int i = 1; i < scoreList.size(); i++) {
            if (scoreList.get(i) < lowest) {
                lowest = scoreList.get(i);
            }
        }
        System.out.println("\nLowest Score: " + lowest);
    }

    public void displayHigestScore() {
        int higest = scoreList.get(0);
        for (int i = 1; i < scoreList.size(); i++) {
            if (scoreList.get(i) > higest) {
                higest = scoreList.get(i);
            }
        }
        System.out.println("\nHigest Score: " + higest);
    }

    public void displayAverageScore() {
        int total = 0;
        float avg = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            total += scoreList.get(i);
            avg = (float) total / scoreList.size();
        }
        System.out.println("\nAverage Score is " + avg);
    }

    public void menu() {

        int choice = 0;

        do {
            System.out.println("\n======================");
            System.out.println("Student Score List App");
            System.out.println("======================");
            System.out.println("1. Add a new student score");
            System.out.println("2. Display all the test scores");
            System.out.println("3. Display Lowest Score in the list");
            System.out.println("4. Display Highest Score in the list");
            System.out.println("5. Display Average of the scores in the list");
            System.out.print("Enter choice (1-4): ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudentScore();
                    break;
                case 2:
                    displayStudentScores();
                    break;
                case 3:
                    displayLowestScore();
                    break;
                case 4:
                    displayHigestScore();
                    break;
                case 5:
                    displayAverageScore();
                    break;
                default:
                    System.out.println("Exiting program...");
            }
        } while (choice >= 1 && choice <= 5);
    }

    public static void main(String[] args) {
        StudentScoreListApp s = new StudentScoreListApp();
        s.menu();
    }
}
