
package cokemachine;

import java.util.Scanner;

public class CokeMachine 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int coin;
        int amount = 0;

        while(true)
        {        // Infinite loop

            System.out.print("Insert coin: ");

            coin = scanner.nextInt();

            if(coin != 5 && coin != 10 && coin != 25)
            {
                System.out.println("Rejecting " + coin + " cent coin");
                System.out.println("Amount entered: " + amount);
                continue; // Restart the loop if the value entered by user is not 5, 10 or 25.
            }

            amount += coin;

            System.out.println("Amount entered: " + amount);

            if(amount >= 100)
            {
                while(true) 
                { // Infinite loop is used in case user inputs the option that does not exist
                    System.out.println("Please make selection:\n" +
                            "1 - Coke\n" +
                            "2 - Coke Zero\n" +
                            "3 - Caffeine Free Diet Coke");

                    System.out.print("Your choice: ");

                    int option;
                    option = scanner.nextInt();

                    if (option == 1) 
                    {
                        System.out.println("Dispensing Coke");
                    } 
                    else if (option == 2) 
                    {
                        System.out.println("Dispensing Coke Zero");
                    } 
                    else if (option == 3) 
                    {
                        System.out.println("Dispensing Caffeine Free Diet Coke");
                    } 
                    else 
                    {
                        System.out.println("Option " + option + " does not exist!");
                        continue; // Restart the loop in case option entered by user is not 1, 2 or 3.
                    }

                    amount -= 100;

                    while (amount != 0) 
                    {
                        if (amount >= 10) 
                        { // Returning dimes if amount is larger or equals 10.
                            System.out.println("Returning dime");
                            amount -= 10;
                        } 
                        else 
                        { // Returning nickel if amount is 5.
                            System.out.println("Returning nickel");
                            amount -= 5;
                        }
                    }
                    System.out.println();
                    break;
                }
            }

        }
    }
    
}
