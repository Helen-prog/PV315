package lesson_3;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("На каком вы этаже: ");
        int a = sc.nextInt();
        elevator(a);
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






