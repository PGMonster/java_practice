package p3_java_core_class.java_wrapper_class;


public class WrapperClassDemo {
	public static void wrapDemo() {
		int i = 100;
		Integer n1 = new Integer(10);   // new 操作符创建Integer 实例 （会出现编译警告）
		Integer n2 = Integer.valueOf(100);  // 通过静态方法 valueOf(int) 创建int 实例
		Integer n3 = Integer.valueOf("1000");   // 通过静态方法 valueOf(String) 创建int 实例

		System.out.println(n2.intValue());

	}
}
