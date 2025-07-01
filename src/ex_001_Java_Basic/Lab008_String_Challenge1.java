package ex_001_Java_Basic;

public class Lab008_String_Challenge1
{
    public static void main(String[] args)
    {
        String s="Hello World";
        int n=s.length();
        char c=s.charAt(0);
        String s1=s.substring(6,11);
        System.out.println("length of string"+ n);
        System.out.println("starting character"+c);
        System.out.println("substring of string"+ s1);

    }
}
