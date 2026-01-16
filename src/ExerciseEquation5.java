import java.util.Scanner;

public class ExerciseEquation5 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,result;
        float b;
        System.out.println("To Solve the equation (a+b)^2:");
        System.out.println("Enter the value of a:");
        a=obj.nextInt();
        System.out.println("Enter the value of b:");
        b=obj.nextInt();
        result=(int)(a*a+b*b+2*a*b);
        System.out.println("The solution of equation is:"+result);


    }
}
