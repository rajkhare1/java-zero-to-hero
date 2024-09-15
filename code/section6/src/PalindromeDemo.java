public class PalindromeDemo {

    public static void main(String[] args) {
        String input = "mom";
        boolean result = isPalindrone(input);
        System.out.println("Given input is palindrone: "+ result);
    }

    private static boolean isPalindrone(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        return input.equals(stringBuilder.reverse().toString());
    }

}
