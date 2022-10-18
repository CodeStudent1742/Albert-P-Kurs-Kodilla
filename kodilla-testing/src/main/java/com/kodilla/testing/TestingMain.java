package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

        public static void main(String[] args) {

            // Testing SimpleUser class
            SimpleUser simpleUser = new SimpleUser("theForumUser");
            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")) {
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }

            // Testing Calculator class
            Calculator calculator = new Calculator();
            int addResult = calculator.add(100, 28);
            int subResult = calculator.subtract(100, 200);
            if (addResult == 128 && subResult == 100) {
                System.out.println("Calculator test OK");
            } else {
                System.out.println("Calculator has error!");
            }
        }
    }
