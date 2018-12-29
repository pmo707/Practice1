package ua.nure.pihnastyi.practice1;

public class Part3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {

            if (i != args.length - 1) {
                sb.append(args[i]);
                sb.append(" ");

            } else {
                sb.append(args[i]);
            }
        }
        System.out.println(sb);

    }
}
