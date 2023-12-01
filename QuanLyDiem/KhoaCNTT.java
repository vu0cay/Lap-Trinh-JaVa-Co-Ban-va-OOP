package QuanLyDiem;

public class KhoaCNTT extends NamHoc2023{

    public KhoaCNTT(String ten, String cccd) {
        super(ten, cccd);
    }
    // overide

    @Override
    public void tinhDTB() {
        System.out.println("Đây là pt tính dtv của khoa cntt");
    }
}
