public class PackageSorter {

    public static String sort(int width, int height, int length, int mass) {
        boolean isBulky = checkBulky(width, height, length);
        boolean isHeavy = mass >= 20;

        if (isBulky && isHeavy) {
            return "REJECTED";
        } else if (isBulky || isHeavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    private static boolean checkBulky(int width, int height, int length) {
        long volume = (long) width * height * length;
        return volume >= 1_000_000 || width >= 150 || height >= 150 || length >= 150;
    }

    // Optional main method to test the function
    public static void main(String[] args) {
        System.out.println(sort(100, 100, 100, 10)); // STANDARD
        System.out.println(sort(160, 40, 40, 10));   // SPECIAL
        System.out.println(sort(50, 50, 50, 25));    // SPECIAL
        System.out.println(sort(200, 200, 200, 30)); // REJECTED
    }
}
