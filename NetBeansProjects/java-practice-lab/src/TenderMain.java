import java.util.Scanner;

class Tender
{
    String company;
    int cost;
}

public class TenderMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Tender t[] = new Tender[5];

        // object create
        for(int i = 0; i < 5; i++)
        {
            t[i] = new Tender();
        }

        // input
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter company name:");
            t[i].company = sc.next();

            System.out.println("Enter cost:");
            t[i].cost = sc.nextInt();
        }

        // minimum cost find
        int min = t[0].cost;
        String cname = t[0].company;

        for(int i = 1; i < 5; i++)
        {
            if(t[i].cost < min)
            {
                min = t[i].cost;
                cname = t[i].company;
            }
        }

        // result
        System.out.println("Minimum cost company is:");
        System.out.println(cname + " " + min);
    }
}