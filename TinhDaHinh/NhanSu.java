package TinhDaHinh;

// neu phuong thuc truu tuong o trong class thi class phai la class truu tuong
public abstract class NhanSu {
    //thuoc tinh
    private String ten;
    private String cccd;
    private String que;
    //Constuctor

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public NhanSu(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public NhanSu() {
    }

    // phuong thuc tinh luon
    public abstract double tinhLuong(int ngayCong);

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getQue() {
        return que;
    }
}
