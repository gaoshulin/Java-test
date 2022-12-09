package test;

/**
 * Data class
 * 数据类型
 * @author Administrator
 */
public class Data{
	public static void main(String[] args) {
		// 整数类型
		byte  numberA = 10;
		short numberB = 20;
		int   numberC = 30;
		long  numberD = 40;
		long  sum 	  = numberA+numberB+numberC+numberD;
		System.out.println("10+20+30+40=" + sum);
		
		// 浮点类型
		float price1 = 19.9f; // float 类型必须以f结尾
		float price2 = (float) 19.99; // 强制转换类型
		double money = 99.99; // 
		System.out.println(price1+"-"+price2+"-"+money);
		
		// 布尔类型
		boolean isFalse = false;
		boolean isTrue  = true;
		System.out.println(isFalse);
		System.out.println(isTrue);
		
		// 字符类型
		char leeter = 'D';
		char munCar = '5';
		System.out.println(leeter);
		System.out.println(munCar);
		
		// 数据类型转换
		// 1、隐式转换-自动转换，由低到高
		float f1 = 10.1f;
		double f2 = 5.9;
		int num1 = 10;
		int num2 = 10;
		double res = f1*num1 + f2*num2;
		System.out.println(res);
		
		// 2、显示转换-强制转换
		double account = 13.2;
		int toInt = (int)account; // 自动去掉小数点后面字符
		System.out.println(toInt); 
		
	}
}