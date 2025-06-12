//method overloading
public class Overlodingsum
{
    //method 1
    static int add(int a , int b)
    {
        return a + b;
    }

    //method 2
    static int add(int a , int b , int c )
    {
        return a + b + c;
    }

    public static void main(String[] args) 
    {
        System.out.println("sum1="+add(10 , 20));
        System.out.println("sum2="+add(3,4,6));
    }
}
