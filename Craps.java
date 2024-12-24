// project name: Casino Project
// project author: Bruno Rybicki

// import libraries
import java.util.*;
import java.lang.*;
import java.io.*;

public class Craps {
    // global variables
    static Scanner scan = new Scanner ( System.in );
    static boolean done, undecided, chance, ok;
    static String answer;
    static Die d1, d2;
    static int sum, point_value;
    static int played_games = 0, wins = 0, loses = 0;
    static int two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0, twelve = 0;

    public static void main (String[] args) {
        // main program
        d1 = new Die(6);
        d2 = new Die(6);

        // welcome message + explanation of rules
        System.out.println("Welcome to the Game of Craps!");
        System.out.println("");
        System.out.println("RULES OF THE GAME");
        System.out.println("A round consists of a series of rolls of two regular 6-sided dice,");
        System.out.println("where the rolled value is the sum of the two dice.");
        System.out.println("");
        System.out.println("If the player/shooter rolls a 7 or 11 on the first roll then the");
        System.out.println("player wins, if the first roll is a 2, 3, or 12 then the casino");
        System.out.println("wins and the player loses. In both cases, the round finishes.");
        System.out.println("");
        System.out.println("Any other first roll is 'undecided' and the rolled value becomes");
        System.out.println("the player's 'Point-value'. The player then continues to roll the");
        System.out.println("dice until a 7 is rolled (player loses) or the Point-value is");
        System.out.println("rolled again (player wins) … whichever happens first.");
        
        // game
        done = false;
        while (!done) {
            // 1st roll
            System.out.print("\nPress [enter] to roll the dice: ");
            answer = scan.nextLine();
            undecided = false;
            d1.roll();
            d2.roll();
            sum = d1.getFaceValue() + d2.getFaceValue();
            played_games++;
            if (sum == 2 || sum == 3  || sum == 12) {
                System.out.println("The score is " + sum + ".");
                System.out.println("You lost the game!");
                loses++;
                if (sum == 2) {
                    two++;
                }
                else if (sum == 3) {
                    three++;
                }
                else if (sum == 12) {
                    twelve++;
                }
            }
            else if (sum == 7 || sum == 11) {
                System.out.println("The score is " + sum + ".");
                System.out.println("You won the game!");
                wins++;
                if (sum == 7) {
                    seven++;
                }
                else if (sum == 11) {
                    eleven++;
                }
            }
            else {
                System.out.println("The score is " + sum + ".");
                System.out.println("You’re still in the game!");
                System.out.println("Your score (" + sum + ") is now becoming the point value that you need to roll to win the game.");
                System.out.println("Otherwise, when you’ll roll 7, you’ll lose the game.");
                point_value = sum;
                undecided = true;
                if (sum == 4) {
                    four++;
                }
                else if (sum == 5) {
                    five++;
                }
                else if (sum == 6) {
                    six++;
                }
                else if (sum == 8) {
                    eight++;
                }
                else if (sum == 9) {
                    nine++;
                }
                else if (sum == 10) {
                    ten++;
                }
            }
            
            // another roll
            if (undecided) {
                System.out.print("\nPress [enter] to roll the dice: ");
                answer = scan.nextLine();
                System.out.println("\nPOINT VALUE: " + point_value);
                chance = false;
                while (!chance) {
                    d1.roll();
                    d2.roll();
                    sum = d1.getFaceValue() + d2.getFaceValue();
                    System.out.println("Your roll: " + sum);
                    if (sum == 7) {
                        System.out.println("You rolled number 7");
                        System.out.println("You lost the game!");
                        chance = true;
                        loses++;
                        seven++;
                    }
                    else if (sum == point_value) {
                        System.out.println("You rolled your point value (" + point_value + ")");
                        System.out.println("You won the game!");
                        chance = true;
                        wins++;
                        if (sum == 2) {
                            two++;
                        }
                        else if (sum == 3) {
                            three++;
                        }
                        else if (sum == 4) {
                            four++;
                        }
                        else if (sum == 5) {
                            five++;
                        }
                        else if (sum == 6) {
                            six++;
                        }
                        else if (sum == 8) {
                            eight++;
                        }
                        else if (sum == 9) {
                            nine++;
                        }
                        else if (sum == 10) {
                            ten++;
                        }
                        else if (sum == 11) {
                            eleven++;
                        }
                        else if (sum == 12) {
                            twelve++;
                        }
                    }
                    else {
                        chance = false;
                        if (sum == 2) {
                            two++;
                        }
                        else if (sum == 3) {
                            three++;
                        }
                        else if (sum == 4) {
                            four++;
                        }
                        else if (sum == 5) {
                            five++;
                        }
                        else if (sum == 6) {
                            six++;
                        }
                        else if (sum == 8) {
                            eight++;
                        }
                        else if (sum == 9) {
                            nine++;
                        }
                        else if (sum == 10) {
                            ten++;
                        }
                        else if (sum == 11) {
                            eleven++;
                        }
                        else if (sum == 12) {
                            twelve++;
                        }
                    }
                }
            }

            System.out.print("\nDo you want to leave the game? (Y/N): ");
            ok = false;
            while (!ok){
                answer = scan.nextLine();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")) {
                    // goodbye message
                    System.out.println("\nThank you for playing the game!");
                    done = true;
                    ok = true;
                }
                else if (answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")) {
                    // the game gets repeated
                    done = false;
                    ok = true;
                }
                else {
                    System.out.print("Incorrect variable. Try to write 'Yes', 'yes', 'Y', 'y', 'No', 'no', 'N', or 'n': ");
                }
            }
        }
        
        // statistics
        System.out.println("\nSTATISTICS");
        System.out.println("Played games: " + played_games);
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("");
        System.out.println("The amount of scored outcomes:");
        System.out.println("2 - " + two);
        System.out.println("3 - " + three);
        System.out.println("4 - " + four);
        System.out.println("5 - " + five);
        System.out.println("6 - " + six);
        System.out.println("7 - " + seven);
        System.out.println("8 - " + eight);
        System.out.println("9 - " + nine);
        System.out.println("10 - " + ten);
        System.out.println("11 - " + eleven);
        System.out.println("12 - " + twelve);
    }
}