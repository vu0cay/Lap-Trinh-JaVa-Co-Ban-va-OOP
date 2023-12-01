package OopSapXepClass;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // khoi tao list
        ArrayList<SanPham> ds = new ArrayList<>();
        // khoi tao cac doi tuong san pham
        SanPham sp1 = new SanPham(1,"Az",1050);
        SanPham sp2 = new SanPham(2,"ah",500);
        SanPham sp3 = new SanPham(3,"ae",800);

        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);

        // xem ds san pham
        for(SanPham sp: ds){
            System.out.println(sp);
        }

        // goi phuong thuc sap xep
        Collections.sort(ds);
        System.out.println("ds sau sap xep la");
        for(SanPham sp: ds){
            System.out.println(sp);
        }
    }
}
