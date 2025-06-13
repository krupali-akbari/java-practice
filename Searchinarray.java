import java.util.Scanner;
public class Searchinarray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        int[] num = new int[5];
        boolean found = false;
        
        System.out.println("Enter the 5 number:");

        for(int i=0;i<5;i++)
        {
            num[i] = sc.nextInt();
        }

        System.out.println(" enter searching element:");
        int search = sc.nextInt();

        for(int i=1;i<5;i++)
        {
            if(num[i] == search)
            {
                found = true;
                break;
            }
        }

            if(found)
            {
                System.out.println("number is present");
            }
            else
            {
                System.out.println("number is not present");
            }
        

        
    }    
}
