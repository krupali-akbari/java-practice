import java.util.Scanner;
public class Minarray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int[] num = new int[5];
        
        System.out.println("Enter the 5 number:");

        for(int i=0;i<5;i++)
        {
            num[i] = sc.nextInt();
        }

        int min = num[0];

        for(int i=1;i<5;i++)
        {
            if(num[i] < min)
            {
                min = num[i];
            }
        }

        System.out.println("min number is:" + min);


    
    }
}
