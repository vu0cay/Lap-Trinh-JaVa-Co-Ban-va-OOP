package QuanLyDiem;

public class KhoaToan extends NamHoc2023{
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void tinhDTB() {
        System.out.println("đây là pt tính dtb của khoa toán");
    }
}
