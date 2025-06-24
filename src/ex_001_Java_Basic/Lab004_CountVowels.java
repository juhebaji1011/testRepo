package ex_001_Java_Basic;

import java.util.Scanner;

public class Lab004_CountVowels
{
    public static void main(String[] args)
    {
        System.out.println("Enter a name");
        Scanner sc =new Scanner(System.in);
        String name=sc.next();
        int counta=0;
        int countb=0;
        for(int i=0;i<name.length();i++)
        {
            char c=name.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                counta=counta+1;
            }
            else
            {
                countb=countb+1;
            }
        }
        System.out.println("vowels count"+counta);
        System.out.println("consonants count"+countb);
    }
}
