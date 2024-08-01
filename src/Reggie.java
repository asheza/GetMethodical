import java.util.Scanner;

public class Reggie
{
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            String SSN = "";
            String UCID = "";
            String menuChoice = "";
            boolean done = false;

            SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
            System.out.println("Your SSN is: " + SSN + "\n");

            UCID = SafeInput.getRegExString(in, "Enter your UCID number: ","(M|m)\\d{5}");
            System.out.println("Your UCID is: " + UCID + "\n");

            do {
                menuChoice = SafeInput.getRegExString(in,"Select a choice O,S,V,Q","^[OoSsVvQq]$");

                if (menuChoice.equalsIgnoreCase("O"))
                {
                    System.out.println("You have chosen 'O' to open the program.\n");
                } else if (menuChoice.equalsIgnoreCase("S"))
                {
                    System.out.println("You have chosen 'S' to Save the program.\n");
                }
                else if (menuChoice.equalsIgnoreCase("V"))
                {
                    System.out.println("You have chosen 'V' to View the program.\n");
                }
                else
                {
                    System.out.println("You have chosen 'Q' to quit. Goodbye. :)\n");
                    done = true;
                }
            }while (!done);
            System.out.println("Thank you for your input.");;
        }
}
