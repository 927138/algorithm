package algo;

public class sort_counting {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,1,2,3,2};
		int count[] = new int [6];
		int temp;
		
		
		for(int i=0;i<count.length;i++) {
			count[i] = 0;
		}
		for(int i=0;i<array.length;i++) {
			count[array[i]-1]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0) {
				for(int j=0;j<count[j];j++) {
					System.out.print(i+1+", ");
				}
			}
		}
	}
  
}
