package Java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Arrays{
    public static void main(String[] args) {
        testSizeArrays();
    }
    @Test
    public static void testSizeArrays() {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals("int array does not match", 6, size(intArray));
        assertEquals("double array does not match", 5, size(doubleArray));
    }
    // Returns the size of the array of a generic type.
    public static <T> int size(T[] array) {
        System.out.println("Currently in the generic method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type int.
    public static int size(int[] array) {
        System.out.println("Currently in the int method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type double.
    public static int size(double[] array) {
        System.out.println("Currently in the double method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type float
    public static int size(float[] array) {
        System.out.println("Currently in the float method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type long
    public static int size(long[] array) {
        System.out.println("Currently in the long method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type byte
    public static int size(byte[] array) {
        System.out.println("Currently in the byte method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type short
    public static int size(short[] array) {
        System.out.println("Currently in the short method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type char
    public static int size(char[] array) {
        System.out.println("Currently in the char method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type boolean
    public static int size(boolean[] array) {
        System.out.println("Currently in the boolean method of size()");
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    
}
