package lesson_3;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("На каком вы этаже: ");
//        int a = sc.nextInt();
//        elevator(a);

//        int[] mas = {1, 3, 5, 7, 9};
//        System.out.println(sumList(0, mas));
//        System.out.println(254 / 10);
        System.out.println(toStr(254, 16));
    }

    private static String toStr(int n, int base) {  // 15
        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (n < base) {  // 15 < 16
            return convert[n];  //  "F"
        } else {
            return toStr(n / base, base) + convert[n % base];   //  "E"
//            return "F" + "E"  => "FE"
        }
    }


    private static int sumList(int i, int[] arr) {  // i = 4, {1, 3, 5, 7, 9}
        if (i == (arr.length - 1)) {  // i == 4
            return arr[i];  // 9
        }
        return arr[i] + sumList(i + 1, arr);  // 1 3 5 7
    }

    public static void elevator(int n) {  // 0
        if (n == 0) {
            System.out.println("Вы в подвале");
            return;
        }
//        System.out.println("=> " + n);
        elevator(n - 1);  // 5 4 3 2 1
        System.out.print(n + " ");
    }
}






