package TinhDaHinh;

public class Test {
    public static void main(String[] args) {

        // xuat luong pho phong
        NhanSu pp1 = new PhoPhong("Danh","21234123","An Giang");
        System.out.println(pp1.getTen()+" "+pp1.getCccd()+" "+pp1.getQue());
        System.out.println(pp1.tinhLuong(21));

        // len cap truong phong
        pp1 = new TruongPhong(pp1.getTen(),pp1.getCccd(),pp1.getQue());
        System.out.println(pp1.getTen()+" "+pp1.getCccd()+" "+pp1.getQue());
        System.out.println(pp1.tinhLuong(21));
    }
}
