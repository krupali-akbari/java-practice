import java.util.Scanner;

public class Areaofcircle
{
    static double area(double r)
    {
        return 3.14*r*r;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the redius:");
        double redius = sc.nextInt();
        
        System.out.println("result="+ area(redius));
    }


}
