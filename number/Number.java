package number;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * 数字处理
 * @author Administrator
 */
public class Number {
	public static void main(String[] args) {
		// 1、Math类常用方法
		System.out.println("较大值："+ Math.max(10, 20)); // 20
		System.out.println("较小值："+ Math.min(10, 20)); // 10
		System.out.println("绝对值："+ Math.abs(-12)); // 12
		
		System.out.println("向上取整："+ Math.ceil(99.3)); // 100
		System.out.println("向下取整："+ Math.floor(99.3)); // 99
		
		System.out.println("返回最接近的整数："+ Math.round(99.3)); // 99
		System.out.println("返回最接近的整数："+ Math.round(99.7)); // 100
		
		System.out.println("返回最接近的整数："+ Math.rint(99.3)); // 99
		System.out.println("返回最接近的整数："+ Math.rint(99.7)); // 100
		
		System.out.println("4的立方值：" + Math.pow(4, 3)); // 64
	    System.out.println("16的平方根：" + Math.sqrt(16)); // 4
	    System.out.println("10为底2的对数：" + Math.log10(2));
	    
	    // 2、Random类生成随机数
	    Random rad 	= new Random();
	    double d1	= rad.nextDouble(); // 生成[0, 1]区间的小数
	    double d2	= rad.nextDouble()*7; // [0, 7]区间的小数
	    System.out.println("0-1区间的小数：" + d1);
	    System.out.println("0-7区间的小数：" + d2);
	    
	    int num1 = rad.nextInt(10); // [0, 10]区间的整数
	    int num2 = rad.nextInt(15)-3; // [-3, 12]区间的整数
	    System.out.println("0-10区间的整数：" + num1);
	    System.out.println("-3-12区间的整数：" + num2);
	    
	    long num3 = rad.nextLong(); // 生成一个长整数值
	    boolean num4 = rad.nextBoolean(); // 生成一个随机布尔值
	    float num5 = rad.nextFloat(); // 生成一个随机浮点型值
	    System.out.println("生成一个随机长整型值：" + num3);
        System.out.println("生成一个随机布尔型值：" + num4); // true/false
        System.out.println("生成一个随机浮点型值：" + num5);
	    
	    // 3、数字格式化
        float f = 5487.4569f;
        // 实例化DecimalFormat类的对象，并指定格式
        DecimalFormat df1 = new DecimalFormat("0.0");	
        DecimalFormat df2 = new DecimalFormat("#.#");	
        DecimalFormat df3 = new DecimalFormat("00.00");	
        DecimalFormat df4 = new DecimalFormat("##.##");	
        
        System.out.println("0.0 格式：" + df1.format(f));
        System.out.println("#.# 格式：" + df2.format(f));
        System.out.println("00.00 格式：" + df3.format(f));
        System.out.println("##.## 格式：" + df4.format(f));
        
        // 4、大数字运算 BigInteger()
        int number = 100;
        // 创建BigInteger对象
        BigInteger bi = new BigInteger(number+""); // String val
        
        System.out.println("加法操作结果："+bi.add(new BigInteger("99")));
        System.out.println("减法操作结果："+bi.subtract(new BigInteger("50")));
        System.out.println("乘法操作结果："+bi.multiply(new BigInteger("10")));
        System.out.println("除法操作结果："+bi.divide(new BigInteger("5")));
        System.out.println("取相反数操作结果：" + bi.negate()); // -100
        
        // 5、BigDecimal类
        // 创建BigDecimal对象
        BigDecimal bd = new BigDecimal(number);
       
        System.out.println("加法操作结果：" + bd.add(new BigDecimal(99.15)));
        System.out.println("减法操作结果：" + bd.subtract(new BigDecimal(-25.15)));
        System.out.println("乘法操作结果：" + bd.multiply(new BigDecimal(3.5)));
        System.out.println("除法操作结果(保留2 位小数)：" + bd.divide(new BigDecimal(3.14), 2, BigDecimal.ROUND_CEILING));
        
	}
}