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

    public static void mainmenu() {
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
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("unexpected option");
        }
    }
    public static void main(String[] args)
    {
        mainmenu();





//       useracct isaac = new useracct();
//       String user = "isaacmcoe";
//       String paswd = "logmein";
//       isaac.construct(user, paswd);
//       System.out.println(isaac.acctPassword);
//       System.out.println(isaac.acctUsername);
    }
}