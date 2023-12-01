import java.util.Scanner;
public class if_else {

    public static void main(String[] args) {

        System.out.println("mời nhập vào DTB = ");
        int dtb = new Scanner(System.in).nextInt();
        if(dtb >= 5) {
            System.out.println("Đạt");
        } else System.out.println("Chưa đạt");
    }
}
