package QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        // khoi tao cac doi tuong
        KhoaToan toan1 = new KhoaToan("Vũ","12345");
        toan1.tinhDTB();
        // Khoa van
        KhoaVan van1 = new KhoaVan("Khang","212345");
        van1.tinhDTB();
        // Khoa cntt
        KhoaCNTT cntt1 = new KhoaCNTT("Thân","2112345");
        cntt1.tinhDTB();
    }
}
