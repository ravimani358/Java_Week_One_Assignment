package i_st_week_Home_Work;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String str = "changeme";
		
		int b = 0;
				
		for(int i=0; i<str.length(); i++) {
			
				b = b +1;
						
				if((b%2) != 0){
								
				char letter = str.charAt(i);
				
				String convert = Character.toString(letter);
				
				System.out.println(convert.toUpperCase());
				
				
			}
		}
		
	}

}
