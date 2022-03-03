package myspring.di.xml;

public class HelloTest {
	//config폴더에 beans를 안 쓰고 해볼 것
	
	public static void main(String[] args) {
		Hello hey = new Hello();
		
		hey.setName("TestSpring");
		
		Printer printer = new StringPrinter();
		hey.setPrinter(printer);
		hey.print();
		
		
		System.out.println(printer.toString());
		
		
		
	}
	
}
