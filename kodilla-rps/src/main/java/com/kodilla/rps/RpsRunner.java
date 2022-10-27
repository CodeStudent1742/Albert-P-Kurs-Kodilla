package com.kodilla.rps;

import com.kodilla.rps.ui.Dialogs;

import java.time.LocalDate;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        boolean end = false;

        /// Starting commends, game construction
        System.out.println("Welcome in Rock Paper Scissors game");
        System.out.println("Please provide your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please provide your quantity of won turns to make a winner");
        int turnsToWin = Integer.parseInt(scanner.nextLine());
        Game game1 = new Game(name, turnsToWin);
        ///
        System.out.println("Game instructions: ");
        System.out.println("Click 1 to play Rock");
        System.out.println("Click 2 to play Paper");
        System.out.println("Click 3 to play Scissors");
        System.out.println("Click x to end current game");
        System.out.println("Click n to run new Game");
        int x = LocalDate.now() - LocalDate.now().minusDays(10);

        ///
//        System.out.println("Turn" + n + "starts");
//        System.out.println("Choose your move");
//        while (!end) {
//            String getKey = (scanner).nextLine();
//            Move move = Dialogs.getNextMove();
//
//            //
//        }

    }
}
