public class Arrays{
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2; 
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(findMinimum(arr));
        System.out.println(findMaximum(arr));
        System.out.println(contains(arr, 1));
        System.out.println(calculateSum(arr));
        System.out.println(calculateAverage(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse(arr)));


    }
    // Returns the smallest value in the array
    public static int findMinimum(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return true;
            }
        }
        return false;
    }
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int calculateAverage(int[] arr) {
        return (int) calculateSum(arr) / arr.length;
    }
    public static int[] reverse(int[] arr) {
        int[] reverseArr = new int[arr.length];
        int counter = 0;
        for (int i = arr.length-1; i != 0; i--) {
            reverseArr[counter] = arr[i];
            counter++;
        }
        return reverseArr;
    }
    public static int findMedian(int[] arr) {
        return 1;
    }
    public static void bubbleSort(int[] arr) {
        
    }
    public static String toString(int[] arr) {
        String a = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == arr.length){
                a += Integer.toString(arr[i]) + "]";
                break;
            }
            a += Integer.toString(arr[i]) + ", ";
        }
        return a;
    }
}