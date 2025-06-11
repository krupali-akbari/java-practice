import java.util.Scanner;

class Weekday {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of day n: ");
        int day = sc.nextInt();
        
        switch(day)
        {
            case 1: System.out.println("sunday");
            break;
            case 2: System.out.println("monday");
            break;
            case 3: System.out.println("tuesday");
            break;
            case 4: System.out.println("wednesday");
            break;
            case 5: System.out.println("thusday");
            break;
            case 6: System.out.println("friday");
            break;
            case 7: System.out.println("saturday");
            break;
        }

    }
}
