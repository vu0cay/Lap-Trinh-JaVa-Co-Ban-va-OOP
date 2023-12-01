import java.util.Scanner;

public class Scanner_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập vào mật khẩu cấp 1: ");
        String mk1 = new Scanner(System.in).nextLine();
        System.out.println("mật khẩu cấp 1 = " +mk1);

        System.out.println("Mời nhập vào 1 số nguyên: ");
        int soNguyen = new Scanner(System.in).nextInt();
        System.out.println("Số nguyên là = " +soNguyen);


        System.out.println("Mời nhập vào mật khẩu cấp 2: ");
        String mk2 = new Scanner(System.in).nextLine();
        System.out.println("mật khẩu cấp 2 = " +mk2);



        boolean check = sc.nextBoolean();
        System.out.println(check);
        float flo = sc.nextFloat();
        System.out.println(flo);

    }
}
