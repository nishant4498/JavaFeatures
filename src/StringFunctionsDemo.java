import java.util.LinkedHashMap;
import java.util.Map;

public class StringFunctionsDemo {	

	public static void countWords(String sentence){
		String[] words = sentence.trim().split(" ");
		System.out.println(words.length);
	}
	
	public static void FirstRepeatedCharInWord(String word){
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
		@SuppressWarnings("unused")
		Character nonRepeatedChar = null;
		
		System.out.println("Count of characters:");
		for(Character key : charCountMap.keySet()){
			System.out.print(key +  "= " + charCountMap.get(key) + "  ");
		}		
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
		
		FirstRepeatedCharInWord("nishant");
		FirstRepeatedCharInWord("teeter");
		FirstRepeatedCharInWord("stress");
		FirstRepeatedCharInWord("sttrreess");
		
		CountAlphabetOccurenceInString("hello!! i am nishant");

	}

}
