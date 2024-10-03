public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {
        byte num1;
        num1 = 8;

        byte num2 = 3;
        byte num3 = 5;
        num1 = (byte) (num2 + num3);
        num1 = 5 + 3;

        double num4;
        double num5 = 3.14;
        byte num6 = 3;
        num4 = num5 + num6;
        System.out.println(num4);

        int result1 = 9/2;
        float result2 = 9/2.0f;

        int result3 = 21%2;

        byte num7 = 9;
        byte num8 = 3;
        num7 = num8;
        num7 = (byte) +num8;

        byte num9 = 9;
        byte num10 = 3;
        num9 = num10;
        num9 = (byte) -num10;

        byte num11 = -(-9);

        int num12 = 42;
        num12 += 3.3; // num12 = (int) num12 + 3.3;

        int num13 = 42;
        num13 -= 3.3; // num13 = (int) num13 - 3.3;

        String str = "Hello";
        str += 9;

        int num14 = 45;
        int num15 = 4;
        num15 = num14++ + 5;

        int num16 = 45;
        int num17 = 4;
        num17 = ++num16 + 5;





    }

}
