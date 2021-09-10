import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {
    private static final Query decisionTree =
            new Query("Is the car silent when you turn the key?",
                    new Query("Are the batter terminals corroded?",
                            new Query("Clean the terminals and try starting again."),
                            new Query("Replace cables and try again.")),
                    new Query("Does the car make a slicking noise?",
                            new Query("Replace the battery."),
                            new Query("Does the car crank up but fail to start?",
                                    new Query("Check spark plug connections."),
                                    new Query("Does the engine start and then die?",
                                            new Query("Does your car have fuel injection?",
                                                    new Query("Get it in for service."),
                                                    new Query("Check to ensure the choke is opening and closing.")),
                                            new Query("This should not be possible.")))));

    public static void main(String[] args) {
        // We do a little bit of recursion
        decisionTree.askQuery();
    }
}
