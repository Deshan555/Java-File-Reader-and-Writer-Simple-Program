import java.util.Scanner;

public class Officer_details
{
    static void add_officer_details()
    {
        Scanner input_string = new Scanner(System.in);

        System.out.print("NAME : ");

        String name = input_string.nextLine();

        Generate_ID id = new Generate_ID();

        String index = id.generate_Id();

        System.out.print("GRADE : ");

        String grade = input_string.nextLine();

        System.out.print("Mobile Number : ");

        String mobile_no = input_string.nextLine();

        String file_name = "officer.txt";

        Data_Base db = new Data_Base();


        try
        {
            db.add_data(file_name,index,grade,mobile_no,name);
        }
        catch (Exception ex)
        {
            System.out.print("ERROR : "+ex);
        }
    }
}
