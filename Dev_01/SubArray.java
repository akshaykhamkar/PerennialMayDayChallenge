/*
	javac SubArray.java
	java SubArray
*/
import java.lang.*;
import java.util.Scanner;

class SubArray 
{ 
    int subArraySum(int arr[], int n, int sum)  
    { 
        int curr_sum, i, j; 
  
        for (i = 0; i < n; i++)  
        { 
            curr_sum = arr[i]; 
  
            for (j = i + 1; j <= n; j++)  
            { 
                if (curr_sum == sum)  
                { 
                    int p = j - 1; 
                    System.out.println("Sum found between position " + i+1 
                            + " and " + p+1); 
                    return 1; 
                } 
                if (curr_sum > sum || j == n) 
                    break; 
                curr_sum = curr_sum + arr[j]; 
            } 
        } 
  
        System.out.println("No subarray found"); 
        return 0; 
    } 
    
    int getMaxValues(int power) {
    	int total = 1;
	while(power > 1) {
		total = total * 10;
		power--;	
	}
	return total;
    }
  
    public static void main(String[] args)  
    { 
        SubArray arraysum = new SubArray(); 
        int maxSizeOfArray = arraysum.getMaxValues(7);
	int arr[];
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Size of Array:");
	int sizeofArray = in.nextInt();
	arr = new int[sizeofArray];
	System.out.println("Enter Array:");
	for(int index = 0; index < sizeofArray; index++) {
		arr[index] = in.nextInt();
	}
	System.out.println("Enter Sum:");
        int sum = in.nextInt();
        arraysum.subArraySum(arr, sizeofArray, sum); 
    } 
}  

