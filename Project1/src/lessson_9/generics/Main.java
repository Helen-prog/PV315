package lessson_9.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 5, 3, 4};
        Double[] doubleArray = {2.1, 1.1, 5.1, 3.1, 4.1};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }

    public static <T> void printArray(T[] intArray) {
        for(T i : intArray) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
}
