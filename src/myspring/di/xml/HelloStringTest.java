package myspring.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloStringTest {

	public static void main(String[] args) {
		
		// 빈 팩토리 bean 객체를 관리하는 것
		// 빈 팩토리를 확장한 컨테이너
		ApplicationContext ctx = new GenericXmlApplicationContext("config/beans.xml");
		// ctx에 config 폴더 안의 beans.xml 안에 있는 bean 객체들이 담긴다.
		
		Hello hey = (Hello)ctx.getBean("hello"); //beans.xml의 id가 hello인 bean을 의미
		System.out.println(hey.sayHello());
		
		hey.print();
		
		Printer printer = (Printer)ctx.getBean("printer");//"printer"가 bean에 있는 printer임
		System.out.println(printer.toString());
		
		//ApplicationContext는 객체를 한 번만 만든다.
		Hello hello = (Hello)ctx.getBean("hello");//따라서 변수가 달라도 getbean이 똑같으면 동일한 객체임
		
		System.out.println(hey==hello);
		
	}

}
