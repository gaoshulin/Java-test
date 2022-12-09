package array;

import java.util.Arrays;
import java.util.Collections;

/**
 * 数组排序操作
 * @author Administrator
 */
public class SortClass {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,3,2,5,4};
		Arrays.sort(numbers); // 升序
		System.out.println("升序排序："+Arrays.toString(numbers));
		
		// 冒泡排序
		int[] arrays = {10, 59, 40, 22, 38, 42};
		for (int i = 0; i < arrays.length; i++) {
			for (int j = i+1; j < arrays.length; j++) {
				 if (arrays[i] > arrays[j]) {
					 int temp = arrays[i];
		             arrays[i] = arrays[j];
		             arrays[j] = temp;
		         }
			}
		}
		System.out.println("排序后的数组："+Arrays.toString(arrays));
		
		// 选择排序
		int[] arrays2 = {13,15,24,99,4,1};
		String end = "\n";
		int index;
		for (int i = 1;i < arrays2.length;i++) {
		    index = 0;
		    for(int j = 1;j <= arrays2.length-i;j++) {
		        if (arrays2[j] > arrays2[index]) {
		            index = j;    // 查找最大值
		        }
		    }
		    end = arrays2[index] + " " + end;    // 定位已排好的数组元素
		    int temp = arrays2[arrays2.length-i];
		    arrays2[arrays2.length-1] = arrays2[index];
		    arrays2[index] = temp;
		    System.out.print("【");
		    for (int j = 0;j < arrays2.length-i;j++) {
		        System.out.print(arrays2[j]+" ");
		    }
		    System.out.print("】"+end);
		}
		
		// 快速排序
		int[] arrays3 = {13,15,24,99,14,11};
        unckSort(arrays3, 0, arrays3.length-1);
        System.out.println("排序后的数组："+Arrays.toString(arrays3));
	}
	
	public static void unckSort(int[] list,int low,int high) {
	    if(low < high) {
	        int middle = getMiddle(list,low,high);    // 将list数组一分为二
	        unckSort(list,low,middle-1);    // 对低字表进行递归排序
	        unckSort(list,middle+1,high);    // 对高字表进行递归排序
	    }
	}
	
	public static int getMiddle(int[] list, int low, int high) {
	    int tmp = list[low]; // 数组的第一个值作为中轴（分界点或关键数据）
	    while (low < high) {
	        while (low < high && list[high] > tmp) {
	            high--;
	        }
	        list[low] = list[high]; // 比中轴小的记录移到低端
	        while (low < high && list[low] < tmp) {
	            low++;
	        }
	        list[high] = list[low]; // 比中轴大的记录移到高端
	    }
	    list[low] = tmp; // 中轴记录到尾
	    return low; // 返回中轴的位置
	}
	
}