package myspring.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloStringTest {

	public static void main(String[] args) {
		
		// �� ���丮 bean ��ü�� �����ϴ� ��
		// �� ���丮�� Ȯ���� �����̳�
		ApplicationContext ctx = new GenericXmlApplicationContext("config/beans.xml");
		// ctx�� config ���� ���� beans.xml �ȿ� �ִ� bean ��ü���� ����.
		
		Hello hey = (Hello)ctx.getBean("hello"); //beans.xml�� id�� hello�� bean�� �ǹ�
		System.out.println(hey.sayHello());
		
		hey.print();
		
		Printer printer = (Printer)ctx.getBean("printer");//"printer"�� bean�� �ִ� printer��
		System.out.println(printer.toString());
		
		//ApplicationContext�� ��ü�� �� ���� �����.
		Hello hello = (Hello)ctx.getBean("hello");//���� ������ �޶� getbean�� �Ȱ����� ������ ��ü��
		
		System.out.println(hey==hello);
		
	}

}
