import java.util.Scanner;
public class Diagonal
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
        System.out.println("Diagonal element:");
        for(int i=0;i<3;i++)
        {
            System.out.println(arr[i][i] + "");
        }
    }    
}
