import java.util.Scanner;
public class Reversearray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        int[] arr = new int[5];

        System.out.println("Enter the element:");
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("reverse order:");

        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }    
}
