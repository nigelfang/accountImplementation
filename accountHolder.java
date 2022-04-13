import java.util.Random;

public class accountHolder 
{
    protected int ID;
    protected String address;

    public accountHolder(int ID, String address)
    {
        this.ID = ID;
        this.address = address;
    }

    public int getNextID()
    {
        Random rand = new Random();
        return rand.randInt(0,1000000);
    }
}