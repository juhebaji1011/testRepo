package ex_001_Java_Basic;

import java.util.Scanner;

public class Lab002_Ter_Max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        String greatnum=i>j ? "printi" :"printj";
        System.out.println(greatnum);
    }
}
