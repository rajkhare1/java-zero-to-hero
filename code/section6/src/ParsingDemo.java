public class ParsingDemo {

    public static void main(String[] args) {
        String strInt = "456";
        int intNum = Integer.parseInt(strInt);

        String strDouble = "3.14";
        double doubleNum = Double.parseDouble(strDouble);

        String strFloat = "2.718";
        float floatNum = Float.parseFloat(strFloat);

        String strLong = "3476543210";
        long longNum = Long.parseLong(strLong);

        String strBoolean = "true";
        boolean isTrue = Boolean.parseBoolean(strBoolean);
        String strName = "Raj";
        boolean isName = Boolean.parseBoolean(strName);

        String hello = "Hello";
        char firstChar = hello.charAt(0);
        char[] charArray = hello.toCharArray();
        char secondChar = charArray[1];
    }

}
