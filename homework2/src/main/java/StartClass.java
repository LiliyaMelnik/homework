public class StartClass {
    public static void main(String[] args) {
        integers();
        floats();
        boolandchar();
    }

    public static void integers() {
        byte a = 3;
        short b = 1000;
        int c = 2000;
        long d = 12345678;

        long m = (a * b) - (c + d) / 2;
        int p = b % a; // 1

        int j = c;
        j++; // 2000
        ++j; //2002

        if ((b > a && d > c) || !(a < b)) {
            // true || !true
            // true
        }

        int q = c << 1; // 4000
        q = c >> 2; // 500
    }

    public static void floats() {
        float f = 1.5F;
        double dc = 2.5;

        double k = f + dc; // 4.0
    }

    public static void boolandchar() {
        char ch = '♥';
        boolean bol = true;

        bol = !bol; //false
    }
}
