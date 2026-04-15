/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rashi
 */
import java.util.Scanner;  // Scanner class user input lene ke liye

public class ExpenseSplitter {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("------ SMART EXPENSE SPLITTER ------");

        // user se number of people lena
        System.out.println("Enter number of people:");
        int n = sc.nextInt();

        // Person type ka array banaya jisme sab log store honge
        Person persons[] = new Person[n];

        double totalExpense = 0; // total expense store karega

        // loop chalega jitne log hai utni baar
        for(int i=0;i<n;i++){

            persons[i] = new Person();  // har index par new object create hoga

            sc.nextLine(); // enter clear karne ke liye

            // name input
            System.out.println("\nEnter name of person " + (i+1) + ":");
            String name = sc.nextLine();

            // amount input
            System.out.println("Enter amount paid by " + name + ":");
            double amount = sc.nextDouble();

            // person object me data store karna
            persons[i].setPerson(name, amount);

            // total expense me add karna
            totalExpense = totalExpense + amount;

        }

        // equal share calculate karna
        double share = totalExpense / n;

        System.out.println("\nTotal Expense = " + totalExpense);
        System.out.println("Each person should pay = " + share);

        System.out.println("\n------ RESULT ------");

        // check karenge kisne zyada pay kiya aur kisne kam
        for(int i=0;i<n;i++){

            // difference calculate
            double difference = persons[i].paid - share;

            // agar difference positive hai matlab usne extra pay kiya
            if(difference > 0){

                System.out.println(persons[i].name + " will RECEIVE " + difference);

            }

            // agar difference negative hai matlab usne kam pay kiya
            else if(difference < 0){

                // Math.abs negative value ko positive banata hai
                System.out.println(persons[i].name + " will PAY " + Math.abs(difference));

            }

            // agar difference zero hai matlab equal pay kiya
            else{

                System.out.println(persons[i].name + " already paid correct amount");

            }

        }

        sc.close(); // scanner band karna good practice hoti hai

    }

}