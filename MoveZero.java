public class MoveZero {
    public static void main(String[] args) {
        int arr[]={3,5,0,0,4};
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }     
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
/*
Given an array arr[] of n positive integers. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in-place.

Input: n = 5, arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements preserve their order while the 0 elements are moved to the right.

Input: n = 4, arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero element and it gets moved to the left.
 */
