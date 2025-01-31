public class CreditCardInterest {
    public static void main(String[] args)
    {
        double creditBalance = 5000.00;
        final double INTEREST_RATE = .17;
        double monthlyInterest = 0;
        int monthsElapsed = 0;

        monthlyInterest = creditBalance * INTEREST_RATE;
        monthlyInterest = monthlyInterest * 100; //used to get rid of floating decimal
        monthlyInterest = Math.round(monthlyInterest);
        monthlyInterest = monthlyInterest / 100;
        creditBalance = creditBalance + monthlyInterest;
        monthsElapsed++;
        System.out.println("The monthly interest for month " + monthsElapsed + " is " + monthlyInterest + " bringing your balance to " + creditBalance + ".");
        monthlyInterest = creditBalance * INTEREST_RATE;
        monthlyInterest = monthlyInterest * 100; //used to get rid of floating decimal
        monthlyInterest = Math.round(monthlyInterest);
        monthlyInterest = monthlyInterest / 100;
        creditBalance = creditBalance + monthlyInterest;
        monthsElapsed++;
        System.out.println("The monthly interest for month " + monthsElapsed + " is " + monthlyInterest + " bringing your balance to " + creditBalance + ".");

    }
}