import java.util.Scanner;
public class Maxinarray 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int[] num = new int[5];
       
       System.out.println(" enter the 5 numbers:");

       for(int i=0;i<5;i++)
       {
            num[i] = sc.nextInt();
       }

       int max = num[0];

       for(int i=1;i<5;i++)
       {
        if(num[i] > max)
        {
            max = num[i];
        }
       }

       System.out.println("max number is:" + max);
    }    
}
