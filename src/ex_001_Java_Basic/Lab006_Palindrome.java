package ex_001_Java_Basic;

import java.util.Scanner;

public class Lab006_Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter a word");
        String revword=" ";
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        for(int i=word.length()-1;i>=0;i--)
        {
            revword=revword+word.charAt(i);

        }
        System.out.println(revword);

        if(word.equals(revword))
        {
            System.out.println("This is palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

    }
}
