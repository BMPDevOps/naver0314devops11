package java0320;

public class Ex7_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {
				22,13,2,1,13,123412,341234,2343,2425,15235,234,-123,-1231,-3939
		};
		
		int max,min;
		max=min=arr1[1];
		
		for(int i=0; i<arr1.length;i++) {
			if(max<=arr1[i]) {
				max = arr1[i];
			}
			if(min>=arr1[i]) {
				min = arr1[i];
			}
		} 
		System.out.println(max +"\n"+min);
		
		int pcnt=0,mcnt=0;
		
		for(int i : arr1) {
			if(i>0) {
				pcnt++;
			}else if(i<0) {
				mcnt++;
			}
		}
		System.out.println(pcnt+"\t"+mcnt);
	}

}
