package java0321;

public class Ex2_ArraySort {
	public static void main(String[] args) {
		int []arr= {5,8,2,1,10};
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i : arr) {
			System.out.printf("%d\t",i);
		}
	}
}
