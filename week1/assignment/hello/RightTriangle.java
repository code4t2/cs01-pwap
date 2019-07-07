public class RightTriangle {
    public static void main(String[] args) {
        long a = Long.parseLong(args[0]), b = Long.parseLong(args[1]), c = Long.parseLong(args[2]);
        long max = Math.max(a, Math.max(b, c)), min = Math.min(a, Math.min(b, c)), mid = (a + b + c) - (min + max);
        long maxs = max * max, mins = min * min, mids = mid * mid;
        boolean sensibleNumber = (a > 0) && (b > 0) && (c > 0) && (maxs > 0) && (mins > 0) && (mids > 0) && ((mins + mids) > 0);
        boolean result = sensibleNumber && (maxs == mins + mids);
        System.out.println(result);
    }
}
