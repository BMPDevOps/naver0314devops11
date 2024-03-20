package java0320;

public class Ex11_ArrayRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []score = {100,90,80,90,70};
		int []rank=new int[5];

		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for(int z = 0; z< score.length;z++) {
				if(score[i] < score[z]) {
					rank[i] += 1;
				} 
			}
			System.out.println("num: "+(i+1)+"\trank: "+rank[i]+"\tsocre: "+score[i]);
		}
	}

}

