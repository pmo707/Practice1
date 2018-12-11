package ua.nure.pihnastyi.practice1;

public class Part5 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int result = 0;
        for (int i = 0; i < args[0].length(); i++) {

            result = result + x % 10;
            x = (x - x % 10) / 10;//////////////////////////

        }

        System.out.println(result);
    }
}
