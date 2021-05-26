import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        wel_come();
    }

    public static void wel_come() throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);

        System.out.println("WEL COME UNIVERSITY DATA HANDLING SYSTEM");

        System.out.println("Enter Your Choice\n 1.Teacher Details\n 2.Typist Details\n 3.Officer Details \n CHOICE :");

        char choice = input.next().charAt(0);

        choice_handling my_obj = new choice_handling();

        my_obj.choice_handler(choice);
    }

}
