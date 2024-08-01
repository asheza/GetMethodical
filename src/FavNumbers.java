import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int yourNumber = 0;
        double yourDouble = 0;

        yourNumber = SafeInput.getInt(in, "Enter any number you would like. :) : ");

        System.out.println("You typed the number: " + yourNumber);

        yourDouble = SafeInput.getDouble(in, "Enter in any double you would like. :) : ");

        System.out.println("You typed the double: " + yourDouble);

    }
}
