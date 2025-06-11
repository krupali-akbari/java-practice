import java.util.Scanner;
class Swap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  a=");
        int a=sc.nextInt();
        
        System.out.println("enter the  b=");
        int b=sc.nextInt();
        
        int temp=a;
        a=b;
        b=temp;
        
        System.out.println("after swapping"); 
         System.out.println("a="+a);
          System.out.println("b="+b);
        
    }
}