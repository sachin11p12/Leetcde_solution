package leetcode;

import java.util.Arrays;

public class _14_longest_common {
    public static void main(String[] args) {
        String arr [] = {"flower","flow","flight"};
        System.out.println(compare(arr));
    }
    public static String compare(String[] arr) {
//        String commonPrefix ="";
//        if (arr.length==0){
//            System.out.println("Empty String");
//        } else if (arr.length==1) {
//            commonPrefix=arr[0];
//            System.out.println("commonPrefix ="+ commonPrefix);
//        }
//        else {
//            String prefix = arr[0];
//            for (int i=0;i< arr.length;i++){
//                for (int j=0; j<prefix.length();j++){
//                if (arr[i].contains(prefix)){
//                    commonPrefix = prefix;
//                    break;
//                }
//                else {
//                    prefix = prefix.substring(0,prefix.length()-1);
//                }
//                }
//                System.out.println(commonPrefix);
//            }
//        }
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
