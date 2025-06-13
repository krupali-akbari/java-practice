import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;
public class D2array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        int[][] arr = new int[2][3];

        System.out.println("Enter 2 row and 3 colum data:");

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("enter value [" + i +"] [" +j +"]" );
                arr[i][j] = sc.nextInt();
            }
            
        }

        System.out.println("entered:");
         for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }    
}
