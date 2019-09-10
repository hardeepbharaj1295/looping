public class demo {

    private String name;
    private String email;
    private String password;

    public void setData(String name, String email,String password)
    {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setData(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public void setData(String name)
    {
        this.name = name;
    }
}
