// Practice #1: Data Types
// 12/04/2021
package reviewdataTypes;

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

        // Short occupies 16 bits.
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("The minimum short value is: " + minShortValue);
        System.out.println("The maximum short value is: " + maxShortValue);


    }
}
