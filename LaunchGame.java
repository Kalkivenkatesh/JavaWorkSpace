package com.assignmenttwo;

import java.util.Scanner;

class Gusser
{
    int guessNum;
    public int guessnumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusser Guess the number and Tell me");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Player
{
    int guessNum;
    public int guessnumebr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player Guess the number and tell me");
        guessNum = sc.nextInt();
        return guessNum;

    }
}

class umpire
{
    int guessGnumber;
    int guessP1number;
    int guessP2number;
    int guessP3number;
    public void collectnumfromguesser()
    {
        Gusser obj = new Gusser();

        int x = obj.guessnumber();
        if(x>=0 && x<10)
        {
            guessGnumber=x;
        }
        else {
            guessGnumber=-1;
        }

    }
    public void collectnumfromplayer()
    {
        int x,y,z;
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        x = p1.guessnumebr();
        if(x>=0 && x<10)
        {
            guessP1number=x;
        }
        else {
            guessP1number=-1;
        }
        y = p2.guessnumebr();
        if(y>=0 && y<10)
        {
            guessP2number=y;
        }
        else {
            guessP2number=-1;
        }
        z = p3.guessnumebr();
        if(z>=0 && z<10)
        {
            guessP3number=z;
        }
        else {
            guessP3number=-1;
        }
    }
    public void compare()
    {
        if((guessGnumber >=0 && guessGnumber<10) && (guessP1number>=0 && guessP1number<10) && (guessP2number>=0 && guessP2number<10) && (guessP3number>=0 && guessP3number<10))
        {
            if(guessGnumber==guessP1number)
            {
                if(guessGnumber==guessP2number && guessGnumber == guessP3number)
                {
                    System.out.println("All Players are winners");
                }
                else if(guessGnumber==guessP2number)
                {
                    System.out.println("Player 1 and 2 are Winners");
                }
                else if(guessGnumber==guessP3number)
                {
                    System.out.println("Player 1 and 3 are Winners");
                }
                else {
                    System.out.println("Player 1 is Winner");
                }
            }
            else if(guessGnumber==guessP2number)
            {
                if(guessGnumber == guessP3number)
                {
                    System.out.println("Player 2 and 3 are Winners");
                }
                else {
                    System.out.println("Player 2 is Winner");
                }
            }
            else if(guessGnumber == guessP3number)
            {
                System.out.println("Player 3 is Winner");
            }
            else {
                System.out.println("Game Lost! Try Again.");
            }
        }
        else {
            System.out.println("Please Guess number between 0 to 9");
            System.out.println("Try Again");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        umpire u = new umpire();
        u.collectnumfromguesser();
        u.collectnumfromplayer();
        u.compare();

    }
}
