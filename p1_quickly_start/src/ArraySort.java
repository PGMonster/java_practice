package p1_quickly_start;

/*
* 数组排序
*   1. 冒泡排序
*       1.1 正序排序
*           - 最大值排在后面的方式
*           - 最小值排在前面的方式
*       1.2 倒序排序
*   2. 插入排序
*   3. 快速排序
* */

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
		System.out.println(Arrays.toString(ns));
		// 数组排序
//		Arrays.sort(ns);    // 内置方法
		int ns_length = ns.length;
		for (int i=0;i<ns_length-1;i++) {
			for (int j=0;j<ns_length-i-1;j++) {
				if (ns[j]<ns[j+1]) {
					int t = ns[j];
					ns[j] = ns[j+1];
					ns[j+1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(ns));

	}
}


