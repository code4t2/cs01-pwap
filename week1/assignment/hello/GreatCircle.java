public class GreatCircle {

    public static void main(String[] args) {
        final double r = 6371.0;
        double x1 = Math.toRadians(Double.parseDouble(args[0])), y1 = Math.toRadians(Double.parseDouble(args[1])), x2 = Math.toRadians(Double.parseDouble(args[2])), y2 = Math.toRadians(Double.parseDouble(args[3]));
        double val1 = Math.sin((x2 - x1) / 2);
        double val2 = Math.pow(val1, 2);
        double val3 = Math.sin((y2 - y1) / 2);
        double val4 = Math.pow(val3, 2);
        double val5 = Math.cos(x1) * Math.cos(x2) * val4;
        double root = val2 + val5;
        double distance = 2 * r * Math.asin(Math.sqrt(root));
        System.out.println(distance + " kilometers");
    }

}
