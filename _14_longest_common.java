package leetcode;

import java.util.Arrays;

public class _14_longest_common {
    public static void main(String[] args) {
        String arr [] = {"flower","flow","flight"};
        System.out.println(compare(arr));
    }
    public static String compare(String[] arr) {
// Start from here 
        int n = arr.length;
        Arrays.sort(arr);
        int i =0;
        String start = arr[0];
        String end = arr[arr.length-1];
        while (i<start.length()){
            if (start.charAt(i)==end.charAt(i))
                i++;
            else
                break;
        }
            return start.substring(0,i);
    }
}
