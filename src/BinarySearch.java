import java.util.Arrays;

//source: https://www.geeksforgeeks.org/binary-search-in-java/
public class BinarySearch {

    int left;
    int right;
    int targetNum;
    int[] arr;

    public BinarySearch(int left, int right, int targetNum, int[] arr){
        this.left = left;
        this.right = right;
        this.targetNum = targetNum;
        Arrays.sort(arr);
        this.arr = arr;
    }

    public int perform(int left, int right, int targetNum, int[] arr){
        if(right >= left){
            int mid = left + (right - left) / 2;

            //returns if the element is at the middle of the array
            if(arr[mid] == targetNum){
                return mid;
            }

            if(arr[mid]>targetNum){
                return perform(left, mid-1, targetNum, arr);
            }

            else{
                return perform(mid+1, right, targetNum, arr);
            }
        }
        //return -1 if element not found in array
        return -1;
    }
}
