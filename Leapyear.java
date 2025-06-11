import java.util.Scanner;
class Leapyear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year y=");
        int y=sc.nextInt();
        
        if(y%4==0)
        {
            System.out.println("year is leapyear");
        }
        else
        {
             System.out.println("year is not leapyear");
        }
    }
}