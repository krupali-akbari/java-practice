import java.util.Scanner;
public class Maxmin2d
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        
        System.out.println("Enter the 4 element:");

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if( arr[i][j] > max) 
                {
                    max = arr[i][j];
                }
            }
        }

        int min = arr[0][0];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if( arr[i][j] < min) 
                {
                    min = arr[i][j];
                }
            }
        }


        System.out.println("max" + max);
        System.out.println("min" + min);
    }    
}
