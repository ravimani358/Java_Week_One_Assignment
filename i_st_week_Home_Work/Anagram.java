package i_st_week_Home_Work;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		
		String text2 = "potss"; 
		
		if(text1.length() == text2.length()) {
			
			//System.out.println("same length");
			
			for(int i = 0; i<text1.length(); i++) {
				
				char c1 = text1.charAt(i);
				
				//System.out.println(c1);
				
				for(int j = 1; j<text2.length(); j++) {
					
					char c2 = text1.charAt(j);
					
					//System.out.println(c2);
					
					if(c1 == c2) {
						System.out.println(c1);
					}
					
				}
				
			}
			
		}
		
		else{
			System.out.println("Kindly check the two array length are different");
		}

		
	}

}
