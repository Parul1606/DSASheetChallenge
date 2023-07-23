package DSASheetChallenge.Day1;

import java.util.Arrays;

//find the min n max of the array
class Pair {
	public int min;
	public int max;
}

class Main {
	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		Arrays.sort(arr);
		minmax.min = arr[0];
		minmax.max = arr[n - 1];
		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 4, 78, 45};
		int arr_size = arr.length;
		Pair minmax = getMinMax(arr, arr_size);
		System.out.println("Minimum element is " + minmax.min);
		System.out.println("Maximum element is " + minmax.max);
	}
}
