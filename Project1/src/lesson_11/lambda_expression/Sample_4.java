package lesson_11.lambda_expression;


import com.sun.source.tree.BreakTree;

interface StringFunc{
    String func(String s);
}

public class Sample_4 {
    public static void main(String[] args) {
        String inStr = "Лямбда выражения в Java";
        String outStr;
        System.out.println("Это исходная строка: " + inStr);
        outStr = stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        outStr = stringOp(str -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println("Строка с удаленными пробелами: " + outStr);
    }

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
}
