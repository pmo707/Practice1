package ua.nure.pihnastyi.practice1;

public class Part5 {
    private static final  int NUMBER_OF_RADIX= 10;
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int result = 0;
        for (int i = 0; i < args[0].length(); i++) {

            result = result + x % NUMBER_OF_RADIX;
            x = x  / NUMBER_OF_RADIX;
        }
        System.out.println(result);
    }
}
