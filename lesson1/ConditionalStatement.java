public class ConditionalStatement {	
    public static void main (String[] args) {
    int age = 25;
	char Gender = 'M';
    int Height = 175;
	char Name = 'M';
	
	System.out.println ("тест");
	
	if (age > 20) {
	System.out.println ("старше 20");
} 
	if (Gender == 'M') {
	System.out.println ("мужчина");
}
	if (Gender != 'M') {
	System.out.println ("женщина");
}
	if (Height < 180) {
	System.out.println("ниже 1.80");
} else {
	System.out.println("выше 1.80");
}
	if (Name == 'M') {
	System.out.println ("есть такая буква в имени"); 
} else {
	System.out.println ("нет такой буквы в имени");
}
	
	
	}
}
