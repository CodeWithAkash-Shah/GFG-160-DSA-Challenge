package day31;

public class PeakElement {
    public int peakElement(int[] arr) {
        // code here
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid==arr.length-1 || arr[mid]>arr[mid+1])){
                return mid;
            }else if(mid>0 && arr[mid-1]>arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
}
}
