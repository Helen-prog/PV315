package lesson_13;

import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        Stream<Notebook> notebooks = Stream.of(
                new Notebook("ThinkPad", 40000),
                new Notebook("MacBook", 45000),
                new Notebook("Legion", 55000)
        );
//        notebooks.filter(p -> p.getPrice() < 50000).forEach(p -> System.out.println(p.getName()));
        notebooks.map(p -> p.getName()).forEach(p -> System.out.println(p));
    }
}

class Notebook{
    private String name;
    private int price;

    public Notebook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
