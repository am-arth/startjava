import java.util.Scanner;
public class Calculator {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.println("Введите 1-ое число:");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Введите действие: +, -, *, /, ^, % ");
		String phrase1 = sc.nextLine();
		System.out.println("Введите 2-ое число:");
		int b = sc.nextInt();
		sc.close();
		char toDo = phrase1.charAt(0);
		
		int i = 0;
		int j = 1;
		b = b - 1;
		if (toDo == '^') {
				while (i <= b) {
					i ++;
					j = j * a;
				}
				result = j;
		}	
		if (toDo == '%') {
			a = a / 100;	
			result = a * b;
		}	
		if (toDo == '+') {
			result = a + b;
		}
		if (toDo == '-') {
			result = a - b;
		}
		if (toDo == '*') {
			result = a * b;
		}
		if (toDo == '/') {
			if (b <= 0) {
				result = -1;
			} else {
				result = a / b;
				}
		}	
		if (result == -1 ) {
			System.out.println("Делить на 0 или отрицательное число нельзя");	
		} else {
			System.out.println("Получен результат:" + result);
			}
	}
}
	
