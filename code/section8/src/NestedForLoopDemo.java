public class NestedForLoopDemo {

    public static void main(String[] args) {
//        getTablesFrom(2,3);
        showPyramid(10);
    }

    private static void getTablesFrom(int fromNum, int toNum) {
        int result;

        for (; fromNum<= toNum; fromNum++) {
            for(int j = 1; j<=10; j++){
                result = fromNum * j;
                System.out.println(fromNum+" x "+j+" = "+result);
            }
            System.out.println("------------------------------------");
        }
    }

    private static void showPyramid(int rows) {
        for(int i = 1; i<=rows; i++){
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
