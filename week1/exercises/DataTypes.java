public class DataTypes {
    public static void main(String[] args) {
        // An example of integer overflow
        System.out.println(Math.abs(-2147483648));
        
        // Quotient and remainders in Java
        // The quotient a / b rounds toward 0 ;
        // The remainder a % b is defined such that (a / b) * b + a % b is always equal to a
        System.out.println(-14 / 3);
        System.out.println(14 / -3);
        System.out.println(-14 % 3);
        System.out.println(14 % -3);
        
        // doubles
        System.out.println(10.0000000000000);
        System.out.println(-0.0 / 3.0);
        System.out.println(0.0 / -3);
        System.out.println(1.0 / 0.0);
        System.out.println(Math.sqrt( -2.0 ));
        System.out.println(Math.round(6.022e23));
    }
}
