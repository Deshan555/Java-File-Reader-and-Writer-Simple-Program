import java.util.Scanner;

public class Teacher_details
{
    static void add_teacher_details()
    {
        Scanner input_string = new Scanner(System.in);

        System.out.print("NAME : ");

        String name = input_string.nextLine();

        Generate_ID id = new Generate_ID();

        String index = id.generate_Id();

        System.out.print("TEACHING SUBJECT : ");

        String subject = input_string.nextLine();

        System.out.print("Class : ");

        String teaching_class = input_string.nextLine();

        String file_name = "teacher.txt";

        Data_Base db = new Data_Base();


        try
        {
            db.add_data(file_name,index,subject,teaching_class,name);
        }
        catch (Exception ex)
        {
            System.out.print("ERROR : "+ex);
        }
    }
}
