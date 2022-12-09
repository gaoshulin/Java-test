package test;

import java.util.Scanner;

/**
 * 流程控制语句
 * @author Administrator
 */
public class Process {
	public static void main(String[] args) {
		 System.out.println("请输入一个数字：");
		 Scanner input = new Scanner(System.in);
		 int number = input.nextInt(); // 接收键盘输入数据
		 
		 // if else
		 if (number > 100) {
			 System.out.println("输入的数字大于100");
		 } else if (number == 10) {
			 System.out.println("输入的数字等于100");
		 } else {
			 System.out.println("输入的数字小于100");
		 }
		
		 // switch
		 switch (number) {
		 case 888:
			 System.out.println("恭喜你，获得了一等奖！");
			 break;
		 case 88:
		     System.out.println("恭喜你，获得了二等奖！");
		     break;
		 case 8:
		     System.out.println("恭喜你，获得了三等奖！");
		     break;
		 default:
		     System.out.println("谢谢参与！");
		     break;
		 }
		 
		 // while
		 int i = 1;
		 int n = 1;
		 while (i <= 10) {
			 n = n*i;
			 i++;
		 }
		 System.out.println("10的阶乘结果为："+n);
		 
		 // do while
		 int j = 1, res = 1;
		 do {
			 res *= j;
			 j++;
		 } while (j <= 10);
		 System.out.println("10的阶乘结果为："+res);
		 
		 // for
		 int sum = 0;
		 for (int k = 0; k <= 10; k++) {
			 sum += k;
		 }
		 System.out.println("10的加和结果为："+sum);
		 
		 // foreach
		 int[] numbers = {43, 32, 53, 54, 75};  // 声明并初始化数组
		 System.out.println("----foreach----");
		 // for-each语句
		 for (int item:numbers) {
		     System.out.println("item is:"+item);
		 }
		 
		 // break 使用 break 语句实现 goto 的功能（break 带标签）
		 label: for (int x = 0; x < 10; x++) {
	        for (int y = 0; y < 8; y++) {
	             System.out.println(y);
	              if (y % 2 != 0) {
	                 break label;
	                 
	               // continue label; // （continue 带标签）
	              }
	         }
	     }
		 
	}
	
}