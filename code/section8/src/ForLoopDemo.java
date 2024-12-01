public class ForLoopDemo {

    public static void main(String[] args) {

        getTableFor(30);

        /*for (;;) {
            System.out.println("Hi");
        }*/

//        for (;;);



    }

    private static void getTableFor(int number) {

        int result;

        for (int i =1; i<= 10; i++) {
            result = number * i;
            System.out.println(number+" X "+i+" = "+result);

        }

    }

}
