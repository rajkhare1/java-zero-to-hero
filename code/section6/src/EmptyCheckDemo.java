public class EmptyCheckDemo {

    public static void main(String[] args) {
        String myString = "";
        boolean isEmpty = myString.isEmpty();
        boolean isLengthZero = myString.length() == 0;
        boolean isEqualsEmpty = "".equals(myString);

        String nullString = null;
        boolean isNullEmpty = "".equals(nullString);
        //boolean isEmptyNull = nullString.length() == 0;

        String blankString = "   ";
        boolean isBlankEmpty = blankString.isEmpty();
        boolean isBlank = blankString.isBlank();


    }

}
