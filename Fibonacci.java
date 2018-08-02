package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int temp;
		System.out.println(a);
		System.out.println(b);
		for(int i = 0;i<11;i++) {
			temp = b;
			System.out.println(b=b+a);
			a=temp;
		}	
	}

}

