import java.util.Scanner;

public class TestDemo {

	static int number = 1;

	public static void main(String[] args) {

		debug(1,3);
	}

	public static void debug(int a, int b) {
		System.out.println("1");
		System.out.println("2");
		int sum=sum(a,b);
		System.out.println("aaaaa"+sum);
		System.out.println("4");
		System.out.println("5");
	}

	public static int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}

}
