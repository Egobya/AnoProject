
import java.util.Scanner;
public class PairProcess
{
    public static void main(String[] args)
  {
        int num1, num2;
        int sum;
        String toAdd="";

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        keyboard.nextLine();
        System.out.print( "Last Number?  :" );

        num2 = keyboard.nextInt();
        keyboard.nextLine();

        sum = num1+num2;
        if (sum > 200);
        toAdd+="*";

        if (sum < 1000);
        toAdd+="~";

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

        if (sum>3000);
        System.out.print("Wow, you chose a big number.[Value of number 2] is number 2");
    }
}
