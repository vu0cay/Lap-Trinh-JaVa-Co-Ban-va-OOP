import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = n%2;
        switch(check){
            case 0:
                System.out.println(n +" la so chan");
                break;
            default:
                    System.out.println(n+" la so le");
                    break;
        }
    }
}
