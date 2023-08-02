public class Main {

    public static int count1sInSortedBinaryArray(int arra[]){
        int start = 0, mid = 0;
        int end = arra.length-1;
        while (start<=end){
            mid = start + (end-start)/2;
            if(arra[mid]==1){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] binaryArray = new int[]{1,1,1,1,1,1,1};
        int countedOne = count1sInSortedBinaryArray(binaryArray);
        System.out.println(countedOne);
    }
}