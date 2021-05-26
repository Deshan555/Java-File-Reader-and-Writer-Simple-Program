import java.io.FileNotFoundException;

import java.util.Scanner;

public class choice_handling
{
    static Scanner input = new Scanner(System.in);

    static Scanner char_input = new Scanner(System.in);

    public static void choice_handler(char choice) throws FileNotFoundException
    {
        if(choice == '1')
        {
            System.out.print("Teachers Details\n 1.ADD DETAILS\n 2.VIEW DETAILS\n Your Choice :");

            char i = char_input.next().charAt(0);

            if(i == '1')
            {
                Teacher_details t_details = new Teacher_details();

                t_details.add_teacher_details();
            }
            else if(i == '2')
            {
                View_DB view = new View_DB();

                char item_code = 'T';

                view.view_data(item_code);

            }
            else
            {
                System.out.println("ERROR : WRONG INPUT!!!");

                System.exit(0);

            }
        }
        else if(choice == '2')
        {
            System.out.print("Typist Details\n");

            System.out.println("Enter Your Choice\n 1.Regular Typist\n 2.Casual Typist\n Choice :");

            char x = char_input.next().charAt(0);

            typist_selection(x);

        }
        else if(choice == '3')
        {
            System.out.print("Officer Details\n 1.ADD DETAILS\n 2.VIEW DETAILS\n Your Choice :");

            char i = char_input.next().charAt(0);

            if(i == '1')
            {
                Officer_details officer = new Officer_details();

                officer.add_officer_details();
            }
            else if(i == '2')
            {
                View_DB view = new View_DB();

                char item_code = 'O';

                view.view_data(item_code);

            }
            else
            {
                System.out.println("ERROR : WRONG INPUT!!!");

                System.exit(0);

            }

        }
        else
        {
            Main home = new Main();

            home.wel_come();

        }
    }

    public static void typist_selection(char choice) throws FileNotFoundException
    {
        Typist_details typist = new Typist_details();

        if(choice == '1')
        {
            System.out.println("Regular Typist Section\n 1.ADD DETAILS\n 2.VIEW DETAILS\n Your Choice :");

            char i = char_input.next().charAt(0);

            if(i == '1')
            {
                typist.add_typist_details_Regular();
            }
            else if(i == '2')
            {
                View_DB view = new View_DB();

                char item_code = 'R';

                view.view_data(item_code);

            }
            else
            {
                System.out.println("ERROR : WRONG INPUT!!!");

                System.exit(0);

            }

        }
        else if(choice == '2')
        {
            System.out.println("Casual Typist Section\n 1.ADD DETAILS\n 2.VIEW DETAILS\n Your Choice :");

            char i = char_input.next().charAt(0);

            if(i == '1')
            {
                typist.add_typist_details_casual();
            }
            else if(i == '2')
            {
                View_DB view = new View_DB();

                char item_code = 'C';

                view.view_data(item_code);

            }
            else
            {
                System.out.println("ERROR : WRONG INPUT!!!");

                System.exit(0);

            }

        }
        else
        {
            System.out.print("WRONG INPUT");

            System.out.println("Enter Your Choice\n 1.Regular Typist\n 2.Casual Typist\n Choice :");

            char x = char_input.next().charAt(0);

            typist_selection(x);
        }
        
    }

    static void Navigation() throws FileNotFoundException
    {
        System.out.println("1. GO TO MAIN MENU\n2. EXIT SYSTEM");

        char navigation = char_input.next().charAt(0);

        if(navigation == '1')
        {
            Main home = new Main();

            home.wel_come();
        }
        else if(navigation == '2')
        {
            System.out.println("HAVE A GOOD DAY!!");

            System.exit(0);
        }
        else
        {
            System.out.println("WRONG INPUT");

            Navigation();
        }
    }
}
