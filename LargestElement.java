public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {10,45,78,98,85,968};
        System.out.println(largestElement(arr));
    }
    public static int largestElement(int[] arr){
        int max = arr[0];

        for (int i=1; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
