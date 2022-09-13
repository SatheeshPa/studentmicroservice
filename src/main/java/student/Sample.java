package student;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        Integer l = 0;
        for(int i = 0;i<d;i++){
            l = arr.remove(0);
            arr.add(arr.size(), l);
           
            
        }
       
       
    
    return arr;
    }

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		rotateLeft(4, list);
		
		for(Integer i: list) {
			System.out.print(i+" ");
		}
		
		
	}

}
