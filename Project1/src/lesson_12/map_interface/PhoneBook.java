package lesson_12.map_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();  // {"Зотов": [778899, 112233, 116655], "Калинкин": [449988, 449988], "Романов": [889922]}
        addNumber("Зотов", 778899, phoneBook);
        addNumber("Зотов", 112233, phoneBook);
        addNumber("Калинкин", 449988, phoneBook);
        addNumber("Романов", 889922, phoneBook);
        addNumber("Зотов", 116655, phoneBook);
        addNumber("Калинкин", 449988, phoneBook);
        System.out.println(phoneBook);
        printBook(phoneBook);
    }

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(HashMap<String, ArrayList<Integer>> map) {
        for(var item: map.entrySet()) {
            String phones = "";
            int i = 0;
            for(int el : item.getValue()){
//                phones = phones + el + ", ";
                phones = phones + el + (item.getValue().size() - 1 == i ? "" : ", ");
                i++;
            }
            System.out.printf("%s: %s\n", item.getKey(), phones);
        }
    }
}
