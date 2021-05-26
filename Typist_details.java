import java.util.Scanner;

public class Typist_details
{
    static void add_typist_details_Regular()
    {
        Scanner input_string = new Scanner(System.in);

        System.out.print("NAME : ");

        String name = input_string.nextLine();

        System.out.print("Typing Speed (page per Hour) : ");

        String number_of_pages = input_string.nextLine();

        String typing_speed = number_of_pages+"Per Hour";

        Generate_ID id = new Generate_ID();

        String index = id.generate_Id();

        System.out.print("Basic Salary : ");

        String salary = input_string.nextLine();

        String file_name = "regular_typist.txt";

        Data_Base db = new Data_Base();

        try
        {
            db.add_data(file_name,index,salary,typing_speed,name);
        }
        catch (Exception ex)
        {
            System.out.print("ERROR : "+ex);
        }
    }

    static void add_typist_details_casual()
    {
        Scanner input_string = new Scanner(System.in);

        System.out.print("NAME : ");

        String name = input_string.nextLine();

        System.out.print("Typing Speed (page per Hour) : ");

        String number_of_pages = input_string.nextLine();

        String typing_speed = number_of_pages+"Per Hour";

        Generate_ID id = new Generate_ID();

        String index = id.generate_Id();

        System.out.print("Daily Wages : ");

        String salary = input_string.nextLine();

        String file_name = "casual_typist.txt";

        Data_Base db = new Data_Base();

        try
        {
            db.add_data(file_name,index,salary,typing_speed,name);
        }
        catch (Exception ex)
        {
            System.out.print("ERROR : "+ex);
        }
    }
}
