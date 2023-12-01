import java.util.Scanner;

public class tim_x_y {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tong x + y = ");
        int tong = sc.nextInt();
        System.out.println("nhap hieu x - y = ");
        int hieu = sc.nextInt();

        double x = (double)(tong+hieu)/2;
        double y = x - hieu;

        System.out.println(x +", "+y);


    }
}
