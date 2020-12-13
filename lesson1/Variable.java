public class Variable {	
    public static void main(String[] args) {
       int cpu = 1;
       int core = 4;
       double frequence = 1.700;
       String CpuName = "i5-3317";
       char energy = 'U';
	   long capacity = 976759996;
	   byte bus = 64;
	   boolean pc = true;
       float ram = 8092;
	   
	   System.out.println ("Тип Вашего процессора " + CpuName);
       System.out.println ("У Вас " + cpu + " процессор");
       System.out.println ("Частота Вашнго процессора " + frequence + " ГГЦ"); 
       System.out.println ("У Вашего процессора " + core + " ядер");
	   System.out.println ("Тип энергопотребления Вашего процессора " + energy);
	   System.out.println ("Емкость Вашего жесткости диска " + capacity + " MB");
	   System.out.println ("Разрядность шины Ваего процессора " + bus + " бит");
	   System.out.println ("Объем ОЗУ Вашего компьютера " + ram + " Гб");
	   System.out.println ("У Вас ноутбук " + pc);
	}
}