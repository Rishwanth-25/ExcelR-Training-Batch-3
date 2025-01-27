public class Demo045 {
     public static void swap(int a, int b) {
        a = a + b; 
        b = a - b; 
        a = a - b; 
         System.out.println("Inside swap method:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        swap(a, b);

        System.out.println("After swapping (in main method):");
        System.out.println("a = " + a);
        System.out.println("b = " + b); 
    }
}
