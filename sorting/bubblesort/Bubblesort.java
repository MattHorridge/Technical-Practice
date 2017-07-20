public class Bubblesort{


	//My implementation of bubble sort for technical practice
	//For simple int array
	//Type of comparison sort

	//Algorithm looks through list comparing each pair of adjacent elements a,b 
	//If a > b then the pair of elements are swapped.


	//Performance:
		//From Wiki: 
		//Best Case: O(n), n is number of array elements
		//Average Case = Worse Case: O(n^2)

	public static void main(String[] args){

		int[] ar = {5,4,3,2,1};

		for (int i : ar){
			System.out.print(i);
		}

		System.out.println();

		bubble(ar);

		System.out.println();

		for (int i : ar){
			System.out.print(i);
		}
	}




	private static void bubble(int[] ar){

		for (int j = 0; j < ar.length; j++){

			//swapcheck = false;

			for(int i = 0; i < ar.length-1; i++){
				//swapcheck = false;

				if(ar[i] > ar[i+1]){
					swap(ar, i, i+1);
					//System.out.println("Swapping " + ar[i] + "with " + ar[i+1]);
					//		for (int p : ar){
					//			System.out.print(p);
					//		}	
					//		System.out.println();		
					//swapcheck = true;
				}
			}
		}
	}


	//swap method for readability
	private static void swap(int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}



}