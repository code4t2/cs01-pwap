public class RightTriangle {
    public static void main(String[] args) {
        // Get the numbers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean result = (a*a == b*b+c*c) || (b*b == c*c+a*a) || (c*c == a*a+b*b);
        System.out.println(result);
    }
}
