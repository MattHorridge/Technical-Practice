public class Mergesort{


	//Merge Sort Practice
	//Time Complexity - Average -> Worst Case -> Best Case == O(n log n)


	//Divide and Conquer algorithm

					//Divide
	//Conquer
	//Combine


	//Usually recursive

	



	//Split array into two halves, 
	//call algorithm on each half, 
	//merge sorted halves

	//first break array down to n arrays each of size 1

	//ex:	
		//{5,4,3,2}
	//		/\  
	//	{5,4} {3,2}
	//	/ \	   / \
	//{5} {4} {3} {2}
	//  \/		\/
	//{4,5}		{2,3}
	//		\/
	//	{2,3,4,5}


	//merge(array, l, m, r) function:
		//Assume array[l..m] and array[m+1...r] are sorted and merge together



	public static void main(String[] args){

		int[] test = {5,4,3,2,1};


		//System.out.println(test.length/2);
		
		for(int i : test){
			System.out.println(i);
		}


		
			System.out.println("");
		

		mergesort(test,0,3);

		for(int i : test){
			System.out.println(i);
		}

	}







	private static void mergesort(int[] array, int low, int high){

		//base case: an array of size 1 where low == high
		//otherwise array not sorted

		if (high > low)
			{
				int middle = (low+high)/2;
				mergesort(array, low, middle);
				mergesort(array, middle+1, high);

				merge(array, low, high);
			}



	}



	private static void merge(int[] array, int low, int high){

		int[] helperarray = new int[array.length];
		int leftCounter = low;
		int middle = (low+high)/2;
		int rightCounter = middle+1;
		int k = low; //Counter for adding things to helper array


		for(int i = low; i <= high; i++){
			helperarray[i] = array[i];
		}


		while(leftCounter <= middle && rightCounter <= high){

			if(helperarray[leftCounter] <= helperarray[rightCounter]){
				array[k] = helperarray[leftCounter];
				leftCounter++;
			}
			else{
				array[k] = helperarray[rightCounter];
				rightCounter++;
			}
			k++;
		}


		if(leftCounter > middle){
			while(rightCounter <= high){
				array[k] = helperarray[rightCounter];
				k++;
				rightCounter++;
			}
		}
		
		else{
			while(leftCounter <= middle){
				array[k] = helperarray[k];
				k++;
				leftCounter++;
			}
		}



	}



}