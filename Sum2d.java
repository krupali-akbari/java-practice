import java.util.Scanner;
public class Sum2d 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[2][2];
        int sum=0;
        
        System.out.println("Enter the 4 element:");

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                num[i][j] = sc.nextInt();
                sum += num[i][j];
            }
            
        }
        System.out.println("sum:" + sum);
    }    
}
