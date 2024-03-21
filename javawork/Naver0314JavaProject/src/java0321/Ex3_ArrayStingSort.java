package java0321;

public class Ex3_ArrayStingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"HaSeok","KangHo","ParkBo","KangMin"};
		
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if (arr[i].compareTo(arr[j])<0) {
					String sTemp = arr[i];
					arr[i] = arr[j];
					arr[j] = sTemp;
				}
			}
		}
		
		for (String i : arr) {
			System.out.print("\t"+i);
		}
	}

}
