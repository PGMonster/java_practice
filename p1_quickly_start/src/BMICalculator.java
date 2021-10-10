package p1_quickly_start;

import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to use BMI Calculator ！！！");    // 打印提示
		int c1 = 1;
//		char c2 = 'N';
		while (c1 == 1) {
			System.out.print("Input your weight(kg): ");  //打印提示
			float weight = scanner.nextFloat();   // 读取一行输入并获取浮点数
			System.out.print("Input your height(m): ");
			float height = scanner.nextFloat();

			// 计算BMI值
			float bmi = weight / (height * height);
			String res;

			// 判断结果
			if (bmi < 18.5) {
				res = "过轻";
			} else if (bmi < 25) {
				res = "正常";
			} else if (bmi < 28) {
				res = "过重";
			} else if (bmi < 32) {
				res = "肥胖";
			} else {
				res = "过于肥胖";
			}

			System.out.println("Check out your report!");
			System.out.printf("Weight\t:\t%.1f(kg)\n", weight);
			System.out.printf("Height\t:\t%.2f(m)\n", height);
			System.out.printf("BMI   \t:\t%.1f\n", bmi);
			System.out.printf("Results\t:\t%s\n", res);
			System.out.println();
			System.out.print("是否继续查询?");
			String button = scanner.nextLine();
			switch (button) {
				case "Y":
				case "Yes":
				case "yes":
				case "y":
				default:
					c1 = 1;
					break;
				case "N":
				case "n":
				case "No":
				case "no":
					c1 = 0;
					break;

			}

		}


	}
}
