import java.util.Scanner;
public class BasicExercisesQuestion2
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int change = 0;
        final int dollar = 100;
        final int quarter = 25;
        final int dime = 10;
        final int nickel = 5;
        int temp = 0;
        int dollar_count = 0;
        int quarter_count = 0;
        int dime_count = 0;
        int nickel_count = 0;
        String final_statement = null;

        System.out.print("Please enter your amount of change in pennies: ");
        change = scan.nextInt();

        dollar_count = change / dollar;
        temp = change - (dollar_count * dollar);

        quarter_count = temp / quarter;
        temp -= (quarter_count * quarter);

        dime_count = temp / dime;
        temp -= (dime_count * dime);

        nickel_count = temp / nickel;
        temp -= (nickel_count * nickel);

        final_statement = "Your change is: ";

        final_statement +=
            dollar_count > 0 ?
                dollar_count > 1 ?
                    dollar_count + " dollars, "
                        : dollar_count + " dollar, "
            : "";

        final_statement +=
            quarter_count > 0 ?
                quarter_count > 1 ?
                    quarter_count + " quarters, "
                    : quarter_count + " quarter, "
            : "";

        final_statement +=
            dime_count > 0 ?
                dime_count > 1 ?
                    dime_count + " dimes, "
                    : dime_count + " dime, "
            : "";

        final_statement +=
            nickel_count > 0 ?
                nickel_count > 1 ?
                    nickel_count + " nickels, "
                    : nickel_count + " nickel, "
            : "";

        final_statement +=
            temp > 0 ?
                temp > 1 ?
                    temp + " pennies, "
                    :  temp + " penny, "
            : "";

        System.out.println(final_statement);

    }
}
