import java.util.Scanner;
import java.util.Stack;

public class maxmin_ham {
    public static int fibo(int n) {
        if(n == 1 || n == 2) return 1;
        else return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        // fibonanci
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = fibo(n);
        System.out.println(res);
    }


}
