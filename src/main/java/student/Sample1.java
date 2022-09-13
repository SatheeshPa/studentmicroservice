package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample1 {
	String str ="gfth";
	
	public Sample1() {
		this.str = "kjsdhfwe";
		
	}
	public Sample1(String str) {
		str = str;
	}
	
	static List<Integer> reverseArray(int a, List<Integer> arr) {
       Collections.rotate(arr, a);
        
        return arr;
    }
	public static void main(String[] args) {
		// Let us create a list of strings
        List<Integer>  mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
   
        System.out.println("Original List : " + mylist);
        Integer ll = 0;
        
        for(int i = 0;i<2;i++) {
        	ll = mylist.remove(mylist.size()-1);
        	//System.out.println(ll);
        	mylist.add(0, ll);
        }
        //System.out.println(mylist);
        
        
        Integer[] lkl;
        String[] str = {"abc","sdf","ere","bff","ghr","thg","fff","abc"};
        
        String[] query = {"abc","sdf","dcv","bv"};
        
        int o = 0;
        int[] ii = new int[query.length];
        for(int g=0;g<query.length;g++) {
        	for(String ss:str) {
        		if(str[g].equals(ss)) {
        			o++;
        		}
        			
        	}
        	ii[g] = o;
        	
        }
        
   
        // Here we are using rotate() method
        // to rotate the element by distance 2
       // Collections.rotate(mylist, 2);
        
		/*
		 * int sf[] = mylist.stream().mapToInt(i -> i).toArray();
		 * 
		 * for(int i = 0; i < 3 ; i++) {
		 * 
		 * for(int j = 0; j<sf.length;j++) { int temp = sf[j]; sf[j] = sf[j+1];
		 * 
		 * } }
		 */
	}

}
