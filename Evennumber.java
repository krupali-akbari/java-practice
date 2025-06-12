import java.util.Scanner;

public class Evennumber 
{
    static boolean isEven(int n)
    {
        return n%2==0;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n=");
        int n=sc.nextInt();

        if(isEven(n))
        { 
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
