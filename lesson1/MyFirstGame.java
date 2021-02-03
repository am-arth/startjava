import java.util.Scanner;

public class MyFirstGame{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Игра началась, введите любое число от 0 до 100");
		int GamerNumber = sc.nextInt();
		sc.nextLine();
		int ComputerNamber = 30;
		System.out.println(GamerNumber);
		if (GamerNumber > ComputerNamber) {
			System.out.println("Ваше число больше, загаданного компьютером");
			} else if (GamerNumber < ComputerNamber) {
				System.out.println("Ваше число меньше, загаданного компьютером");
			} else if (GamerNumber == ComputerNamber) {
				System.out.println("Поздравляю!!! Вы выиграли, Ваше число:" + ComputerNamber);
			}
	}
}	