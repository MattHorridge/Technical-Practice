public class Quicksort3{

	//Quicksort algorithm implementation for practice
	//Quicksort is a divide and conquer algorithm
	//Goal of quicksort is to partition an array at some pivot point
	//Pivot point is placed into its final sorted position in place in the array
	//Recursively call quicksort on subarrays created either side of the pivot point




	//Using Pivot:
	//Divide:
	//Conquer
	//Combine

	//Worst case runtime O(n^2)
	//Average/Expected O(n log n)
	//depends on the implementation of partition algorithm/selection of pivot

	//Many ways to select original array element to use as pivot
	//This implementation based on Introduction to Algorithms by Cormen, selects final element in original array as pivot

	//Simple integer array implementation


	public static void main(String[] args){

		int[] test = {5,4,3,2,1};

		for(int i : test){
			System.out.print(i);
		}

		System.out.println("");

		quickSort(test, 0, test.length-1);


		for(int i : test){
			System.out.print(i);
		}

		System.out.println("");

	}


	//Recursive Quicksort
	public static void quickSort(int[] array, int p, int r){

		if (p < r){
			int q = doPartition(array, p, r);

			quickSort(array, q+1,r);
			quickSort(array, p, q-1);
		}



	}

	//Parition Alogrithm

	public static int doPartition(int[] subarray, int p, int r){

		//
		int counter = p - 1;
		int pivot = subarray[r]; //pick final element in array as pivot;


		//iterate through array
		for(int j = p; j< r; j++){

			if(subarray[j] <= pivot){
				counter++;
				int temp = subarray[counter];
				subarray[counter] = subarray[j];
				subarray[j] = temp;
			}
		}

		int temp2 = subarray[counter+1];
		subarray[counter + 1] = subarray[r];
		subarray[r] = temp2;

		return counter+1;

	}








}