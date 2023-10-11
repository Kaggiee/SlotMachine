/* Import Statements */
import java.util.Random;
import java.util.Scanner;

class SlotMachine {
    public static void main(String[] args) {
        //Declare any variables needed later in the program 
        double money;       // How much money to put into the machine
        double total = 0;   // Total money earned at the end
        int a;              // First random number
        int b;              // Second random number
        int c;              // Third random number
        String word1 = "";  // First random word
        String word2 = "";  // Second random word
        String word3 = "";  // Third random word
        String confirm;     // Ask if they want to play again

        // Declare a Scanner and ask for amount of money
        Scanner keyboard = new Scanner(System.in);

        // Create a Random class object
        Random randomNumbers = new Random();
        do {
            System.out.println("How much money would you like to enter this time?");
            money = keyboard.nextInt();
           
            // Store random numbers 0-5 in integers
            a = randomNumbers.nextInt(6);
            b = randomNumbers.nextInt(6);
            c = randomNumbers.nextInt(6);

            // Use switch for each word and use a, b, and c to randomize the word
            switch (a) {
                case 0:
                    word1 = "Sevens";
                    break;
                case 1:
                    word1 = "Cherries";
                    break;
                case 2:
                    word1 = "Bells";
                    break;
                case 3:
                    word1 = "Bars";
                    break;
                case 4:
                    word1 = "Lemons";
                    break;
                case 5:
                    word1 = "Oranges";
                    break;
            }
            switch (b) {
                case 0:
                    word2 = "Sevens";
                    break;
                case 1:
                    word2 = "Cherries";
                    break;
                case 2:
                    word2 = "Bells";
                    break;
                case 3:
                    word2 = "Bars";
                    break;
                case 4:
                    word2 = "Lemons";
                    break;
                case 5:
                    word2 = "Oranges";
                    break;
            }
            switch (c) {
                case 0:
                    word3 = "Sevens";
                    break;
                case 1:
                    word3 = "Cherries";
                    break;
                case 2:
                    word3 = "Bells";
                    break;
                case 3:
                    word3 = "Bars";
                    break;
                case 4:
                    word3 = "Lemons";
                    break;
                case 5:
                    word3 = "Oranges";
                    break;
            }
            // Display results
            System.out.println(word1 + " " + word2 + " " + word3);

            // If words are all the same
            if (word1.equals(word2) && word3.equals(word1)) {
                System.out.println("Congratulations! You won ten times the money you entered!");
                total = money * 10;
            }
            // If two words are the same
            else if (word1.equals(word2) || word1.equals(word3) || word2.equals(word1) || word2.equals(word3) || word3.equals(word1) || word3.equals(word2)) {
                System.out.println("Congratulations! You won three times the money you entered!");
                total = money * 3;
            }
            // If none of the words match
            else {
                System.out.println("Sorry! You didn't win anything this time!");
            }
            // Show player the total entered so far and the total earned so far in the game
            System.out.printf("Your total amount entered so far is: $%.2f\n", money);
            System.out.printf("Your total amount earned so far is: $%.2f\n", total);
            
            // Consume newline
            keyboard.nextLine();

            // Confirm player wants to play again
            System.out.println("Would you like to play again? (y or n)");
            confirm = keyboard.nextLine();
        } while (confirm.equalsIgnoreCase("y")); // Provide exit for player

        // Closes out keyboard
        keyboard.close();
    }
}