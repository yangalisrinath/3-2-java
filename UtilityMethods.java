public class UtilityMethods {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }
    public static int square(int num) {
        return num * num;
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Max of 5 and 9: " + findMax(5, 9));
        System.out.println("Square of 4: " + square(4));
        System.out.println("Reverse of 'Java': " + reverseString("Java"));
        System.out.println("Is string empty? " + isNullOrEmpty(""));
    }
}
