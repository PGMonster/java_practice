package p2_java_basic;

import p2_java_basic.static_fields_and_method.*;

public class Main {
	public static void main(String[]args){

		// todo: 静态字段和静态方法
		Person p1 = new Person("Ming",15);
		Person p2 = new Person("Hong",12);
		Person p3 = new Person("Dong",16);
		Person p4 = new Person("Hei",18);
		System.out.println(Person.getCount());
	}
}