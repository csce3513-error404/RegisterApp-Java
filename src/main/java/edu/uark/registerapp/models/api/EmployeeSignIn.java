package main.java.edu.uark.registerapp.models.api;
import org.apache.commons.lang3.StringUtils;
public class EmployeeSignIn
{
    private String EmployeeId;
    private String Password;
    public EmployeeSignIn()
    {
        this.EmployeeId = "";
        this.Password = "";
    }
    public void setEmployeeId(String Id) {
        this.EmployeeId = Id;
    }

    public void setPassword(String Passcode)
    {
        this.Password = Passcode;
    }
    public String getEmployeeId()
    {
        return this.EmployeeId;
    }
    public String getPassword()
    {
        return this.Password;
    }
}