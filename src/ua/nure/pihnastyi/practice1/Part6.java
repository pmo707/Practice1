package ua.nure.pihnastyi.practice1;

public class Part6 {
    private static final int FIRST_PRIME_NUMBER = 2;

    public static boolean isPrime(int var) {

        if (var < FIRST_PRIME_NUMBER) {
            return false;
        }
        double s = Math.sqrt(var);
        for (int i = FIRST_PRIME_NUMBER; i <= s; i++) {
            if (var % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int[] mass = new int[k];
        int j = FIRST_PRIME_NUMBER;
        int indexK = 0;
        StringBuilder result = new StringBuilder();


        while (indexK < k) {
            while (indexK != k) {
                if (isPrime(j)) {
                    mass[indexK] = j;
                    result.append(mass[indexK]);
                    result.append(" ");
                    indexK++;
                }
                j++;
            }
        }
        System.out.println(result);
    }


}