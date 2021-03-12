public class ConditionalStatement {	
	public static void main(String[] args) {
		int age = 25;
		if (age > 20) {
			System.out.println("старше 20");
		} 
		
		char gender = 'M';
		if (gender == 'M') {
			System.out.println("мужчина");
		}
				
		if (gender != 'M') {
			System.out.println("женщина");
		}
		
		int height = 175;
		if (height < 180) {
			System.out.println("ниже 1.80");
		} else {
			System.out.println("выше 1.80");
		}
		
		char firstNameLetter = "Maxim".charAt(0);
		if (firstNameLetter == 'M') {
			System.out.println("Первая буква в имени M"); 
		} else {
			System.out.println("Первая буква в имени не M");
		}	
	}
}
