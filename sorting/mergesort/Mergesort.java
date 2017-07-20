public class mergesort{


	//merge sort take 3;


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



	public static void main(String[] args){

		int[] test = {100,5,2003,4,16,1, 209};

		for (int i : test){
			System.out.println(i);
		}

		mergeSort(test);


		for (int i : test){
			System.out.println(i);
		}

	}



	public static void merge(int[] array, int[] left, int[] right){


		int leftsize = left.length;
		int rightsize = right.length;

	//	System.out.println(leftsize);
	//	System.out.println(rightsize);
		int leftCounter = 0, rightCounter = 0, k = 0;

		while(leftCounter < leftsize && rightCounter < rightsize){

			if(left[leftCounter] <= right[rightCounter]){
				array[k] = left[leftCounter];
				leftCounter++;
				k++;
			}
			else
			{
				array[k] = right[rightCounter];
				rightCounter++;
				k++;
			}
		}

		while(leftCounter < leftsize){
			array[k] = left[leftCounter];
			leftCounter++;
			k++;
		}


		while(rightCounter < rightsize){
			array[k] = right[rightCounter];
			rightCounter++;
			k++;
		}

		


	}


	public static void mergeSort(int[] array){


		if (array.length < 2)
			return;

		int[] left, right;

		int middle = (array.length)/2;

		//make left and right arrays
		left = new int[middle];
		right = new int[array.length - middle];

		

		//fill left and right arrays with elements from orignal
		for(int i = 0; i < middle; i++){
				left[i] = array[i];
				//System.out.println(left[i]);
		}

		for(int j = middle; j < array.length; j++){
			right[j-middle] = array[j];	
			//System.out.println(right[j-middle]);
		}


		mergeSort(left);
		mergeSort(right);
		merge(array, left, right);


	}




}