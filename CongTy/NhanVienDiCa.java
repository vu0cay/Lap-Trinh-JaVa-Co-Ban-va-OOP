package CongTy;

public class NhanVienDiCa extends NhanVien{
    // Khai bao thuoc tinh ca
    // ca 1: lam ngay
    // ca 2: lam dem
    protected int ca;
    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }
    public NhanVienDiCa(String ten, String que, int cccd,int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
        return luongCoban*1.05;
    }
}
