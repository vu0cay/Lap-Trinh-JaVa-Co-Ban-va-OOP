import java.util.Scanner;

public class chanle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = n%2 == 0 ? "Chẵn" : "Lẽ";
        System.out.println(ans);
    }
}
