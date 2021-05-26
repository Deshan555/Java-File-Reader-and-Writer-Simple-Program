import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class View_DB
{
    static void view_data(char item_code) throws FileNotFoundException
    {
        if(item_code == 'T')
        {
            String DB_Name = "teacher.txt";

            System.out.print("\nTEACHERS DETAILS");

            System.out.print("\n______________________________________________________________________________________\n");

            reader(DB_Name);

        }
        else if(item_code == 'O')
        {
            String DB_Name = "officer.txt";

            System.out.print("\nOFFICER DETAILS");

            System.out.print("\n______________________________________________________________________________________\n");

            reader(DB_Name);

        }
        else if(item_code == 'R')
        {
            String DB_Name = "regular_typist.txt";

            System.out.print("\nREGULAR TYPIST DETAILS");

            System.out.print("\n______________________________________________________________________________________\n");

            reader(DB_Name);

        }
        else if(item_code == 'C')
        {
            String DB_Name = "casual_typist.txt";

            System.out.print("\nCASUAL TYPIST DETAILS");

            System.out.print("\n______________________________________________________________________________________\n");

            reader(DB_Name);

        }
        else
        {
            System.out.print("\nERROR : WRONG INPUT!!");

            choice_handling handling = new choice_handling();

            handling.Navigation();

        }

    }

    static void reader(String DB_Name) throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream(DB_Name);

        Scanner output = new Scanner(fis);

        while (output.hasNext())
        {
            System.out.print(output.nextLine()+"\n\n");
        }

        choice_handling handling = new choice_handling();

        handling.Navigation();

    }
}
