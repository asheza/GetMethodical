import java.util.Scanner;

public class BirthDateTime
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter the year you were born: ", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter the month you were born: ", 1, 12);
        int birthDay;

        switch(birthMonth)
        {
            case 4: case 6: case 9: case 11:
                birthDay = SafeInput.getRangedInt(in, "Enter the day you were born: ", 1,30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter the day you were born: ", 1, 29);
                break;
            default:
                birthDay = SafeInput.getRangedInt(in, "Enter the day you were born: ",1,31);
        }

        int birthHour = SafeInput.getRangedInt(in, "Enter the hour you were born: ", 1, 24);
        int birthMinute = SafeInput.getRangedInt(in, "Enter in the minute you were born: ", 1, 59);

        System.out.println("Your birthdate is: " + "Year: " + birthYear + " - " + "Month: " + birthMonth + " - " + "Day: "
                + birthDay + " - " + "Hour: " + birthHour + " - " + "Minute: " + birthMinute);
    }
}
