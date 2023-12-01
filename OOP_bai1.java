import TruongDaiHoc.SinhVien;

import java.util.Scanner;

public class OOP_bai1 {
    public static void main(String[] args) {

        int soLuongSV = new Scanner(System.in).nextInt();
        SinhVien[] _sinhVien = new SinhVien[soLuongSV];

        for (int i = 0; i < soLuongSV; i++) {
            String hoten = new Scanner(System.in).nextLine();
            double diemToan = new Scanner(System.in).nextDouble();
            double diemVan = new Scanner(System.in).nextDouble();
            _sinhVien[i] = new SinhVien(hoten,diemToan,diemVan);
        }

        int i = 1;
        for (SinhVien pt: _sinhVien){
            System.out.print(i+"\t\t");
         //   pt.hienThiThongTin();
            System.out.println(pt);
            i++;
        }

        SinhVien sv1 = new SinhVien();

        double tong = sv1.tongDiem(1,2,3,4,5,7,8,9);
        System.out.println(tong);

        /*double ans1 = sv1.tinhDTB(10.0,5.5,6.5);
        double ans2 = sv1.tinhDTB(10.0,5.5);
        System.out.println(ans1 +" "+ans2);*/


       // System.out.println(_sinhVien[0]);

    }
}
