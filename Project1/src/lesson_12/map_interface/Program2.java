package lesson_12.map_interface;

import java.util.HashMap;
import java.util.Objects;

public class Program2 {
    public static void main(String[] args) {
        HashMap map = new HashMap(16, 0.75f);
        map.put(new Key("Виталий"), 20);
        map.put(new Key("Александр"), 30);
        map.put(new Key("Виталий"), 40);
        map.put(new Key("Александра"), 25);

        System.out.println("\nЗначение для ключа Александр: " + map.get(new Key("Александр")));
        System.out.println("\nЗначение для ключа Виталий: " + map.get(new Key("Виталий")));
        System.out.println("\nЗначение для ключа Александра: " + map.get(new Key("Александра")));

        System.out.println(map);
    }
}

class Key{
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        return key.equals(((Key) o).key);
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0);
        System.out.println("hashCode для ключа: " + key + " = " + hash);
        return hash;
    }
}
