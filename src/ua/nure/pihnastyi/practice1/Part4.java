package ua.nure.pihnastyi.practice1;


//Написать класс, который реализует функциональность определения наибольшего
// общего делителя двух целых положительных чисел, переданных в приложение как параметры командной строки.
public class Part4 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
//

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else b = b - a;
        }
        System.out.println(a);
    }
}
