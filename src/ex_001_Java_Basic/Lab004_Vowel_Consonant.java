package ex_001_Java_Basic;

import java.util.Scanner;

public class Lab004_Vowel_Consonant
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().toLowerCase().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u')
        {
            System.out.println(ch+" "+"Vowel");
        }
        else
        {
            System.out.println(ch+"Consonant");
        }

    }
}
