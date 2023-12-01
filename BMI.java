import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu cao= ");
        double chieuCao = sc.nextDouble();
        System.out.println("nhap vao can nang= ");
        int canNang = sc.nextInt();

        double BMI = (double)canNang/(Math.pow(chieuCao,2));

        if(BMI < 15) System.out.println("BMI của bạn hiện tại" +BMI+"thân hình quá gầy");
        else if(BMI >= 15 && BMI < 16) System.out.println("BMI của bạn hiện tại" +BMI+"thân hình gầy");
        else if(BMI >= 16 && BMI < 18.5) System.out.println("BMI của bạn hiện tại" +BMI+"thân hình hơi gầy");
        else if(BMI >= 18.5 && BMI < 25) System.out.println("BMI của bạn hiện tại" +BMI+"thân hình bình thường");
        else if(BMI >= 25 && BMI < 30) System.out.println("BMI của bạn hiện tại" +BMI+"thân hình hơi béo");
        else if(BMI >= 30 && BMI < 35) System.out.println("BMI của bạn hiện tại" +BMI+"thân hình béo");
        else if(BMI >= 35 ) System.out.println("BMI của bạn hiện tại" +BMI+"thân hình quá béo");

    }
}
