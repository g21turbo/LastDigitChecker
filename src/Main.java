public class Main {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(10, 12, 1000));
        System.out.println(hasSameLastDigit(12, 22, 11));
        System.out.println(hasSameLastDigit(10, 22, 992));
        System.out.println(hasSameLastDigit(10, 20, 50));
        System.out.println(hasSameLastDigit(9, 20, 50));
        System.out.println(hasSameLastDigit(10, 20, 1001));
        System.out.println(hasSameLastDigit(9, 99, 19));

    }

    public static boolean isValid(int number){
       if (number >= 10 && number <= 1000) {
           return true;
       }
       return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        // Input validation
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        // Assign variable to the last digit in each number
        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;
        int lastDigitNum3 = num3 % 10;

        // Compares the last digit in each number
        boolean sharedDigit = lastDigitNum1 == lastDigitNum2 ||
                                lastDigitNum1 == lastDigitNum3;
        boolean sharedDigitTwo = lastDigitNum2 == lastDigitNum3;

        // returns true is at least two on the last digits match
        if (sharedDigit || sharedDigitTwo) {
            return true;
        }
        return false;
    }
}