package student;

public class BubbleSort1 {

	public static void main(String[] args) {
		int[] a = {3,9,4,1,8,5,6,2};
		
		for(int i = 0 ;i <a.length; i++) {
			for(int j = i ; j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int k = a[j];
					a[j] = a[j+1];
					a[j+1] = k;
				}
			}
		}
		System.out.println(String.valueOf(a));

	}

}
