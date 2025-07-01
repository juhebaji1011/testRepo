package ex_001_Java_Basic;

import java.util.Scanner;

public class Lab007_Funcs
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int result=sum(a,b);
        System.out.println(result);

    }
    static int sum(int a,int b)
    {
        return a+b;
    }
}
