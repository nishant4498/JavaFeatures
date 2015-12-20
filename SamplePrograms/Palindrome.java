
public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int [] numbers = {101,222,34,467764 ,500};
		String[] words = {"dad","Nishant" , "mom", "madam", "abcba"};
		
		for(int i =0; i< numbers.length ; i++){
			int num = numbers[i];
			checkPalindromeNumber(num);			
		}
		
		for(int i =0; i< words.length ; i++){
			String word = words[i];
			checkPalindromeString(word);			
		}
	}
	
	public static void checkPalindromeNumber(int num){
		if(num == reverseNum(num)){
			System.out.println(num + " is a Palindrome");
		}
		else{
			System.out.println(num + " is not a Palindrome");
		}
	}
	
	public static void checkPalindromeString(String word){		
		if(word.equals(reverseString(word))){
			System.out.println(word + " is a Palindrome");
		}
		else{
			System.out.println(word + " is not a Palindrome");
		}
	}
	
	public static int reverseNum(int num){
		int temp , reverseNum = 0;
		
		while(num > 0){
			temp = num % 10;
			num = num / 10;
			reverseNum = reverseNum * 10 + temp;
		}
		return reverseNum;
	}
	
	public static String reverseString(String word){
		String reverse = "";
		int length = word.length();
		for (int i = length-1;i >=0 ;i--){
			reverse += word.charAt(i);
		}		
		return reverse;
	}

}
