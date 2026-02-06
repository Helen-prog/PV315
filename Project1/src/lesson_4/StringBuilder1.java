package lesson_4;

public class StringBuilder1 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello");
//        sb.append("!");
//        sb.append(true)
//        .append(10);
//        sb.append(10.20f);
//        sb.insert(5, "_?");
//        System.out.println(sb);
//        sb.delete(5, 7);
//        System.out.println(sb);
//        sb.deleteCharAt(5);
//        System.out.println(sb);
//        sb.replace(5, 9, "JavaScript");
//        System.out.println(sb);

//        String st = sb.substring(5, 6);
//        String st = sb.substring(5);
//        System.out.println(st);

//        System.out.println(sb.indexOf("JavaScript2"));
//        System.out.println(sb.indexOf("a", 7));
        StringBuilder sb1 = createStr(5, 3);
        System.out.println(sb1);
        System.out.println(modifyStr(sb1, "=", "равно"));
        System.out.println(modifyStr(sb1, "+", "плюс"));
        System.out.println(modifyStr(sb1, "-", "минус"));
        System.out.println(modifyStr(sb1, "*", "умножить"));
    }

    private static StringBuilder modifyStr(StringBuilder stringBuilder, String oldStr, String newStr) {
        int pos;
        while((pos = stringBuilder.indexOf(oldStr)) != -1) {
            stringBuilder.replace(pos, pos + 1, newStr);
        }
        return stringBuilder;
    }

    private static StringBuilder createStr(int a, int b) {
        StringBuilder res = new StringBuilder();
        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return res;
    }
}
