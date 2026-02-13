package lesson_12.map_interface;

import java.util.Scanner;

public class TestHashTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер хеш-таблицы: ");

        HashTableExample table = new HashTableExample(sc.nextInt());
        boolean exit = false;

        while (!exit) {
            System.out.println("*** Операции с хэш-таблицами ***");
            System.out.println("1. добавить");
            System.out.println("2. удалить");
            System.out.println("3. распечатать хэш-таблицу");
            System.out.println("4. получить");
            System.out.println("5. очистить");
            System.out.println("6. размер");

            System.out.print("Выбор варианта: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите ключ (строка): ");
                    String key = sc.next();
                    System.out.print("Введите значение (число): ");
                    int value = sc.nextInt();
                    table.insert(key, value);
                    break;
                case 2:
                    System.out.print("Введите ключ (строка): ");
                    String key2 = sc.next();
                    table.remove(key2);
                    System.out.println("Удален успешно...");
                    break;
                case 3:
                    System.out.println("Пары ключ-значение в хеш-таблице: ");
                    table.printHashTable();
                    break;
                case 4:
                    System.out.print("Введите ключ (строка): ");
                    String key3 = sc.next();
                    System.out.println("Ключ = " + key3 + " значение = " + table.get(key3));
                    break;
                case 5:
                    table.makeEmpty();
                    System.out.println("Хэш-таблица успешно очищена...");
                    break;
                case 6:
                    System.out.println("Размер хэш-таблицы = " + table.getSize());
                    break;
                default:
                    exit = true;
                    System.out.println("Программа успешно завершена");
            }
        }
    }
}

class HashTableExample {

    class LinkedHash {
        String key;
        int value;
        LinkedHash next;

        public LinkedHash(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private int tableSize;
    private int size;
    private LinkedHash[] table;

    public HashTableExample(int ts) {
        size = 0;
        tableSize = ts;
        table = new LinkedHash[tableSize];

        for (int i = 0; i < tableSize; i++) {
            table[i] = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void makeEmpty() {
        for (int i = 0; i < tableSize; i++) {
            table[i] = null;
        }
    }

    public int get(String key) {
        int value = myHash(key) % tableSize;
        if (table[value] == null) {
            return -1;
        } else {
            LinkedHash current = table[value];
            while (current != null && !current.key.equals(key)) {
                current = current.next;
            }
            if (current == null) {
                return -1;
            } else {
                return current.value;
            }
        }
    }

    private int myHash(String x) {
        int value = x.hashCode();
        value = value % tableSize;
        if (value < 0) {
            value = value + tableSize;
        }
        return value;
    }

    public void insert(String key, int value) {
        int hash = (myHash(key) % tableSize);
        if (table[hash] == null) {
            table[hash] = new LinkedHash(key, value);
        } else {
            LinkedHash entry = table[hash];
            while (entry.next != null && !entry.key.equals(key)) {
                entry = entry.next;
            }
            if (entry.key.equals(key)) {
                entry.value = value;
            } else {
                entry.next = new LinkedHash(key, value);
            }
        }
        size++;
    }

    public void remove(String key) {
        int hash = myHash(key) % tableSize;
        if (table[hash] != null) {
            LinkedHash prev = null;
            LinkedHash current = table[hash];
            while (current != null && !current.key.equals(key)) {
                prev = current;
                current = current.next;
            }
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[hash] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
            }
        }
    }

    public void printHashTable() {
        for (int i = 0; i < tableSize; i++) {
            LinkedHash current = table[i];
            while (current != null) {
                System.out.print("Значение = " + current.value + " Ключ = " + current.key + "\n");
                current = current.next;
            }
        }
        System.out.println();
    }
}
