public class ConditionalStatement {	
	public static void main (String[] args) {
		int age = 25;
		char gender = 'M';
		int height = 175;
		char name = 'M';
		
			if (age > 20) {
				System.out.println ("старше 20");
			} 
		
			if (gender == 'M') {
				System.out.println ("мужчина");
			}
		
			if (gender != 'M') {
				System.out.println ("женщина");
			}
		
			if (height < 180) {
				System.out.println("ниже 1.80");
			}

			else {
				System.out.println("выше 1.80");
			}
		
			if (name == 'M') {
				System.out.println ("есть такая буква в имени"); 
			}
			else {
				System.out.println ("нет такой буквы в имени");
		}	
	}
}
