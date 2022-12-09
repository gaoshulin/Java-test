package array;

import java.util.Arrays;

/**
 * Arrays工具类
 * @author Administrator
 */
public class ArrClass {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,2,3,4};
		int[] arr3 = Arrays.copyOf(arr1, 4);
		
		// 1、数组比较
		System.out.println("数组是否相等："+Arrays.equals(arr1, arr2)); // true
		System.out.println("数组是否相等："+Arrays.equals(arr1, arr3)); // true
		System.out.println("arr3数组的元素："+Arrays.toString(arr3)); // [1,2,3,4]
		
		// 2、对数组进行排序
		int[] arr4 = {3,2,5,1};
		Arrays.sort(arr4);
        System.out.println("arr4数组排序："+Arrays.toString(arr4)); // [1,2,3,5]
		
        // 3、数组填充
        int[] arr5 = new int[4];
        for (int i = 0; i < arr5.length; i++) {
            Arrays.fill(arr5, i);
            System.out.println("arr5[" + i + "]=" + i);
        }
        
        // 4、数组查找指定元素
        double[] score = { 99.5, 100, 98, 97.5, 100, 95, 85.5 };
        Arrays.sort(score); // 必须对数据进行排序
        System.out.println("score数组排序："+Arrays.toString(score)); // [85.5, 95.0, 97.5, 98.0, 99.5, 100.0, 100.0]
        System.out.println("查找100的位置是："+Arrays.binarySearch(score, 100)); // 5
        System.out.println("查找100的位置是："+Arrays.binarySearch(score, 2,6,100)); // 5
        System.out.println("查找到60的位置是："+Arrays.binarySearch(score, 60)); // -1 未匹配到
        
        // 5、数组复制
        int[] num1 = {1,2,3,4};
        int[] num2 = Arrays.copyOf(num1, 5); // copyOf(int[] original, int newLength)
        int[] num3 = Arrays.copyOf(num1, 3); // copyOf(int[] original, int newLength)
        System.out.println(Arrays.toString(num2)); // [1,2,3,4,0] // 大于length,用0填充
        System.out.println(Arrays.toString(num3)); // [1,2,3] // 小于length 截取
        
        // Arrays.copyOfRange(int[] original, int from, int to)
        int[] num4= Arrays.copyOfRange(num1, 0, 3);
        System.out.println(Arrays.toString(num4)); // [1,2,3]
        
        // 复制数组，将Object类型强制转换为int[]类型
        int[] num5 = (int[])num1.clone();
        System.out.println(Arrays.toString(num5)); // [1,2,3,4]
        
	}
}