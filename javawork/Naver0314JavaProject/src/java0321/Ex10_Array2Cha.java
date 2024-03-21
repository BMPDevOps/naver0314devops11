package java0321;

public class Ex10_Array2Cha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr;

		arr=new int[][] {
			{3,4,5},
			{10,20,30,40},
			{1,5,7,9,11}
		};

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);


		for(int i = 0 ; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
