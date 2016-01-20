import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringFunctionsDemo {	

	public static void countWords(String sentence){
		String[] words = sentence.trim().split(" ");
		System.out.println(words.length);
	}
	
	public static void FirstNonRepeatedCharInWord(String word){
		Map<Character,Integer> charCountMap = new LinkedHashMap<Character,Integer>();
		
		for(int i =0;i< word.length();i++){
			Character c = word.charAt(i);
			if(charCountMap.containsKey(c)){
				charCountMap.put(c,charCountMap.get(c)+1);
			}
			else{
				charCountMap.put(c,1);
			}
		}
		@SuppressWarnings("unused")
		Character nonRepeatedChar = null;
		/*
		 * The below logic we can only use with LinkedHashMap and not HashMap as the order won't be maintained
		 * in HashMap and we wont necessarily get the first non-repeated character.
		 */
		for(Character key : charCountMap.keySet()){
			if(charCountMap.get(key) == 1){
				nonRepeatedChar = key;
				break;
			}
		}
		
		/*
		 * Another way to check is go through each character in the word and check if its count is more than one
		 */
		
		Character nonRepeatedChar1 = null;
		
		for(int i=0;i< word.length();i++){
			Character c = word.charAt(i);
			if(charCountMap.get(c) == 1){
				nonRepeatedChar1 = c;
				break;
			}
		} 
		
		if(nonRepeatedChar1 == null){
			System.out.println("No Non repeated character found!!");
		}
		else{
			System.out.println("First non repeated character in " + word + "=" + nonRepeatedChar1);
		}
	}
	
	public static void CountAlphabetOccurenceInString(String sentence){
		Map<Character,Integer> charCountMap = new LinkedHashMap<Character,Integer>();
		
		for(int i =0;i< sentence.length();i++){
			Character c = sentence.charAt(i);
			if((c >='a' && c <= 'z') || (c >= 'A' && c <= 'Z')){ // Enter into the Map only the alphabets and not the other characters. 
				
				if(charCountMap.containsKey(c)){
					charCountMap.put(c,charCountMap.get(c)+1);
				}
				else{
					charCountMap.put(c,1);
				}
			}
			
		}	
		
		System.out.println("Count of characters:");
		for(Character key : charCountMap.keySet()){
			System.out.print(key +  "= " + charCountMap.get(key) + "  ");
		}		
	}
	
	public static boolean isUniqueCharacterSet(String str){
		//If the length of the string is more than 128 (or 256 in case of extended character set) then obviously the
		// charset in not unique.
		
		if(str.length() > 128) return false;
		
		boolean[] char_set = new boolean[128];
		
		for(int i =0;i< str.length();i++){
			int c = str.charAt(i);
			if(char_set[c]){
				return false;
			}else{
				char_set[c] = true;
			}
		}
		return true;
	}
	
	public static String sortString(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	/*
	 * Character related manipulations.
	 */
	
	public static void charManipulations(){
		//String name = "Nishant";
		int character = 'a';
		int char1 = 'A';
		int diff = 'a' - 'A';
		System.out.println(character);
		System.out.println(char1);
		System.out.println(diff);
		System.out.println(Character.getNumericValue('a'));
	}
	
	public static void stringBuilderDemo(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nish");
		sb.append("ant");
		System.out.println(sb.toString());
	}
	
	
	/*
	 * This function returns true if all the characters in the given string are unique otherwise returns false.
	 * Here we use bitwise left ship operator (<<) and bitwise and operator to derive at the conclusion.
	 */
	public static boolean isUniqueChar(String str){
		int length = str.length();		
		int checker = 0;		
		for(int i=0;i< length ; i++){
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0){
				return false;
			}
			checker |= 1 << val;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String name = "Nishant";
		
		for(int i =0;i< name.length();i++){
			System.out.print(name.charAt(i)+ " ");
		}
		if("Nishant".compareTo("Nishant") == 0)
			System.out.println("\nThe two strings are equal lexicographically");
		
		if("Nishant".compareToIgnoreCase("nishant") == 0)
			System.out.println("Case insensitive comparison");
		
		String sentence = "Hi I am Nishant";
		countWords(sentence);
		
		FirstNonRepeatedCharInWord("nishant");
		FirstNonRepeatedCharInWord("teeter");
		FirstNonRepeatedCharInWord("stress");
		FirstNonRepeatedCharInWord("sttrreess");
		
		CountAlphabetOccurenceInString("hello!! i am nishant");
		
		System.out.println("\nIs Unique: " + isUniqueCharacterSet("nishat"));
		
		System.out.println("String Sorting:  " + sortString("bcghwerust"));
		
		charManipulations();
		stringBuilderDemo();

	}

}
