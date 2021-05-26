import java.util.Random;

public class Generate_ID
{
    protected static String generate_Id()
    {
        Random rand = new Random();

        int random_id = rand.nextInt(99999);

        String ID = String.valueOf(random_id);

        String std_id = "STAFF-IT"+ID;

        return std_id;
    }
}
