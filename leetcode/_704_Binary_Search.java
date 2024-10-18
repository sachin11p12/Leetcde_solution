package leetcode;

public class _704_Binary_Search {
    public static void main(String[] args) {
        int arr[] = {10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 140;
        int index =-1;
        int low=0, high = n-1;
        boolean flag = false;  //means not present
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid] == target){
                flag = true;
                index = mid;

                break;
            } else if (arr[mid] < target) low = mid+1;
            else if (arr[mid] > target) high = mid-1;
        }
        if (flag == true) System.out.println(" Target present !" + index);
        else System.out.println("target not found !");

    }
}
