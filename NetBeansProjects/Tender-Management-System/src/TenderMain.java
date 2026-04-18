/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rashi
 */
import java.util.Scanner;

class Tender
{
    String companyName;
    int cost;
    int duration;

    // default constructor
    Tender()
    {
        companyName = "Not Given";
        cost = 0;
        duration = 0;
    }

    // parameterized constructor
    Tender(String c,int co,int d)
    {
        companyName = c;
        cost = co;
        duration = d;
    }

    void getData(Scanner sc)
    {
        try
        {
            System.out.println("Enter company name:");
            companyName = sc.next();

            System.out.println("Enter cost:");
            cost = sc.nextInt();

            System.out.println("Enter duration (months):");
            duration = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Invalid input!");
        }
    }

    void showData()
    {
        System.out.println(companyName+"  "+cost+"  "+duration+" months");
    }
}

public class TenderMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Tender t[] = new Tender[5];

        // create objects
        for(int i=0;i<5;i++)
        {
            t[i] = new Tender();
        }

        // input
        for(int i=0;i<5;i++)
        {
            System.out.println("\nEnter Tender "+(i+1)+" Details");
            t[i].getData(sc);
        }

        // display
        System.out.println("\nAll Tender Details:");
        for(int i=0;i<5;i++)
        {
            t[i].showData();
        }

        // find minimum cost
        int min = t[0].cost;
        String cname = t[0].companyName;

        for(int i=1;i<5;i++)
        {
            if(t[i].cost < min)
            {
                min = t[i].cost;
                cname = t[i].companyName;
            }
        }

        System.out.println("\nLowest cost company:");
        System.out.println(cname+"  "+min);

    }
}