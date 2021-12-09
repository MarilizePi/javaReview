package operators;

public class operatorsChallenge {
    public static void main(String[] args) {

        double doubleValue1 = 20.00;
        double doubleValue2 = 80.00;

        double result = (doubleValue1 + doubleValue2) * 100.00;

        double resultRemainder = result % 40.00;

        // Create a boolean variable that assigns the value true if the remainder of resultRemainder is 0, or false if not zero.

        boolean isRemainderZero = (boolean) (resultRemainder == 0) ? true : false;

        if (!isRemainderZero) {
            System.out.println("Got some remainder.");
        } else {
            System.out.println("The remainder is zero.");

        }

    }
}
