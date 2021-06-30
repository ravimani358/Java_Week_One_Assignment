package i_st_week_Home_Work;

import java.util.*;

public class Finding_missing_element_array {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		//System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			
			//System.out.println(arr[i]);
			
			if (arr[i] == arr.length-1) {
				
				System.out.println("There is no miss array values "+arr.length);
				
			}
			
		}
		

	}

}
