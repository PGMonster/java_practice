package p3_java_core_class;

import p3_java_core_class.java_string_ops.*;

public class Main {
	public static void main(String[] args) {

//		stringBuildDemo();  // stringBuildDemo

		stringJoinerDemo(); // stringJoinerDemo
	}

	// todo: 请使用StringBuilder构造一个INSERT语句
	static void stringBuildDemo() {
		StringBuilderDemo sbd = new StringBuilderDemo();
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = sbd.buildInsertSql(table, fields);
		System.out.println(insert);
		String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
		System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
	}

	//todo: 使用StringJoiner构造一个SELECT语句
	static void stringJoinerDemo() {
		StringJoinerDemo sjd = new StringJoinerDemo();
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String select = sjd.buildSelectSql(table, fields);
		System.out.println(select);
		System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
	}
}
