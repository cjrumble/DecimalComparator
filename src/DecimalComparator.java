public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber ) {
        boolean equalByThree = false;
        int decimalPrecision = 3;

        double scale = Math.pow(10d, decimalPrecision);
        firstNumber =  (((int) (firstNumber * scale)) / scale);
        secondNumber = (((int) (secondNumber * scale)) / scale);

        System.out.println(scale);
        System.out.println((firstNumber * scale) / scale);
        System.out.println((secondNumber * scale) / scale);
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber == secondNumber) {
            equalByThree = true;
        }
        return equalByThree;
    }
}