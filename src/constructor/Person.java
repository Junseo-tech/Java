package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} //�ڹ� �����Ϸ��� �ڵ����� �����ϴ� ����Ʈ ������
	
	public Person(String pname) {
		name = pname; 
		/** ��� �̸��� �Ű������� �޾Ƽ� Person class�� �����ϴ� ������**/
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}

}
