package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private boolean end;
    private final String name;
    private final int turnsToWin;
    private int computerWins = 0;
    private int userWins = 0;

    public Game(String name, int turnsToWin) {
        this.name = name;
        this.turnsToWin = turnsToWin;
    }

    public String getName() {
        return name;
    }

    public int getTurnsToWin() {
        return turnsToWin;
    }

    public void setComputerWins(int computerWins) {
        this.computerWins = computerWins;
    }

    public void setUserWins(int userWins) {
        this.userWins = userWins;
    }

    public int getComputerWins() {
        return computerWins;
    }

    public int getUserWins() {
        return userWins;
    }
    public static PlayCommand computerMove() {
        List<PlayCommand> pcCommands = Arrays.asList(PlayCommand.ROCK, PlayCommand.PAPER, PlayCommand.SCISSORS);
        Random random = new Random();
        int n = random.nextInt(3);
        return pcCommands.get(n);
    }

    public static boolean PlayerWin(PlayCommand a, PlayCommand b) {
        if (a == PlayCommand.ROCK && b == PlayCommand.SCISSORS
                || a == PlayCommand.PAPER && b == PlayCommand.ROCK
                || a == PlayCommand.SCISSORS && b == PlayCommand.PAPER) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ComputerWin(PlayCommand a, PlayCommand b) {
        if (b == PlayCommand.ROCK && a == PlayCommand.SCISSORS
                || b == PlayCommand.PAPER && a == PlayCommand.ROCK
                || b == PlayCommand.SCISSORS && a == PlayCommand.PAPER) {
            return true;
        } else {
            return false;
        }
    }


    public static void newGame() {
        /// Starting commends, game construction
        System.out.println("Welcome in Rock Paper Scissors game");
        System.out.println("Please provide your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please provide number of  turns won to be the winner");
        int turnsToWin = Integer.parseInt(scanner.nextLine());
        Game game = new Game(name, turnsToWin);
        Game.instruction();
        game.play(game);
    }

    public void play(Game game) {
        Scanner scanner = new Scanner(System.in);
        while (!end) {
            System.out.println("Please make a move");
            String getKey = scanner.nextLine();
            PlayCommand player = PlayCommand.Of(getKey);
            PlayCommand pc = Game.computerMove();

            if (player == pc) {
                System.out.println("DRAW  Your and pc move is:" + player);
                System.out.println("Player  current score is: "+ game.getUserWins() + " Computer current score is: "+ game.getComputerWins());
            }
            if (Game.PlayerWin(player, pc)) {
                game.setUserWins(game.getUserWins() + 1);
                System.out.println("You Win. Your move: " + player + " Computer move: " + pc);
                System.out.println("Player  current score is: "+ game.getUserWins() + " Computer current score is: "+ game.getComputerWins());
            }
            if (Game.ComputerWin(player, pc)) {
                game.setComputerWins(game.getComputerWins() + 1);
                System.out.println("Computer Win. Your move: " + player + " Computer move: " + pc);
                System.out.println("Player  current score is: "+ game.getUserWins() + " Computer current score is: "+ game.getComputerWins());
            }
            if (player == PlayCommand.ENDGAME) {

                boolean checker = false;
                while (!checker) {
                    System.out.println("Do you really want to end the Game? \n Please click y or n");
                    String check = scanner.nextLine();
                    if (check.equals("y")) {
                        System.out.println("You choose to end the game. Game closed");
                        end = true;
                        checker = true;
                    } else if (check.equals("n")) {
                        System.out.println("You choose to continue the game");
                        checker = true;
                    } else {
                        System.out.println("You inputted wrong key");
                        checker = false;
                    }
                }
            }
            if (player == PlayCommand.NEWGAME) {
                boolean checker = false;
                while (!checker) {
                    System.out.println("Do you really want to end the Game? \n Please click y or n");
                    String check = scanner.nextLine();
                    if (check.equals("y")) {
                        System.out.println("You choose to start new game. Game restarting");
                        checker = true;
                        Game.newGame();
                    } else if (check.equals("n")) {
                        System.out.println("You choose to continue the game");
                        checker = true;
                    } else {
                        System.out.println("You inputted wrong key");
                        checker = false;
                    }
                }
            }
            game.winnerChecker(game);
        }
    }

    public void winnerChecker(Game game) {
        if (computerWins == turnsToWin) {
            System.out.println("Computer wins. Computer score:" + computerWins + ", " + name + " score is: " + userWins);
            game.ifWantToPlayNewGame();
        }
        if (userWins == turnsToWin) {
            System.out.println(name + " wins. Computer score:" + computerWins + ", " + name + " score is: " + userWins);
            game.ifWantToPlayNewGame();
        }

    }

    public void ifWantToPlayNewGame() {
        Scanner scan = new Scanner(System.in);
        boolean checker = false;
        while (!checker) {
            System.out.println("If you want to play new Game click n if you want to quit click x");
            String getKey = scan.nextLine();
            if (getKey.equals("x")) {
                end = true;
                checker = true;
                System.out.println("You choose to end the game. Game closed");
            } else if (getKey.equals("n")) {
                System.out.println("You choose to start new game");
                checker = true;
                Game.newGame();
                end = true;
            } else {
                System.out.println("You inputted wrong key");
                checker = false;
            }
        }
    }
    public static void instruction(){
        System.out.println("Game instructions: ");
        System.out.println("Click 1 to play Rock");
        System.out.println("Click 2 to play Paper");
        System.out.println("Click 3 to play Scissors");
        System.out.println("Click x to end current game");
        System.out.println("Click n to run new Game");
    }
}



