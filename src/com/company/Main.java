package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main

{
    //clear screen method
    private static void cls()
    {
        int count = 0;
        while (count < 50)
        {
            System.out.println();
            count++;
        }

    }

    //main method (of course)
    public static void main(String[] args)
    {
        //creates array of users
        useracct[] user = new useracct[100];
        for (int i = 0; i < 100; i++)
        {
            user[i] = new useracct("default", "default");
        }
        //creates scanner
        Scanner scanner = new Scanner(System.in);
        //defines needed variables
        int x = 0;
        int count;
        int choice = 0;
        int choice1 = 0;
        //while loop to keep menu running in event of switch break
        boolean loopy = true;
        while (loopy)
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
            //error handling
            while (choice < 1 || choice > 2)
            {
                System.out.println("1: manage users        2: quit");
                try
                {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e)
                {
                    System.out.println("invalid option please enter Integer 1 or 2");
                    scanner.next();
                }
            }
            //switch case demo
            switch (choice)
            {
                case 1:
                    boolean loopy1 = true;
                    while (loopy1)
                    {
                        cls();
                        //error handling
                        while (choice1 < 1 || choice1 > 3)
                        {
                            try
                            {
                                System.out.println("User Management");
                                System.out.println("1: add user             2: list users          3: back");
                                choice1 = scanner.nextInt();
                            } catch (InputMismatchException e)
                            {
                                System.out.println("invalid option please enter Integer 1. 2 or 3");
                                scanner.next();
                            }
                        }
                        switch (choice1)
                        {
                            case 1:
                                System.out.println("input username");
                                String username = scanner.next();
                                System.out.println("input password");
                                String password = scanner.next();
                                //calls on object method sedCreds and listCreds
                                user[x].setCreds(username, password);
                                System.out.println("success! confirm credentials");
                                user[x].listCreds();
                                //calls on inherited method enterPrompt
                                user[x].enterPrompt();
                                x++;
                                break;
                            case 2:
                                //lists all valid users's info
                                //valid user defined as user with password other than default
                                for (count = 0; count < 100; count++)
                                {
                                    String pass = user[count].returnPass();
                                    if (pass.equals("default"))
                                    {
                                        count++;
                                    } else
                                    {
                                        user[count].listCreds();
                                        System.out.println();
                                    }
                                }
                                user[50].enterPrompt();
                                break;

                            case 3:
                                loopy1 = false;
                                break;
                            default:
                                System.out.println("unexpected option");
                        }
                    }
                    break;

                case 2:
                    loopy = false;
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
    void enterPrompt()
    {
        System.out.println("Press \"ENTER\" to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

//the subclass that extends compacct
class useracct extends compacct
{
    private String username;
    private String password;

    useracct(String user, String passwd)
    {
        username = user;
        password = passwd;
    }

    void listCreds()
    {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    void setCreds(String user, String passwd)
    {
        username = user;
        password = passwd;
    }

    String returnPass()
    {
        return (password);
    }
}
