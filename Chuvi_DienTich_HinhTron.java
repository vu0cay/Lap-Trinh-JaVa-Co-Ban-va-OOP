import java.util.Scanner;

public class Chuvi_DienTich_HinhTron {
    public static void main(String[] args) {
        double chuVi,dienTich;
        int r = new Scanner(System.in).nextInt();
        chuVi = (2* Math.PI * r);
        dienTich =  Math.PI * Math.pow(r,2);
        System.out.println("Chu vi hinh tron co ban kinh " +r +" = " +chuVi);
        System.out.println("Dien tich hinh tron co ban kinh " +r +" = " +dienTich);

    }
}
