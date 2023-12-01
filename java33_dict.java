import java.util.HashMap;
import java.util.Scanner;

public class java33_dict {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("user1","123456234");
        dict.put("user2","123454216");
        dict.put("user3","123412");
        dict.put("user4","12341231256");
        dict.put("user5","1234564");
        dict.put("user6","12345126");
        dict.put("user7","12345699");
        dict.put("user8","12341156");

        while(true){
            System.out.print("Nhập username: ");
            String userName = new Scanner(System.in).nextLine();
            System.out.print("Nhập password: ");
            String passWord = new Scanner(System.in).nextLine();

            boolean checkUsername = dict.containsKey(userName);

            if(checkUsername == false) System.out.println("tên đăng nhập không tồn tại!");
            else {
                /*int checkPass = passWord.compareTo(dict.get(userName));
                if(checkPass == 0) System.out.println("đăng nhập thành công");
                else System.out.println("mật khẩu không đúng");*/
                if(dict.get(userName).equals(passWord)) System.out.println("đăng nhập thành công");
                else System.out.println("mật khẩu không đúng");
            }

        }
    }
}
