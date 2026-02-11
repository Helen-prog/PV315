package lesson_12.map_interface;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(334455, "Михаил Борисов");
        map.put(778899, "Ринат Зуев");
        map.put(443366, "Роман Свиридов");
        map.put(884466, "Анна Полякова");
        map.put(225577, "Анна Полякова");
        map.put(null, "Виктор Водник");
        map.put(225544, null);
        map.putIfAbsent(334466, "Ирина Мельник");
        System.out.println(map);
        System.out.println(map.get(778899));
        System.out.println(map.get(770099));
        map.remove(334466);
        System.out.println(map);
        System.out.println(map.containsKey(778899));
        System.out.println(map.containsValue("Анна Полякова"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
