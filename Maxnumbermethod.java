import java.util.Scanner;

public class Maxnumbermethod 
{
    static int max(int a, int b, int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if( b>c && b>a)
        {
            return b;
        }
        else
        {
            return c;
        }

        
    }

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a:");
        int a=sc.nextInt();

        System.out.println("Enter the secound number b:");
        int b=sc.nextInt();

        System.out.println("Enter the third number c:");
        int c=sc.nextInt();

        System.out.println("max number is:"+max(a, b, c));

    }

}
