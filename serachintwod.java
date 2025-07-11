import java.util.Scanner;
public class serachintwod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int[][] num =new int[row][col];
        int x=sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               num[i][j]=sc.nextInt();
            }
        }

         for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               if(num[i][j]==x)
               { 
                    System.out.println("x found at location(" + i + " , " + j + ")");
               }
               
            }
        }
        
        }


    }

