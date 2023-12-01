public class ep_kieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double d = a/b;
        System.out.println(d);
        d = (double) a/b; // ep tu kieu int >> double
        System.out.println(d);
        // ép kiểu hẹp
        int c = 128;
        // ep kieu lon sang kieu nho hon co the mat du lieu
        byte kq = (byte)c;
        System.out.println(c);
        System.out.println(kq);

        int e = 120;
        // ep kieu lon sang kieu nho hon co the mat du lieu
        byte f = (byte)e;
        System.out.println(e);
        System.out.println(f);
    }
}
