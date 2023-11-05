public class Main {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(11, 12, 13));
        System.out.println(hasSameLastDigit(9, 12, 13));
        System.out.println(hasSameLastDigit(10, 12, 1000));
        System.out.println(hasSameLastDigit(10, 12, 1001));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (num1 < 10 || num1 > 1000 ||
            num2 < 10 || num2 > 1000 ||
            num3 < 10 || num3 > 1000) {
            return false;
        }
        return true;
    }


}