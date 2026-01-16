public class StringBasics2 {
    public static void main(String[] args) {
        String var="Hello World";
        String var1="And Welcome";
        int a=10;

        System.out.println("The value inside string is: "+var);
        System.out.println("To Concatennate Two Strings:");
        System.out.println(var+var1);
        System.out.println(var+var1+a);
        //To convert String to integer
        String num="100";
        System.out.println(Integer.parseInt(num)+10);
        String num1="10";
        String num2="100";
        System.out.println(num1+num2);
    }
}
