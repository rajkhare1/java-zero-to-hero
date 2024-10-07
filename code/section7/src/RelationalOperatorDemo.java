public class RelationalOperatorDemo {

    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 9;
        int num3 = 9;
        boolean isSame = num1 == num2;

        boolean a = true;
        boolean b = false;
        boolean isEqual = a == b;

        boolean isSimilar = (num1 == num2)  && (num2== num3);

        int num4 = 5;
        int num5 = 10;
        boolean isNotEqual = num4 != num5;

        boolean bool1 = true;
        boolean bool2 = false;
        isNotEqual = bool1 != bool2;

        double num6 = 3.14;
        double num7 = 3.14;
        isNotEqual = num6 != num7;

        boolean isSimilar1 = (num1 != num2) && ( num2 != num3);

        int num8 = 9;
        int num9 = 6;
        double num10 = Double.NaN;
        boolean isGreaterThanOrEqal;
        isGreaterThanOrEqal = num8 >= num9;// true
        isGreaterThanOrEqal = num10 >= num9;// false


        }

}
