public class CMYKtoRGB {

    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]), m = Double.parseDouble(args[1]), y = Double.parseDouble(args[2]), k = Double.parseDouble(args[3]);
        double white = 1 - k;
        long r = Math.round(255 * white * (1 - c)), g = Math.round(255 * white * (1 - m)), b = Math.round(255 * white * (1 - y));
        System.out.println("red   = " + r);
        System.out.println("green = " + g);
        System.out.println("blue  = " + b);
    }

}
