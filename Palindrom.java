import java.util.Scanner;
class Palindrom
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  n=");
        int n=sc.nextInt();
        
        int rev=0;
        int temp=n;
        
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        
        if(rev==temp)
        {
           System.out.println("number is palindrom"); 
        }
        else
        {
             System.out.println("number is  not palindrom"); 

        }
        
        
        
      
        
        
         
    }
}