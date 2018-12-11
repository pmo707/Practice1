package ua.nure.pihnastyi.practice1;

public class Part6 {

    public static boolean isPrime(int var) {

        if (var < 2)
            return false;
        double s = Math.sqrt(var);
        for (int i = 2; i <= s; i++) {
            if (var % i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int[] mass = new int[k];
        int j = 2;
        int indexK = 0;


        while (indexK < k) {
            while (indexK != k) {
                if (isPrime(j)) {
                    System.out.print((mass[indexK] = j) + " ");

                    indexK++;
                }
                j++;
            }

        }


    }


}