import java.util.Scanner;
public class Aveg 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int sum=0;

        System.out.println("Enter the 3 number:");

        for(int i=0;i<3;i++)
        {
            num[i] = sc.nextInt();
            sum += num[i];
        }

        double aveg = (double)sum / num.length;

        System.out.println(" average" + aveg);

    }    
}
