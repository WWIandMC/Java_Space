import java.util.Arrays;

public class Main {
    public static boolean isNumber(String str) {   //判断是否全为数字
        for (int i = 0; i < str.length(); i++) {
            if ('0' > str.charAt(i) || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean haveUpper(String str) {  //判断是否含有大写字母
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                return true;
            }
        }
        return false;
    }

    public static boolean isAlpha(String str) {    //判断是否全为字母
        for (int i = 0; i < str.length(); i++) {
            if (!('A' <= str.charAt(i) && str.charAt(i) <= 'Z') && !('a' <= str.charAt(i) && str.charAt(i) <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "acbdw,12695,47AasIDX";
        String[] string_arr = str1.split(",");
        for (int i = 0; i < string_arr.length; i++) {
            if (isNumber(string_arr[i])) {
                System.out.println(string_arr[i] + " is Number");
            } else if (haveUpper(string_arr[i])) {
                System.out.println(string_arr[i] + " have Upper");
            }
            string_arr[i] = string_arr[i].toUpperCase();    //将所有的小写字母转换为大写字母
            if (isAlpha(string_arr[i])) {
                char[] ch_arr = string_arr[i].toCharArray();    //将字母装入字符数组
                Arrays.sort(ch_arr);    //排序
                System.out.println(ch_arr); //打印
            }
        }
    }
}
