public class individualHolder extends accountHolder 
{
    private String name;
    private String SSN;

    public individualHolder(int ID, String address, String name, String SSN)
    {
        super(ID, address);
        this.name = name;
        this.SSN = SSN;
    }
    public String getName()
    {
        return name;
    }
    public String getSSN()
    {
        return SSN;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSSN(String SSN)
    {
        this.SSN = SSN;
    }
}