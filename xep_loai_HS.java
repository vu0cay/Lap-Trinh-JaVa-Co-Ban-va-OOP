import java.util.Scanner;

public class xep_loai_HS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while(check){
            double dtb = sc.nextDouble();
            String traloi = (dtb >= 8) ? "Giỏi": (dtb >=6.5) ? "Khá": (dtb >= 5) ? "Trung Bình": "Yếu";

            System.out.println(traloi);
        }
    }
}
