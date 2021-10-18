package com.company;

public class QuadraticEquation {
    private double numberA;
    private double numberB;
    private double numberC;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public double getNumberC() {
        return numberC;
    }

    public double getDiscriminant(){
        double numDelta = Math.pow(numberB,2) - 4*numberA*numberC;
        return numDelta;
    }
    public double getRoot1(){
        double root1 = (-numberB + Math.pow(getDiscriminant(),0.5))/(2*numberA);
        return root1;
    }

    public double getRoot2(){
        double root2 = (-numberB - Math.pow(getDiscriminant(),0.5))/(2*numberA);
        return root2;
    }
}
