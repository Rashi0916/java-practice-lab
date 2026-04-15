/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventbudgetplanner;

/**
 *
 * @author rashi
 */
import java.util.Scanner;

// main class jo user se input lega
public class Planner {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("------ SMART EVENT BUDGET PLANNER ------");

        // user se budget lena
        System.out.println("Enter total event budget:");
        double budget = sc.nextDouble();

        // object create
        Event e = new Event(budget);

        // output show
        System.out.println("\nBudget Distribution:\n");

        System.out.println("Venue Cost (40%) = " + e.venueCost());

        System.out.println("Food Cost (30%) = " + e.foodCost());

        System.out.println("Decoration Cost (15%) = " + e.decorationCost());

        System.out.println("Music Cost (10%) = " + e.musicCost());

        System.out.println("Emergency Fund (5%) = " + e.emergencyFund());

        sc.close();

    }

}