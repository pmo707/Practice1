package ua.nure.pihnastyi.practice1;


public class Part7 {

    final static int RADIX = 26;
    public static char[] alphabet = new char[27];

    public static char[] chargeArray(char[] var) {
        var[0] = 64;
        for (int i = 1; i < var.length; i++) {
            var[i] = (char) ((var[0] + i));
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

    public static int chars2digits(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            int power = number.length() - i - 1;
            result = result + ((int) number.charAt(i) - 64) * pow(RADIX, power);
        }
        return result;
    }

    public static String digits2chars(int number) {

        String result = "";
        int valueOfArticle = number;
        int k = 0;
        int mod = 0;

        while (number != 0) {
            mod = number % RADIX;
            if (mod == 0) {
                result = result + "Z";
                number = (number / 26) - 1;
            } else {
                result = result + alphabet[mod];
                number = (number - mod) / RADIX;
            }

        }

        result = new StringBuffer(result).reverse().toString();
        return result;
    }

    public static String rightColumn(String number) {

        String result = "";
        int var = 0;
        var = chars2digits(number) + 1;
        result = result + digits2chars(var);
        return result;

    }

    public static void main(String[] args) {
        chargeArray(alphabet);
        int digit1 = Integer.parseInt(args[0]);
        String char1 = String.valueOf(args[1]);
        String char2 = String.valueOf(args[2]);
        
        System.out.println(digit1 + " --> " + Part7.digits2chars(digit1));
        System.out.println(char1 + " --> " + Part7.chars2digits(char1));
        System.out.println(char2 + " --> " + Part7.rightColumn(char2));
    }
}
