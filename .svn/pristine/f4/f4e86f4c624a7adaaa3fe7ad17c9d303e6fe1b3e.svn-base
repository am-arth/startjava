import java.util.Scanner;

public class Calculator {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 1-ое число:");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Введите действие: +, -, *, /, ^, % ");
		char sign = sc.nextLine().charAt(0);
		System.out.println("Введите 2-ое число:");
		int b = sc.nextInt();
		sc.close();

		int result = 0;
		if (sign == '^') {
			result = 1;
			for (int i = 0; i <= b - 1; i++) {
				result *= a;
			}
		} else if (sign == '%') {	
			result = a % b;
		} else if (sign == '+') {
			result = a + b;
		} else if (sign == '-') {
			result = a - b;
		} else if (sign == '*') {
			result = a * b;
		} else if (sign == '/') {
			if (b <= 0) {
				System.out.println("Делить на 0 или отрицательное число нельзя");	
			} else {
				result = a / b;
			}
		}	
		System.out.println("Получен результат:" + result);
	}
}
