package QuanLyDiem;

public class NamHoc2023 {
    //thuộc tính
    protected String ten;
    protected String cccd;

    // constructor
    public NamHoc2023(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }
    //phuương thức
    public void tinhDTB(){
        System.out.println("Đây là phương thức tính điểm TB class cha");
    }
}
