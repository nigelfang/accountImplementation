public class corporateHolder extends accountHolder
{
    private String contact;

    public corporateHolder(int ID, String address, String contact)
    {
        super(ID, address);
        this.contact = contact;
    }

    public String getContact()
    {
        return contact;
    }
    public void setContact( String contact)
    {
        this.contact = contact;
    }
}