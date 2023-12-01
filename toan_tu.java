public class toan_tu {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int c = a++ - ++b + 1;
        // uu tien tinh toan
        // step 1: uu tien phep prefix trc;
        // step 2: cac phep toan con lai
        // step 3: gan gia tri cho bien ben trai dau bang
        // step 4: tinh postfix


        // step 1: ++b // thuc hien prefix trc
        // b = 3;
        // step 2 a = 1, b = 3 => 1-3+1
        // step 3 c = -1
        // step 4: a++ => a = 2
        System.out.println(a + "\n" + b + "\n"+ c + "\n");
    }
}
