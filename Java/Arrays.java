package Java;

class Arrays{
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    // Returns the size of the array of a generic type.
    public <T> int size(T[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type int.
    public int size(int[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type double.
    public int size(double[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type float
    public int size(float[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type long
    public int size(long[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type byte
    public int size(byte[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type short
    public int size(short[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type char
    public int size(char[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    // Returns the size of the array of a primitive type boolean
    public int size(boolean[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length++;
        }
        return length;
    }
    
}
