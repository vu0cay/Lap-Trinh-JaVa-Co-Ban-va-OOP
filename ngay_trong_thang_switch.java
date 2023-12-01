import java.util.Scanner;

public class ngay_trong_thang_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang = sc.nextInt();

        switch(thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(thang+" co 31 ngay");
                break;
            case 2:
                System.out.println(thang + " co 28 ngay  va 29 ngay trong nam nhuan");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(thang +" co 30 ngay");
                break;
            default:
                System.out.println("ko co thang do trong nam");
                break;

        }
    }
}
