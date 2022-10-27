package com.kodilla.exception.test;


public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException  {

        double result = 0;
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return  a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 not allowed");
//            throw new ArithmeticException();
            return 0;
        } finally {
            System.out.println("Something that will be done always");
        }
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
