public class Main {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(11, 12, 13));
        System.out.println(hasSameLastDigit(9, 12, 13));
        System.out.println(hasSameLastDigit(10, 12, 1000));
        System.out.println(hasSameLastDigit(10, 12, 1001));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {


        // Input validation
        boolean num1Valid = num1 >= 10 && num1 <= 1000;
        boolean num2Valid = num2 >= 10 && num2 <= 1000;
        boolean num3Valid = num3 >= 10 && num3 <= 1000;

        if (!num1Valid || !num2Valid || !num3Valid) {
            return false;
        }

        return true;

    }


}