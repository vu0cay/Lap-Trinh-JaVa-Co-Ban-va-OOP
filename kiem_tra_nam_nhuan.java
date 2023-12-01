import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nam = sc.nextInt();
        if( (nam%4 == 0 && nam % 100 != 0)
                || (nam % 400 == 0))
            System.out.println(nam + " la nam nhuan");
        else System.out.println(nam+" khong la nam nhuan");
    }
}
