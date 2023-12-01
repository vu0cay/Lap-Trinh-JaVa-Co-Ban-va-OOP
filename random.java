import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        while(true){
            int ngaunhien = rand.nextInt(-100,100);
            System.out.println(ngaunhien);
            double ngaunhiensothuc = rand.nextDouble(-100,100);
            System.out.println(ngaunhiensothuc);
            if(ngaunhien == 1) break;
        }

    }
}
