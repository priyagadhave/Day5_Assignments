package funcationalprogramm;

public class SumofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {0, -1, 2, -3, 1}; 
		    int n =arr.length; 
		    findTriplets(arr, n); 
		}
		
		// Prints all triplets in arr[] with 0 sum 
		public static void findTriplets(int[] arr, int n) 
			{ 
			    boolean found = true; 
			    for (int i=0; i<n-2; i++) 
			    { 
			        for (int j=i+1; j<n-1; j++) 
			        { 
			            for (int k=j+1; k<n; k++) 
			            { 
			                if (arr[i]+arr[j]+arr[k] == 0) 
			                { 
			                    System.out.print(arr[i]); 
			                    System.out.print(" "); 
			                    System.out.print(arr[j]); 
			                    System.out.print(" "); 
			                    System.out.print(arr[k]); 
			                    System.out.print(" "); 
			                    found = true; 
			                } 
			            } 
			        } 
			    } 
			  
			    // If no triplet with 0 sum found in array 
			    if (found == false) 
			        System.out.println(" not exist "); 
			  
			} 
			  
			
		

	

}
