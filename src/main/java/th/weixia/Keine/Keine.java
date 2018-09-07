package th.weixia.Keine;

public class Keine {

    public static int digital_root(int n) {
        // ...
        String nString = String.valueOf(n);

        int length = nString.length();

        if (length == 0)
            return 0;

        int tmp = 0;
        for (int i = 0; i < length; i ++) {
            tmp += Integer.valueOf(nString.charAt(i) + "");
        }

        if (String.valueOf(tmp).length() > 1) {
            return digital_root(tmp);
        }

        return tmp;
    }

    public static void main(String[] args) {

        System.out.println(digital_root(16));


    }

}
