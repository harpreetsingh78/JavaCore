public class Typecstingpart4 {
    public static void main(String[] args) {
        String str="10";
//        int i=(int)str; //This will not work
        int i=Integer.parseInt(str);
        System.out.println(i);
        //implicit typecasting int to float
        int a=500;
        float b=a;
        System.out.println(b);
        long d=500;
        float c=d;//float is larger than long
        System.out.println("After converting long to float :"+c);
        //explicit typecasting
        float f=300.0f;
        int g=(int)f;
        System.out.println("Float to int:"+g);



    }
}
