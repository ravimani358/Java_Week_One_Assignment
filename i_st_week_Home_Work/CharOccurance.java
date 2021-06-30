package i_st_week_Home_Work;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char c1 = str.charAt(i);
			
			//System.out.println(c1);
			
			char c2 = 'e';
			
			if(c1 == c2) {
				count++;
			}
			
			
		}
		
		System.out.println(count +" times are repeat the String");

		
	}

}
