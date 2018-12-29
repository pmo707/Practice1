package ua.nure.pihnastyi.practice1;

public class Part7 {

    private static final int RADIX = 26;
    private static final int ALPHABET_LENGTH =27;
    protected static final char[] alphabet = new char[ALPHABET_LENGTH];
    private static final int CHARACTER_DIFFERENCE = 64;

    public static char[] chargeArray(char[] var) {
        var[0] = CHARACTER_DIFFERENCE;
        for (int i = 1; i < var.length; i++) {
            var[i] = (char) (var[0] + i);
        }
        return var;
    }

    public static int pow(int var1, int var2) {

        int i = 0;
        int result = 1;
        while (i < var2) {

            result = result * var1;
            i++;
        }
        return result;
    }

    public static int str2int(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            int power = number.length() - i - 1;
            result = result + ((int) number.charAt(i) - CHARACTER_DIFFERENCE) * pow(RADIX, power);
        }
        return result;
    }

    public static String int2str(int number) {

        StringBuilder result = new StringBuilder();
        int mod;
        while (number != 0) {
            mod = number % RADIX;
            if (mod == 0) {
                result.append("Z");
                number = (number / RADIX) - 1;
            } else {
                result.append(alphabet[mod]);
                number = (number - mod) / RADIX;
            }
        }
        result.reverse();
        return result.toString();
    }

    public static String rightColumn(String number) {
        String result = "";
        int var;
        var = str2int(number) + 1;
        result = result + int2str(var);
        return result;
    }

    public static void main(String[] args) {
        chargeArray(alphabet);
        String[] testFields = {"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"};
        int intNumber;
        String stringNumber;

        for (String number : testFields) {
            intNumber = str2int(number);
            stringNumber = int2str(intNumber);
            System.out.println(number + " ==> " + intNumber + " ==> " + stringNumber);
        }
    }
}
