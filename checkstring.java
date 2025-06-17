import java.util.Scanner;
public class checkstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("enter second string:");
        String str2 = sc.nextLine();

        if(str1.equals (str2))
        {
            System.out.println("string is equal");
        }
        else{
        System.out.println("string is not equal");
        }
    }
}
