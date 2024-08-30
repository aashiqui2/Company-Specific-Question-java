public class CountGreaterElement {
    public static int CountGreaterElement(int[] a)
    {
        int count=1;
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                count++;
                max=a[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,8,9};
        System.out.println(CountGreaterElement(arr));
        
    }
}
/*Counting Elements Greater Than All Prior Elements
Given an integer array Arr of size N the task is to find the count of elements whose
value is greater than all of its prior elements.
Note : 1st element of the array should be considered in the count of the result.
For example,
Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
Since total of 3 elements is present in the array that meets the condition.
Hence the output = 3.
Example 1:
Input
5 -> Value of N, represents size of Arr7-> Value of Arr[0]
4 -> Value of Arr[1]
8-> Value of Arr[2]
2-> Value of Arr[3]
9-> Value of Arr[4]
Output :
3
Example 2:
5 -> Value of N, represents size of Arr
3 -> Value of Arr[0]
4 -> Value of Arr[1]
5 -> Value of Arr[2]
8 -> Value of Arr[3]
9 -> Value of Arr[4]
Output :
5
Constraints
• 1<=N<=20
• 1<=Arr[i]<=10000
• A parking lot in a mall has RxC number of parking spaces. Each parking
space will either be empty(0) or full(1). The status (0/1) of a parking space is
represented as the element of the matrix. The task is to find index of the
prpeinzta row(R) in the parking lot that has the most of the parking spaces
full(1).
• Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.
• Example 1:
Input :
3 -> Value of R(row)3 -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is
separated by new line.
Output :
3 -> Row 3 has maximum number of 1’s
• Example 2:
input :
4 -> Value of R(row)
3 -> Value of C(column)
[0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
Output :
4 -> Row 4 has maximum number of 1’s
 */
