import java.util.Scanner;

class Evenoddswitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        
        char ch;
        switch(n%2)
        {
            case 0: 
               System.out.println("number is even");
            break;
            case 1:
                System.out.println("number is odd");
            break;
           
        }
        
  
    }
}
