import java.io.*;

public class Data_Base
{
    public static void add_data(String file_name,String details0,String details1,String details2,String name) throws IOException
    {
        FileOutputStream details = new FileOutputStream(file_name,true);

        PrintWriter file = new PrintWriter(details);

        BufferedWriter store = new BufferedWriter(file);

        store.write(name+"\t"+details0+"\t"+details1+"\t"+details2);

        store.newLine();

        store.close();

        file.close();

        System.out.print("Data Successfully Entered To "+file_name+"\n");

        choice_handling handling = new choice_handling();

        handling.Navigation();

    }
}
