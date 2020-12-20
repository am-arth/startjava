public class ConditionalStatement {	
	public static void main(String[] args) {
				
		int age = 25;
		if (age > 20) {
		System.out.println ("старше 20");
		} 
		
		char gender = 'M';
		if (gender == 'M') {
		System.out.println ("мужчина");
		}
		
		char gender = 'F'
		if (gender != 'M') {
		System.out.println ("женщина");
		}
		
		int height = 175;
		if (height < 180) {
		System.out.println("ниже 1.80");
		} else {
		System.out.println("выше 1.80");
		}
		
		char name = 'M';
		if (name == 'M') {
		System.out.println ("есть такая буква в имени"); 
		} else {
		System.out.println ("нет такой буквы в имени");
		}	
	}
}
