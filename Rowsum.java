import java.util.Scanner;
public class Rowsum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int[][] arr = new int[3][3];
        
        System.out.println("Enter the 9 element:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

         for(int i=0;i<3;i++)
        {
            int rowsum =0;
            for(int j=0;j<3;j++)
            {
                rowsum += arr[i][j];
            }
            System.out.println("sum of row  :" + (i + 1)+ ":" + rowsum);
        }
        

        
    }    
}
