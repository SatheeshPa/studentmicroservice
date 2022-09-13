package student;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Sample2 {
	static void bubbleSort(int df[]) {
		int temp =0;
		for(int i = 0; i< df.length-1;i++) {
			for(int j=0;j<df.length-i-1;j++) {
			
			if(df[j]>df[j+1]) {
				temp = df[j];
				df[j] = df[j+1];
				df[j+1] = temp;
			}
			}
		}
		
		System.out.println(Arrays.toString(df));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] df = {4,6,3,8,1,9};
		bubbleSort(df);
		
		String sdf = "skdfjhsdfku";
		List<String> ll = Arrays.asList(sdf.split(""));
		Collections.reverse(ll);
		System.out.println(ll);
	}

}
