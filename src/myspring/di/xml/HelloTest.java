package myspring.di.xml;

public class HelloTest {
	//config������ beans�� �� ���� �غ� ��
	
	public static void main(String[] args) {
		Hello hey = new Hello();
		
		hey.setName("TestSpring");
		
		Printer printer = new StringPrinter();
		hey.setPrinter(printer);
		hey.print();
		
		
		System.out.println(printer.toString());
		
		
		
	}
	
}
