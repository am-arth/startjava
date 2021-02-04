import java.util.Scanner;

public class MyFirstGame {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Игра началась, введите любое число от 0 до 100");
		int gamerNumber = sc.nextInt();
		sc.nextLine();
		int computerNumber = 30;
		while (gamerNumber != computerNumber) {
			if (gamerNumber > computerNumber) {
				System.out.println ("Ваше число больше, загаданного компьютером" + gamerNumber);
				gamerNumber--;
					} else {
						System.out.println ("Ваше число меньше, загаданного компьютером" + gamerNumber);
						gamerNumber++;
					}
			}
		System.out.println("Поздравляю!!! Вы выиграли, Ваше число:" + computerNumber);
	}
}	