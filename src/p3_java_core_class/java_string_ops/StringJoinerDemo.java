package p3_java_core_class.java_string_ops;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public String buildSelectSql(String table, String[] fields) {
		StringJoiner sj = new StringJoiner(", ", "SELECT ", String.format(" FROM %s", table));
		for (String f: fields) {
			sj.add(f);
		}
		return sj.toString();
	}
}
