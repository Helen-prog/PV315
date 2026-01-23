package lesson_2;

import java.util.ArrayList;
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


//        int mas[] = {2, 4, 5, 3};
//        System.out.println(Arrays.toString(mas));
//
//
//        int mas2[] = new int[mas.length + 3];
//        for (int i = 0; i < mas.length; i++) {
//            mas2[i] = mas[i];
//        }
//        System.out.println(Arrays.toString(mas2));
//
//        mas[1] = 10;
//        System.out.println(Arrays.toString(mas));
//        System.out.println(Arrays.toString(mas2));

//        double a = Math.random() * 3;  // [0;3)
//        double a = Math.random() * 5 + 2;  // [2;7)
//        double a = 2 + Math.random() * 5;  // [2;7)
//        double a = Math.random() * 10 - 5;  // [-5;5)

//        int a = (int) (Math.random() * 3); // [0;3)
//        int a = (int)(Math.random() * (10 + 1) - 5);  // [-5;5]
//        System.out.println(a);


//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random()*12 + 2);  // [2;14)
//        }
//        System.out.println(Arrays.toString(array));

//        int sum = 0, count = 0;
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for(int x : array){
//            System.out.print(x + " ");
//        }

        //        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            } else {
//                sum += array[i];
//            }
//        }
//        System.out.println("count = " + count + ", sum = " + sum);

//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Брянск");
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//        System.out.println(cities);
//        cities.add(1,"Красноярск");
//        System.out.println(cities);
//        System.out.println(cities.get(1));
//        cities.set(1, "Курск");
//        System.out.println(cities);
//
//        for (String city : cities) {
//            System.out.print(city + "\t");
//        }
//        System.out.println("\n" + cities.indexOf("Владивосток"));
//
//        System.out.println(cities.contains("Красноярск"));
//        cities.remove("Иркутск");
//        System.out.println(cities);
//
//        System.out.println(cities.size());
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }

//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int)(Math.random()*100));
//        }
//        System.out.println(mas);
//        max = mas.get(0);
//        for (int i = 1; i < mas.size(); i++) {
//            if (mas.get(i) > max) {
//                max = mas.get(i);
//            }
//        }
//        System.out.println("MAX: " + max);
//        ind = mas.indexOf(max);
//        System.out.println("INDEX: " + ind);
//        mas.remove(ind);
//        mas.add(0, max);
//        System.out.println(mas);

        // [1,2,3] + [11,12,13] -> [1,11,2,12,3,13]

//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 12, 13, 44, 55));
//        ArrayList<Integer> c = new ArrayList<>();
//
//        for (int i = 0; i < a.size(); i++) {
//            c.add(a.get(i));
//            c.add(b.get(i));
//        }
//
//        for (int i = a.size(); i < b.size(); i++) {
//            c.add(b.get(i));
//        }
//
//        System.out.println(c);

//        int[][] num = {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}};
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        char[][] graph = new char[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 5; j++) {
//                graph[i][j] = '*';
//            }
//        }
//        for (int i = 0; i < graph.length; i++) {
//            System.out.println(Arrays.toString(graph[i]));
//        }

//        int sum = Integer.MAX_VALUE;
//        int tmp = 0, n = 0;
//        int arr[][] = new int[3][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 100);
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                tmp += arr[i][j];
//            }
//            if(sum > tmp){
//                sum = tmp;
//                n = i;
//            }
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + tmp);
//            tmp = 0;
//        }
//
//        System.out.println("\nСтрока с минимальной суммой элементов " + sum + ", имеет номер " + (n + 1));

//        Зубчатый массив
//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1,2};
//        mas[1] = new int[]{3,4,5};
//        mas[2] = new int[]{6,7,8,9};

//        int[][] mas = new int[][]{{1,2}, {3,4,5}, {6,7,8,9}};
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        int arr[][] = new int[n][];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i + 1];
//        }
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 9;
//        int tp[][] = new int[n][];
//        for (int i = 0; i < n; i++) {
//            tp[i] = new int[i + 1];
//            tp[i][0] = 1;
//            tp[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                tp[i][j] = tp[i - 1][j - 1] + tp[i - 1][j];
//            }
//        }
//
//        for (int i = 0; i < tp.length; i++) {
//            for (int j = 0; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                System.out.print(tp[i][j] + "   ");
//            }
//            System.out.println();
//        }

        float num = 5.25f;
        System.out.println(Math.round(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(4, 2));
        System.out.println(Math.PI);
    }
}
