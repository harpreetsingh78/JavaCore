public class IfElseIf13 {
    public static void main(String[] args) {
        int x=4;
        int y=7;
        if(x==5){
            System.out.println("The value of x is 5");
        }
        else if(x>5)
        {
            System.out.println("The value of x is greater than 5");
        }
        else {
            System.out.println("X is smaller than 5");
            if(y==7){
                System.out.println("The value of y is 7");
            }
        }
    }
}
