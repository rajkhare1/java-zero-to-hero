public class StringComparisionDemo {

    public static void main(String[] args) {
        String str1 = new String("Hey");
        String str2= new String("Hello");
        String str3 = new String("Hey");

        boolean b1 = str1.equals(str2);
        boolean b2 = str1.equals(str3);

        boolean b3 = str1.equals("Hey");
        boolean b4 = "Hey".equals(str3);
        boolean b5 = "Hey".equals("Hello");

        String str4 = "java";
        String str5 = "JAVA";
        boolean b6 = str4.equalsIgnoreCase(str5);

        int comparision1 = "java".compareTo("java");
        int comparision2 = "java".compareTo("python");
        int comparision3 = "python".compareTo("java");


    }

}
