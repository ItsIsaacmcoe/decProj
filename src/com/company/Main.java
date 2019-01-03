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
        while (loopy)
        {
            //creates array of users
            useracct[] user = new useracct[100];
            for(int i = 0; i<100; i++)
            {
                user[i] = new useracct("default", "default");
            }
            Scanner scanner = new Scanner(System.in);
            int x = 0;
            int count;
            cls();
            System.out.println("  __  __       _         __  __                  ");
            System.out.println(" |  \\/  |     (_)       |  \\/  |                 ");
            System.out.println(" | \\  / | __ _ _ _ __   | \\  / | ___ _ __  _   _ ");
            System.out.println(" | |\\/| |/ _` | | '_ \\  | |\\/| |/ _ \\ '_ \\| | | |");
            System.out.println(" | |  | | (_| | | | | | | |  | |  __/ | | | |_| |");
            System.out.println(" |_|  |_|\\__,_|_|_| |_| |_|  |_|\\___|_| |_|\\__,_|");
            System.out.println();
            System.out.println();
            System.out.println("1: manage users");
            int choice = scanner.nextInt();
            //switch case demo
            switch (choice)
            {
                case 1:
                    boolean loopy1 = true;
                    while (loopy1)
                    {
                        cls();
                        System.out.println("User Management");
                        System.out.println("1: add user             2: list users");
                        int choice1 = scanner.nextInt();
                        switch (choice1)
                        {
                            case 1:
                                System.out.println("input username");
                                String username = scanner.next();
                                System.out.println("input password");
                                String password = scanner.next();
                                user[x].setCreds(username, password);
                                System.out.println("success! confirm credentials");
                                user[x].enterPrompt();
                                user[x].listCreds();
                                user[x].enterPrompt();
                                x++;
                            break;
                            case 2:
                                for (count = 0; count < 100; count++)
                                {
                                    String pass = user[count].returnPass();
                                    if (pass.equals("default"))
                                    {
                                        count++;
                                    }
                                    else
                                    {
                                        user[count].listCreds();
                                    }
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                }
                                //left off here
                            break;
                            default:
                                System.out.println("unexpected option");
                        }
                    }
                    break;
                default:
                    System.out.println("unexpected option");

            }
        }
    }
}

//superclass that allows for general methods
class compacct
{
    //method demonstrating inheritance
    public void enterPrompt()
    {
        System.out.println("Press \"ENTER\" to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

//the subclass that extends compacct
class useracct extends compacct
{
    String username;
    String password;
    public useracct(String user, String passwd)
    {
        username = user;
        password = passwd;
    }
    public void listCreds()
    {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
    public void setCreds(String user, String passwd)
    {
        username = user;
        password = passwd;
    }
    public String returnPass()
    {
        return (password);
    }
}
