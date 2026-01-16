import java.util.Scanner;

public class SumOfDigits24 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("This is the program to find reverse of number:");
        int num,rem,sum=0;
        System.out.println("Enter the number to find its sum");
        num=obj.nextInt();
        while (num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("The sum of digits is:"+sum);
    }
}
