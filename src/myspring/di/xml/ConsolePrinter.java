package myspring.di.xml;

public class ConsolePrinter implements Printer {

	@Override
	public void print(String sayHello) {
		// TODO Auto-generated method stub
		System.out.println("In ConsolePrinter"+sayHello);
	}

}
