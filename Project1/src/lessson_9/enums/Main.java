package lessson_9.enums;


enum Seasons{
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень"),
    WINTER("Зима");

    private String title;

    Seasons(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println(Seasons.SPRING);
//        System.out.println(Seasons.SUMMER);
//        System.out.println(Seasons.AUTUMN);
//        System.out.println(Seasons.WINTER);
//        for (Seasons season : Seasons.values()) {
//            System.out.println(season.name());
//        }

        int summerIndex = Seasons.SUMMER.ordinal();
        System.out.println(summerIndex);
    }
}
