package TestInterFace;

public class KeThua implements ViDuInterface{

    @Override
    public void thongTin(String ten, String cccd) {

    }
    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
    }
}
