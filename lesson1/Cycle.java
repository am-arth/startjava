public class Cycle {	
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
		System.out.print(i + " ");
        }
 		System.out.println(" ");
 		//строка чтобы отделить блоки вывода данных
 		int i = 8;
        while (i > -6) {
            i-=2;
            System.out.print(i + " ");
        }
		System.out.println(" ");
 		//строка чтобы отделить блоки вывода данных
		int j = 0;
		int k = 9;
        do {
        	k=k+2;
        	j=j+k;    
			} while(k < 19);
		System.out.print(j + " ");
	}
}