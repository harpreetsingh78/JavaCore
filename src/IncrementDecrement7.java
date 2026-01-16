public class IncrementDecrement7 {
    public static void main(String[] args) {
        int x=5;
        int y=7;
        System.out.println(x++);//5 ,6
        System.out.println(++x);//7 , 7
        System.out.println(y--);//7, 6
        System.out.println(--y);//5  5
        System.out.println(y++ + --x + x++ + y--); //5+6+6+6=23
    }
}
