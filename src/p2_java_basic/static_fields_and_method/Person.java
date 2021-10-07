package p2_java_basic.static_fields_and_method;

public class Person {
	public String name;
	public int age;

	public static int count;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		count++;

	}

	public static int getCount() {
		return count;
	}
}