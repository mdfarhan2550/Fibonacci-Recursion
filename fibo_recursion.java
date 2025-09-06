 import java.util.*;
public class Main {
public static void printFibo(int n, int a, int b) {
			if(n == 0) { 
				return;
			}
			System.out.print(a+b+" ");
			int temp = a;
			a = b;
			b += temp;
			printFibo(n-1,a,b);
	}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a = 0;
			int b = 1;
			
			System.out.print(a+" "+b+" ");
			printFibo(n-2,a,b);
	}
}