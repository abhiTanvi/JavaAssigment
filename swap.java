public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        System.out.println("before swap:");
        System.out.println("a = " + a+ ", b = " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}

    
