package java0320;

public class Ex6_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1235,5,125,152,15,5,6,16,61,6163332,22};
		int arrSpace=0;
		for(int i : arr1) {
			arrSpace++;
			System.out.println( arrSpace +" : "+ i );
		}
		
			
		String [] str1 = {
				"Park","Bo","Min"
		};
		
		for(int i = 0; i<str1.length;i++) {
			System.out.printf("%s",str1[i]);
		}
		
		String [] str2;
		
		System.out.println();
		
		str2 = new String[] {
				"B","M","OPS"
		};
		
		for(String i : str2) {
			System.out.printf("%s",i);
		}
		

	}

}
