public class EscapeSeqDemo {

    public static void main(String[] args) {
        String name = "\"Raj\"";
        System.out.println(name);

        String m = "\u004D";
        System.out.println(m);
        String unicodeName = "\u0052\u0061\u006A \u004B\u0068\u0061\u0072\u0065";
        System.out.println(unicodeName);
    }

}
