public class CanVote {

    public static void main(String[] args) {
        boolean isCitizen = true;
        int age =  16;

        if (isCitizen && age > 18) {
            System.out.println("The person can vote");
        } else {
            System.out.println("The person can't vote");
        }
    }

}
