package myspring.di.xml;

public class StringPrinter implements Printer {

	private String buffer = new String();
	@Override
	public void print(String sayHello) {
		// TODO Auto-generated method stub
		buffer += sayHello;//�ܼ������Ͷ��� �ٸ��� buffer��� �Ӽ��� �Ű������� ���Ѵ�. �� ���ڿ��� �������Ѵ�.
	}

	public String toString() {
		return buffer;
	}
}
