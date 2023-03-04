/*3/3/2020
Name: Deodatus Marcellino
--------------- Fun with Taxes -----------------------------
* This program is to demonstrate understanding of if statements and concepts of simple tax returns.
* This program will read in three pieces of information: the user's gross income, numver of dependants, and the amount of tax that was already withheld.
* The program then will output a message whether:
* 1) The user should receive a refund of certain amount of dollars, or
* 2) The user still owe money in taxes, or
* 3) The user have paid all the taxes and owe no money.
* */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int income;
        int dependant;
        int withheld;
        int adjusted;
        double taxOwed = 0;
        double result;

        System.out.println("Enter your gross income: ");
        income = sc.nextInt();

        System.out.println("Enter the number of dependants: ");
        dependant = sc.nextInt();

        System.out.println("Enter the amount of tax already withheld: ");
        withheld = sc.nextInt();

        adjusted = income - (2500 * dependant);

        // calculate tax owed
        if (adjusted > 0 && adjusted <= 5000){
            taxOwed = 0.0 * adjusted;
        }
        if (adjusted > 5000 && adjusted <= 20000){
            taxOwed = (0.0 * 5000) + 0.15 * (adjusted - 5000);
        }
        if (adjusted > 20000 && adjusted <= 35000){
            taxOwed = (0.0 * 5000) + 0.15*(20000 - 5000) + 0.25*(adjusted - 20000);
        }
        if (adjusted > 35000 && adjusted <= 60000){
            taxOwed = (0.0 * 5000) + 0.15*(20000 - 5000) + 0.25*(35000 - 20000) + 0.30*(adjusted - 35000);
        }
        if (adjusted > 60000){
            taxOwed = (0.0 * 5000) + 0.15*(20000 - 5000) + 0.25*(35000 - 20000) + 0.30*(60000 - 35000) + 0.35*(adjusted-60000);
        }

        result = withheld - taxOwed;
        if (result > 0){
            System.out.println("You should receive a refund of $" + result);
        }
        else if (result < 0){
            result = result * -1;
            System.out.println("You still owe $" + result +" in taxes.");
        }
        else{
            System.out.println("You have paid your taxes and owe no money.");

        }

    } // end driver

}//end class Main