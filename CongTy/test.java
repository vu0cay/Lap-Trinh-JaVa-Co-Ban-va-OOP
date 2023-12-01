package CongTy;

public class test {
    public static void main(String[] args) {

        // tao doi tuong la nhan vien hanh chinh
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hành chính 1","Bắc Ninh",123412);
        double luonghc1 = hc1.tinhLuong();

        NhanVienDiCa dc1 = new NhanVienDiCa("Đi ca 1","Bắc Ninh",23123412);
        double luongdc1 = dc1.tinhLuong();
        NhanVienDiCa dc2 = new NhanVienDiCa("Di ca 2","Cao Bang",123412,1);
        int ca = dc2.ca;
        System.out.println(luonghc1+" "+luongdc1+" "+ca);


    }
}
