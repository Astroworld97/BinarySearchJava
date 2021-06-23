//source: https://www.geeksforgeeks.org/binary-search-in-java/
public class Main {

    public static void main(String[] args) {
        int[] A = {7, 9 ,10, 100, 32};
        int target = 33;
        BinarySearch bs = new BinarySearch(0, A.length, target, A);
        int answer = bs.perform(0, A.length, target, A); //returns index of element in array, or -1 if not found
        if (answer == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index " + answer);
        }
    }
}
