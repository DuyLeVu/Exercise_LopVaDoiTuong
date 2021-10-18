package com.company;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number A:");
        double numA = scanner.nextDouble();
        System.out.print("Enter number B:");
        double numB = scanner.nextDouble();
        System.out.print("Enter number C:");
        double numC = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(numA,numB,numC);
        if (quadraticEquation.getDiscriminant() < 0) System.out.println("The equation has no roots");
        else if (quadraticEquation.getDiscriminant() == 0) System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        else System.out.println("The equation has two root "
            + quadraticEquation.getRoot1()
            + " And "
            + quadraticEquation.getRoot2());
    }
}
