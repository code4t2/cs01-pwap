public class CMYKtoRGB {
    public static void main(String[] args) {
        System.out.println("red   = " + Math.round(255 * (1 - Double.parseDouble(args[3])) * (1 - Double.parseDouble(args[0]))) + "\ngreen = " + Math.round(255 * (1 - Double.parseDouble(args[3])) * (1 - Double.parseDouble(args[1]))) + "\nblue  = " + Math.round(255 * (1 - Double.parseDouble(args[3])) * (1 - Double.parseDouble(args[2]))));
    }
}
