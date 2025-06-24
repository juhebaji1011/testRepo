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

    public static class Lab003_Vowel
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Give the alphabet");
            char ch=sc.next().toLowerCase().charAt(0);;

            if(ch=='a'|| ch=='e'|| ch=='o'|| ch=='u' || ch=='i')
            {
                System.out.println("Vowel");
            }
            else
            {
                System.out.println("Consonant");
            }
        }
    }
}
