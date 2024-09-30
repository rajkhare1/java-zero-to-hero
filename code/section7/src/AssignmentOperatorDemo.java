public class AssignmentOperatorDemo {

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        num1 = num2 = num3 = num4 = num5 = 98;

        double dNum1 = 3.14;
        double dNum2 = 4.48;
        dNum1 = dNum2;
        System.out.println(dNum1);
        dNum2 = 6.68;
        System.out.println(dNum1);

        Person person1 = new Person("Raj");
        Person person2 = new Person("Richa");
        person1 = person2;
        System.out.println(person1.name);
        person2.name = "RICHA";
        System.out.println(person1.name);
        person1.name = "John";
        System.out.println(person2.name);
    }

}
