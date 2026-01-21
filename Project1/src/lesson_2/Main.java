package lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        System.out.print("Введите число: ");
////        int num = sc.nextInt();
////
////        System.out.printf("Вы ввели число: %d %n", num);
//
//        System.out.print("Возраст: ");
//        int age = sc.nextInt();
////
////        String name = sc.next();
//        System.out.print("Рост: ");
//        float height = sc.nextFloat();
//        sc.nextLine();
//        System.out.print("Имя: ");
//        String name = sc.nextLine();
//
//        System.out.printf("Имя: %s. Возраст: %d. Рост: %.2f\n", name, age, height);
//        sc.close();

//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("Доступ на сайт разрешен");
//        } else {
//            System.out.println("Доступ запрещен");
//        }

//        int num1 = 27;
//        int num2 = 17;
//        if(num1 > num2){
//            System.out.println("Первое число больше");
//        } else if (num1 < num2) {
//            System.out.println("Второе число больше");
//        } else {
//            System.out.println("Числа равны");
//        }

//        int n;
//        System.out.print("Введите количество ворон: ");
//        n = sc.nextInt();
//        if(n >= 0 && n <= 9) {
//            System.out.print("На ветке ");
//            if(n==1){
//                System.out.println(n + " ворона");
//            } else if(n>=2 && n<=4) {
//                System.out.println(n + " вороны");
//            } else {
//                System.out.println(n + " ворон");
//            }
//        } else {
//            System.out.println("Ошибка ввода данных");
//        }

//        int number, res;
//        number = 10;
//        res = number > 0 ? number : -number;
//        System.out.println(res);

//        int n = true ? (false ? 10 : 20) : 30;
//        System.out.println(n);  // 20

//        int n;
//        System.out.print("Выбор цвета светофора\n1 (11) - красный, 2 (22) - желтый, 3 (33) - красный: ");
//        n = sc.nextInt();
//        switch (n) {
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета у светофора нет");
//        }

//        int n;
//        System.out.print("Выбор цвета светофора\n1 (11) - красный, 2 (22) - желтый, 3 (33) - красный: ");
//        n = sc.nextInt();
//        switch (n) {
//            case 1, 11 -> System.out.println("Стоим");
//            case 2, 22 -> System.out.println("Приготовились");
//            case 3, 33 -> System.out.println("Идем");
//            default -> System.out.println("Такого цвета у светофора нет");
//        }

//        int n;
//        System.out.print("Выбор цвета светофора\n1 (11) - красный, 2 (22) - желтый, 3 (33) - красный: ");
//        n = sc.nextInt();
//        String s = switch (n) {
//            case 1, 11 -> "Стоим";
//            case 2, 22 -> "Приготовились";
//            case 3, 33 -> "Идем";
//            default -> "Такого цвета у светофора нет";
//        };
//        System.out.println(s);

//        System.out.print("Введите бал по 12 бальной системе оценивания: ");
//        int num = sc.nextInt();
//        System.out.print("Ваш бал по 5 бальной системе оценивания: ");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3 :
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0) {
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Такого значения не существует");
//        }

//        int i = 0;
//        while(i < 5){
//            System.out.println("i = " + i);
//            i++;
//        }

//        int n, sum = 0;
//        System.out.print("Введите число: ");
//        while (sc.hasNextInt()) {
//            System.out.print("Введите число: ");
//            n = sc.nextInt();
//            sum += n;
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int i = 0;
//        do{
//            System.out.println("i = " + i);
//            i++;
//        }while(i < 5);

//        int number, copy, reverse_number = 0;
//        System.out.print("Введите число: ");
//        number = sc.nextInt();  // 123  => 321
//        copy = number;
//        do {
//            reverse_number *= 10;
//            reverse_number += copy % 10;
//            copy /= 10;
//        } while (copy > 0);
//        System.out.println("Число " + number + (number == reverse_number ? " " : " не ") + "палиндром");


//        int i = 1;
//        while (i < 10) {
//            int j = 1;
//            while (j < 10) {
//                System.out.print(i + " * " + j + " = " + i * j + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int count = 0;
//        for (int i = 0; i < 6; i++) {
//            System.out.print("-> ");
//            if(sc.hasNextInt()) {
//                count++;
//            }
//            sc.nextLine();
//        }
//        System.out.println("Вы ввели чисел: " + count);

//        for (int x = 0, y = 0; x < 5; x++, y--) {
//            System.out.println("x: " + x + ", y: " + y);
//        }

//        int mas[] = new int[4];
//        int[] mas2 = new int[5];
//        int mas3[];
//        mas3 = new int[4];
//        int mas[] = new int[]{2, 4, 5, 3};
//        int mas[] = {2, 4, 5, 3};


//        int mas[] = new int[4];
//        mas[0] = 5;
//        mas[1] = 2;
//        mas[2] = 3;
//        mas[3] = mas[1] + mas[2];

//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);

//        for (int i = 0; i < mas.length; i++) {
//            System.out.print("-> ");
//            mas[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            System.out.println(mas[i]);
//        }


        int mas[] = {2, 4, 5, 3};
        System.out.println(Arrays.toString(mas));


        int mas2[] = new int[mas.length + 3];
        for (int i = 0; i < mas.length; i++) {
            mas2[i] = mas[i];
        }
        System.out.println(Arrays.toString(mas2));

        mas[1] = 10;
        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(mas2));
    }
}
