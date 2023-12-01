public class string_java {
    public static void main(String[] args) {
        String s = "whether they like or not" +
                "\nI wanna show you off";
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s);
        //sb.append(s);
        sb.append("\nI wanna tie the knot");
        System.out.println(sb);
        //Insert "don't"
        System.out.println(sb);
        sb.insert(47," don't");
        System.out.println(sb);
        // Delete "don't"
        sb.delete(47,53);
        System.out.println(sb);

        String mang = "ewef#R%#@fw324";
        char[] newString = mang.toCharArray();
        for (int i = 0; i < newString.length; i++) {
            System.out.println(newString[i]+" ");
        }

    }
}
