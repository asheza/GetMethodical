import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = SafeInput.getRangedDouble(in, "Enter your item's price: ", 0.50, 10.00);

        boolean confirm = SafeInput.getYNConfirm(in, "Do you have any more items?");

        while (confirm == true)
        {
            System.out.println("Your item's price is: ");
            System.out.printf("%4.2f\n", itemPrice);

           itemPrice = SafeInput.getRangedDouble(in, "Enter your item's price: ", 0.50, 10.00);
           confirm = SafeInput.getYNConfirm(in, "Do you have any more items?");
        }

        System.out.println("Your item's price is: ");
        System.out.printf("%4.2f\n", itemPrice);
        System.out.println("Thank you for shopping with us.\n");
        System.out.println("Goodbye. :)");

    }
}
