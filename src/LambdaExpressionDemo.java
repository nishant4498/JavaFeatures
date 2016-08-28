import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo {
	//https://dzone.com/articles/why-we-need-lambda-expressions
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(20,15,26,70,105);
		List<String> strList = Arrays.asList("a","z","e","f", "x");
		numList.forEach(e -> System.out.println(e));
		
		strList.sort((e1,e2) -> e1.compareTo(e2));
		System.out.println(strList);
	}

}
