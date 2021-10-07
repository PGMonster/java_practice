package p3_java_core_class.java_string_ops;

public class StringBuilderDemo {
	public StringBuilder sb = new StringBuilder(1024);

	public String buildInsertSql(String table, String[] fields) {
		this.sb.append("INSERT INTO ")
				.append(table + " (")
				.append(fields[0])
				.append(", " + fields[1])
				.append(", " +fields[2] + ") ")
				.append("VALUES (?, ?, ?)");

		return this.sb.toString();
	}
}
