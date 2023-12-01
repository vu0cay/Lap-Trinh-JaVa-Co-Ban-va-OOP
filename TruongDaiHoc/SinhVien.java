package TruongDaiHoc;

public class SinhVien {
    //thuộc tính (giống với biến)
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diem;
    // Constructor

    public SinhVien() {
        hoTen = "No Name";
        diemToan = 0.0;
        diemVan = 0.0;
    }
    public  SinhVien(String hoTen){
        this.hoTen = hoTen;
    }
    public SinhVien(String hoTen, double diemToan,double diemVan) {
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diem = this.diemToan + this.diemVan;
    }

    //phương thức (các hàm)
    // phương thức không có kiểu trả về

    public  void hienThiThongTin(){
        System.out.println(hoTen+"\t"+diemToan+"\t"+diemVan+"\t"+
                diem);
    }

    // get va set
    public double getDiemToan(){
        return this.diemToan;
    }
    public double getDiemVan(){
        return this.diemVan;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public void setDiemToan(double diemToan){
        this.diemToan = diemToan;
    }
    public  void setDiemVan(double diemVan){
        this.diemVan = diemVan;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    // Overloading method
    public  double tinhDTB(double diemToan,double diemVan){ // Signature co 2 thuoc tinh diem toan va diem van
        return (diemToan+diemVan) /2;
    }
    public  double tinhDTB(double diemToan, double diemVan,double diemAnh){ // khac nhau ve so luong doi so
        return (diemToan+diemVan+diemAnh)/3;
    }
    public  double tinhDTB(double diemToan, double diemVan,String abc){ // khac nhau ve doi so
        return (diemToan+diemVan)/2;
    }
    public  double tinhDTB(String abc, double diemToan, double diemVan){ // khac nhau ve thu tu doi so
        return (diemToan+diemVan)/2;
    }

    // Truong hop dac biet cua OverLoading Method
    // Parametter List

    public double tongDiem(double ...arr){
        double tong = 0.0;
        for(double x: arr){
            tong += x;
        }
        return tong;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diemToan=" + diemToan +
                ", diemVan=" + diemVan +
                ", diemDaiHoc=" + this.diem +
                '}';
    }
    // support method & service method
    // support method
    // kiem tra diem khi nhap ho so Sinh Vien

    private boolean checkDiem(){
        return this.diem >= 16;
    }

    // service method
    public  void checkHopLeDiem(){
        if(checkDiem())
            System.out.println("Hợp lệ nhập tiếp thông tin SV");
        else System.out.println("Không hợp lệ kiểm tra lại điểm SV");
    }

}
