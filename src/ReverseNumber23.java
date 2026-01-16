import java.util.Scanner;

public class ReverseNumber23 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("This is the program to find reverse of number:");
        int num,rem;
        System.out.println("Enter the number to find its reverse");
        num=obj.nextInt();
        System.out.println("The reverse of number is:");
        while (num>0){
            rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
}
