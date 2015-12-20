
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =45;
		
		System.out.println("Recursion: ");
		for(int i=0;i< n;i++){
			System.out.print(fib(i)+ " ");
		}
		System.out.println("");
		System.out.println("Iteration: ");
		fibIteration(n);
	}
	
	public static int fib(int n){
		if(n == 0 || n ==1)
			return n;
		return fib(n-1) + fib(n-2);
					
	}
	
	public static void fibIteration(int n){
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " ");
		System.out.print(n2 + " ");
		n= n-2;
		int n3;
		while(n > 0){
			n3 = n1+ n2;
			System.out.print(n3 + " ");
			n1 =  n2;
			n2 = n3;
			n--;
		}
	}

}
