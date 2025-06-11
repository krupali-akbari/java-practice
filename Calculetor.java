import java.util.Scanner;
 class Calculetor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the first number a:");
        int a=sc.nextInt();
        
        System.out.println("enter the second number b:");
        int b=sc.nextInt();
        
         
         System.out.println("sum="+(a+b));
         System.out.println("sub="+(a-b));
         System.out.println("mul="+(a*b));
         
         if(b!=0)
         {
             System.out.println("div="+(a/b));
        
             
         }
         
        
        
    }
}