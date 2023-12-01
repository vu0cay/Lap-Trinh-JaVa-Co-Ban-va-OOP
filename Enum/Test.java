package Enum;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // khoi tao list sv
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();

        SinhVien sv1 = new SinhVien(2203594,"Nguyễn Hoàng Vũ",10.0);
        SinhVien sv2 = new SinhVien(2203596,"Nguyễn Hoàng Khang",5.0);
        SinhVien sv3 = new SinhVien(2203455,"Trần Hoàng Thân",7.5);
        SinhVien sv4 = new SinhVien(2323455,"Trần Văn A",2.7);
        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        ds.add(sv4);
        for(SinhVien sv: ds){
            System.out.println(sv);
        }
    }
}
