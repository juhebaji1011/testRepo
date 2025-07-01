package ex_001_Java_Basic;

public class Lab009_String_Challenge2
{
    public static void main(String[] args)
    {
        String s1="Hello";
        String s2="hello";
        String s3="Hello";
        boolean b1=s1.equals(s2);
        boolean b2=s1.equalsIgnoreCase(s2);
        System.out.println("equals"+" "+b1);
        System.out.println("equalsIgnoreCase"+" "+b2);
        System.out.println("compareto"+" "+s1.compareTo(s3));

    }
}
