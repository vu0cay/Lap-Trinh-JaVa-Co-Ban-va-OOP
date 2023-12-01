public class mang_trong_java {
    public static void main(String[] args) {
        //1 . khai bao mang
        String[] mangStr;
        int[] mangInt;
        float[] mangFloat;

        //2. khoi tao mang kem kich thuoc
        String[] mangStr2 = new String[100];
        int[] mangInt2 = new int[100];
        float[] mangFloat2 = new float[100];

        //3. khoi tao mang kem gia tri ban dau
        String[] mangStr3 = new String[]{"1","2","3"};
        int[] mangInt3 = new int[]{1,2,3,4,5};
        float[] mangFloat3 = new float[]{1f,2f,3f};

        for(int pt: mangInt3){
            System.out.println(pt);
        }
        for (int i = 0; i < mangInt3.length; i++) {
            System.out.println(mangInt3[i]);
        }
        for (int i = 0; i < mangFloat3.length; i++) {
            System.out.println(mangFloat3[i]);
        }

    }
}
