public class Typecasting3 {
    public static void main(String[] args) {
        // implicit typecasting
        short a1=10;
       //  byte a2=a1; // error Because byte is shorter than short and we cannot store large value in short
        long a2=a1;
        int a3=a1;
        System.out.println("The value of a1 is :"+a1+"\n"+"The value of a2 is:"+a2+"\n"+"The value of a3 is :"+a3);
        //explicit typecasting
        short var =10;
        byte var2=(byte) var;
        System.out.println("The value after converting short to byte is:"+var2);
    }
}
