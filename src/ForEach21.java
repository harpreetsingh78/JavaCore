import java.util.Scanner;

public class ForEach21 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("This is the program to traverse array:");
        int []array=new int[5];
        System.out.println("Enter the five elements of array");
        for (int i=0;i<5;i++)
        {
            array[i]= obj.nextInt();
        }
        System.out.println("The elemets in array are:");
        for (int i=0;i<5;i++)
        {
            System.out.println("The "+(i+1)+"element of array is:"+array[i]);
        }
        System.out.println("***********************");
        for(int temp:array)
        {
            System.out.println("The element of array is:"+temp);
        }

    }
}
