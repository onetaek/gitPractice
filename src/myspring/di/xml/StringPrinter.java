package myspring.di.xml;

public class StringPrinter implements Printer {

	private String buffer = new String();
	@Override
	public void print(String sayHello) {
		// TODO Auto-generated method stub
		buffer += sayHello;//콘솔프린터랑은 다르게 buffer라는 속성에 매개변수를 더한다. 즉 문자열을 더연장한다.
	}

	public String toString() {
		return buffer;
	}
}
