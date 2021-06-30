package i_st_week_Home_Work;

public class Palindrome {

	public static void main(String[] args) {
		
		String str1 = "madam";
		
		String str2 = "";
		
		for(int i=str1.length()-1; i>=0; --i) {
			
			char c = str1.charAt(i);
						
			str2 = str2+c;
			
		}
				
			System.out.println(str1.equals(str2));
				

		
	}

}
