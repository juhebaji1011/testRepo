import java.util.Scanner;

public class Lab003_Even_Odd
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
