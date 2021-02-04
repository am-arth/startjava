import java.util.Scanner;

public class MyFirstGame {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Игра началась, введите любое число от 0 до 100");
		int computerNumber = 30;
		do {
			if (sc.nextInt() > computerNumber) {
				System.out.println("Ваше число больше, загаданного компьютером");
			} else {
				System.out.println("Ваше число меньше, загаданного компьютером");
			}
		} while (sc.nextInt() != computerNumber);
		System.out.println("Поздравляю!!! Вы выиграли");
	}
}	