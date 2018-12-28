package com.company;

public class adminacct extends compacct
{
    public void logon(String Password)
    {
        if (Password.equals("logmein"))
        {
            System.out.println("success");
            isloggedin = true;
            hasadmin = true;
        }

        else
        {
            System.out.println("access denied");
            isloggedin = false;
            hasadmin = false;
        }

    }
    public void shutdown()
    {
        System.out.println("this requires an admin account to do and is not accessible from other accounts");
    }
}
