package lesson_4;

public class Sample {
    public static void main(String[] args) {
        StringBuilder modStr = getStringBuilder();
        System.out.println("Измененная строка: " + modStr);
    }

    private static StringBuilder getStringBuilder() {
        System.out.print("Исходная строка: ");
        String str = "   Текст с  повторяющимися   символами  ";
        System.out.println(str);
        StringBuilder modStr = new StringBuilder(str.replace(" ", ""));
        for (int i = 0; i < modStr.length(); i++) {
            for (int j = modStr.length() - 1; j > i; j--) {
                if(modStr.charAt(i) == modStr.charAt(j)) {
                    modStr.deleteCharAt(j);
                }
            }
        }
        return modStr;
    }
}
