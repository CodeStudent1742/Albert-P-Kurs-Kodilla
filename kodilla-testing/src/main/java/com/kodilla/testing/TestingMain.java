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

            // Testing Calculator add
            Calculator calculator = new Calculator();
            int addResult = calculator.add(100, 28);
            if (addResult == 128 ) {
                System.out.println("Calculator  add test OK");
            } else {
                System.out.println("Calculator subtract has error!");
            }
            // Testing Calculator subtract
            Calculator calculator2 = new Calculator();
            int subResult = calculator2.subtract(100, 200);
            if (subResult == 100 ) {
                System.out.println("Calculator subtract test OK");
            } else {
                System.out.println("Calculator subtract has error!");
            }
        }
    }
