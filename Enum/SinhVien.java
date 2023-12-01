package Enum;

public class SinhVien {
    //thuoc tinh
    private int ma;
    private String ten;
    private double dtb;
    private XepLoai loai;

    // constructor
    public SinhVien(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        loai = getLoai();
    }
    // get,set

    //phuong thuc
    //1. Phan loai hoc sinh
    public XepLoai getLoai(){
        return (this.dtb >= 8.5) ? XepLoai.gioi : (this.dtb >= 6.5) ? XepLoai.kha :
                (this.dtb >= 5) ? XepLoai.tb : (this.dtb >= 3) ? XepLoai.yeu : XepLoai.duoihoc;
    }
    // toString


    @Override
    public String toString() {
        return ma +" "+ten+" "+dtb+" "+loai.des();
    }
}
