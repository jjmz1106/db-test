package db;

public class test {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		int c = b;
		b = a;
		a = c;
		
		System.out.println(a);
		System.out.println(b);
	}

}
