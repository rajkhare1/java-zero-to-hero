public class SwitchCaseDemo {

    public static void main(String[] args) {

        String fruitName = "Apple";

        switch (fruitName) {

            case "Banana":
            case "Apple":
                System.out.println("$ 1.5 charged");
                break;

            case "Grapes":
                System.out.println("$ 2.0 charged");
                break;

            case "Pineapple":
                System.out.println("$ 2.5 charged");
                break;

            case "Mango":
                System.out.println("$ 3.0 charged");
                break;

            default:
                System.out.println("Pick a valid food");
                break;

        }

    }

}
