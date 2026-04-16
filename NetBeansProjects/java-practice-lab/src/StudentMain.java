import java.io.*;

class Student
{
    String name;
    int age;
}

public class StudentMain
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Student students[] = new Student[3];

        // object create
        for(int i = 0; i < 3; i++)
        {
            students[i] = new Student();
        }

        // input
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter name:");
            students[i].name = br.readLine();

            System.out.println("Enter age:");
            students[i].age = Integer.parseInt(br.readLine());
        }

        // output
        for(int i = 0; i < 3; i++)
        {
            System.out.println(students[i].name + " " + students[i].age);
        }

    }
}