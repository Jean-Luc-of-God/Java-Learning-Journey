package oop.inheritence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Math math1 = new Math();

        System.out.print("Enter course Level: ");
        math1.mathLevel = sc.nextLine();
        System.out.print("Enter focus Area: ");
        math1.focusArea = sc.nextLine();
        System.out.print("Enter instructor Name: ");
        math1.instructorName = sc.nextLine();
        System.out.print("Enter credits: ");
        math1.credits = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course Id: ");
        math1.courseId = sc.nextLine();

        System.out.println(math1.toString());
    }




}
