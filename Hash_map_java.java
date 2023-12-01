import java.util.HashMap;

public class Hash_map_java {
    public static void main(String[] args) {
        // khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map1 = new HashMap<>();

        // 2. them phan tu vao hashmap
        map.put(1,"toi");
        map.put(2,"di");
        map.put(3,"code");
        map.put(4,"dao");

        /*map.remove(2);
        boolean check = map.containsKey(1);
        boolean checkvalue = map.containsValue("code ");
        System.out.println(check +"\n"+checkvalue+"\n"+map);
*/
        for(Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
