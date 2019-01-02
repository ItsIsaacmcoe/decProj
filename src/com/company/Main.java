package com.company;
import java.util.Scanner;
public class Main
{
    public static void cls()
    {
        int count = 0;
        while(count < 50)
        {
            System.out.println();
            count++;
        }

    }
    public static void main(String[] args)
    {
        boolean loopy = true;
        while (loopy == true)
        {
            cls();
            System.out.println("  __  __       _         __  __                  ");
            System.out.println(" |  \\/  |     (_)       |  \\/  |                 ");
            System.out.println(" | \\  / | __ _ _ _ __   | \\  / | ___ _ __  _   _ ");
            System.out.println(" | |\\/| |/ _` | | '_ \\  | |\\/| |/ _ \\ '_ \\| | | |");
            System.out.println(" | |  | | (_| | | | | | | |  | |  __/ | | | |_| |");
            System.out.println(" |_|  |_|\\__,_|_|_| |_| |_|  |_|\\___|_| |_|\\__,_|");
            System.out.println();
            System.out.println();
            System.out.println("1: manage users             2: logon");


            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    boolean loopy1 = true;
                    while (loopy1 == true)
                    {
                        cls();
                        System.out.println("User Management");
                        System.out.println("1: add user       2: delete user");
                        int choice1 = scanner.nextInt();
                        switch (choice1)
                        {
                            case 1:
                                System.out.println("input username");
                                String username = scanner.nextLine();
                                System.out.println("input password");
                                String password = scanner.nextLine();
                                useracct newuser = new useracct(username, password);
                                break;
                            case 2:
                                System.out.println("delete users");
                                break;
                            default:
                                System.out.println("unexpected option");
                        }
                    }
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                default:
                    System.out.println("unexpected option");

            }
        }



// test


//       useracct isaac = new useracct();
//       String user = "isaacmcoe";
//       String paswd = "logmein";
//       isaac.construct(user, paswd);
//       System.out.println(isaac.acctPassword);
//       System.out.println(isaac.acctUsername);
    }
}

class adminacct
{
    //the superclass that allows for privilege control
}
class useracct extends adminacct
{
    //the subclass that extends adminacct
    String username;
    String password;
    public useracct(String user, String passwd)
    {
        username = user;
        password = passwd;
    }
    public void listvars()
    {
        System.out.println(username);
        System.out.println(password);
    }
}