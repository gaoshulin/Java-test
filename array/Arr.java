package array;

/**
 * 一維數組，二維數組
 * @author Administrator
 */
public class Arr {
	public static void main(String[] args) {
		// 1、一维数组
		int[] score = new int[10];  // 声明数组并分配空间
		System.out.println(score.length); // 10
		System.out.println(score[3]); // 0 默认值是0
		score[0] = 100; // 给数组元素赋值
		System.out.println(score[0]); // 100
		
		// 创建数组并设置元素的值
		int[] numbers = new int[] {1,3,5}; // 赋值不能设置长度
		System.out.println(numbers[0]); // 1
		System.out.println(numbers[1]); // 3
		System.out.println(numbers[2]); // 5
		
		// 声明数组并同步初始化
		String[] arrayName = {"later", "galen"};
		for (String name : arrayName) {
			System.out.println("元素的值依次是："+name);
		}
		
		// 2、二维数组
//		int[][] temp1 = new int[2][2]; // 声明二维数组
//		int[][] temp2 = new int[2][]; // 声明二维数组
//		int[][] temp3 = new int[][] {{1,2}, {3,4}}; // 声明二维数组并初始化
		double[][] class_score = { {99,90,88}, {98,99,90}, {93,100,97} };
		for (int i = 0; i < class_score.length; i++) { // 遍历行
	        for (int j = 0; j < class_score[i].length; j++) {
	            System.out.println("class_score["+i+"]["+j+"]="+class_score[i][j]);
	        }
	    }
		
		// 不规则数组
//		int intArray[][] = new int[4][]; // 先初始化高维数组为4
//	    // 逐一初始化低维数组
//	    intArray[0] = new int[2];
//	    intArray[1] = new int[1];
//	    intArray[2] = new int[3];
//	    intArray[3] = new int[3];
	        
		int intArray[][] = {{1,2}, {11}, {21,22,23}, {31,32,33}};
		// for循环遍历
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
	            System.out.println("intArray["+i+"]["+j+"]="+intArray[i][j]);
            }
        }
        
	}
	
}