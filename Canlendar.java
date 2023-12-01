import java.util.Calendar;

public class Canlendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DATE);

        System.out.println("ngay "+ngay+" thang "+(thang+1)+" nam "+nam);
    }
}
