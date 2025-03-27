package day04;

public class RotateArrayByDSteps {
    
    static void reverseArray(int start, int end, int arr[]){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArr(int arr[], int d) {
        //-------- Brute force Approach -------  
        
        //--- 1 : Store d elements in temp array
        // int m = 0;
        // int n = arr.length;
        // int temp[] = new int[d];
        // while(m<d){
        //     temp[m]=arr[m];
        //     m++;
        // }
        
        // -- 2 : shift rest elements by d index 
        // for(int i=d;i<n;i++){
        //     arr[i-d]=arr[i];
        // }
        
        // --- 3 : add temp arr elements in the rest places 
        // for(int i=n-d;i<n;i++){
        //     arr[i] = temp[i-(n-d)];
        // }
        
        // Tc :  O(d) + O(n-d) + O(d) = O(n+d)
        // Sc : O(d) 
        
        //----- Optimal Solution 
        
        int n = arr.length;
        d=d%n;
        
        // reverse first d elements 
        reverseArray(0,d-1,arr);
        // reverse rest element
        reverseArray(d,n-1, arr);
        //reverse whole array
        reverseArray(0,n-1, arr);

    }

}