package CongTy;

public class NhanVienHanhChinh extends NhanVien {

    // dung super de goi constructor tu lop cha
    public NhanVienHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    public double tinhLuong(){
        return luongCoban;
    }

}
