package pack;

/**
 * 内置包装类
 * @author Administrator
 */
public class PackageClass {
	public static void main(String[] args) {
		// 1、实现 int 和 Integer 的相互转换
		int m = 100;
		Integer obj = new Integer(m); // 手动装箱
		int n = obj.intValue(); // 手动拆箱
		System.out.println(n);
		
		// 2、 将字符串转换为数值类型
		String str1 = "30";
	    String str2 = "30.3";
	    // 将字符串变为int型
	    int x = Integer.parseInt(str1);
	    // 将字符串变为float型
	    float f = Float.parseFloat(str2);
	    System.out.println("x = " + x + "；f = " + f);
		
	    // 3、将整数转换为字符串
        String s = Integer.toString(m);
        System.out.println("s = " + s);
        
	}
}