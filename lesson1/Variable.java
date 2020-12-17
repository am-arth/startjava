public class Variable1 {	
	public static void main(String[] args) {

		String cpuname = "i5-3317";
		System.out.println ("Тип Вашего процессора " + cpuname);

		short cpu = 1;
		System.out.println ("У Вас " + cpu + " процессор");

		double frequence = 1.700;
		System.out.println ("Частота Вашнго процессора " + frequence + " ГГЦ"); 

		int core = 4;
		System.out.println ("У Вашего процессора " + core + " ядер");

		char energy = 'U';
		System.out.println ("Тип энергопотребления Вашего процессора " + energy);

		long capacity = 976759996;
		System.out.println ("Емкость Вашего жесткости диска " + capacity + " MB");

		byte bus = 64;
		System.out.println ("Разрядность шины Ваего процессора " + bus + " бит");

		float ram = 8092;
		System.out.println ("Объем ОЗУ Вашего компьютера " + ram + " Гб");

		boolean pc = true;
		System.out.println ("У Вас ноутбук " + pc);
	}
}