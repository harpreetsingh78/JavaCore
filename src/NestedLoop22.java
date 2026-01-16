public class NestedLoop22 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            System.out.println("Outer Loop "+i);
            for (int j=1;j<=5;j++)
            {
                System.out.println("Inner Loop:"+j);
            }
            System.out.println("End Of outer loop");
        }
    }
}
