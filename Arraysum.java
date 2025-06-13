import java.util.Scanner;
public class Arraysum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        int[] num = new int[5];
        int sum=0;
        
        System.out.println("enter the 5 number:");

        for(int i=0;i<5;i++)
        {
            num[i] = sc.nextInt();
            sum += num[i];
        }

       
            System.out.println("sum  of nummber:" + sum);
        



    }    
}
