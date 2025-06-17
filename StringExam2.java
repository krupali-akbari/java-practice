import java.util.Scanner;
public class StringExam2 

{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the string s:");
    String str = sc.nextLine();

    System.out.println("length is " + str.length());
    System.out.println(" uppercase:" + str.toUpperCase());
    System.out.println("first charcter:" + str.charAt(0));




    }
}

