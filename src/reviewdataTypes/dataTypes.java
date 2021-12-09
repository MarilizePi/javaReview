// Practice #1: Data Types
// 12/04/2021

package reviewDataTypes;

public class dataTypes {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Having a number larger or smaller than the min and max, will cause an overflow or underflow consequently.
        // Also, some data types occupy more space than others.

        // Int occupies 32 bits
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("The minimum integer value is: " + minIntValue);
        System.out.println("The maximum integer value is: " + maxIntValue);

        // Byte occupies 8 bits.
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("The minimum byte value is: " + minByteValue);
        System.out.println("The maximum byte value is: " + maxByteValue);

        // long occupies 16 bits.
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("The minimum short value is: " + minShortValue);
        System.out.println("The maximum short value is: " + maxShortValue);

        // Long occupies 64 bits.
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("The minimum long value is: " + minLongValue);
        System.out.println("The maximum long value is: " + maxLongValue);


        // When doing an operation, such as (number / 2), Java automatically recognizes all the numbers as an integers. If we want to use another data type, we have to use something called Casting. Casting is simply specifying the data type used in the operation. No need cast a long data type. Exemple:

        byte myByteValue = (byte) (maxByteValue / 2);
        System.out.println(myByteValue);



        // CHALLENGE: 
        // First: create a byte, short, int and set them to any value number.
        // Second: create a variable of type long and make it equal to 50,000 + 10x the sum of the byte + short + int.

        byte myByteNumber = 10;
        short myShortNumber = 20;
        int myIntNumber = 50;

        long myLongNumber = 50000L + ((myByteNumber + myShortNumber + myIntNumber) * 10); 
        System.out.println(myLongNumber);



    // ************************************************************************************************* //

    // Float and Double data types are used when we want more precision in calculations. Float is a single precision, and double is a double precision. Double is the default and prefered Java data type.
    
    // Float occupies 32 bits.
    float minFloatValue = Float.MIN_VALUE;
    float maxFloatValue = Float.MAX_VALUE;
    System.out.println("The minimum float value is: " + minFloatValue);
    System.out.println("The maximum float value is: " + maxFloatValue);

    // Double occupies 64 bits.
    double minDoubleValue = Double.MIN_VALUE;
    double maxDoubleValue = Double.MAX_VALUE;
    System.out.println("The minimum double value is: " + minDoubleValue);
    System.out.println("The maximum double value is: " + maxDoubleValue);

    //An important issue to point out is that while float and double data types are good in general calculations, they become limited when performing precise calculations. To solve that issue, we use a class called BigDecimal. An example is performing currency calculations.

     // ************************************************************************************************* //

// Char is used to store a single character in a variable. It occupies 16 bits of memory. Char allows us to store Unicode characters.

char firstLetterOfMyName = 'M';
System.out.println(firstLetterOfMyName);

// In order to use any character, I can simply the reference number/letter.

char letterPi = '\u03C0';
System.out.println(letterPi);


// Boolean is a very useful and important data type, as it allows for two choices: (TRUE or FALSE), or (1 or 0).

boolean trueBooleanValue = true;
boolean falseBooleanValue = false;

System.out.println(trueBooleanValue);
System.out.println(falseBooleanValue);


// String is not a primitive data type. It is actually a class. A string, unlike the char, it can store a sequence of character. The max value is 2.14 billion characters. 

// Also, Strings are immutable. They cannot be changed after being created. If I want it to be change, there is something called StringBuffer.

String myName = "My name is Marilize.";
System.out.println(myName);



    }
}
