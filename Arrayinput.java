import java.util.Scanner;

public class Arrayinput {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter the number n:");
        
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

        

    }

}
