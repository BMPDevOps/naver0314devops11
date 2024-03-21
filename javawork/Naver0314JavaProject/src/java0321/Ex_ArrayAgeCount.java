package java0321;

public class Ex_ArrayAgeCount {
	public static void main(String[] args) {
		int []memberAges= {12,56,23,41,23,45,34,13,26,30,43,6};
		int []ageCount=new int[6];
		
		for(int i =0; i<memberAges.length;i++) {
			if(memberAges[i]>=1&&memberAges[i]<=60) {
				ageCount[(int)(memberAges[i]/10)]++;
			}
		}
		
		for(int i=0;i<ageCount.length;i++) {
			System.out.println(i*10+" ~ "+((i+1)*10)+"세 미만"+"\t"+ageCount[i]);
		}
	}
}
