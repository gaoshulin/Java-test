package str;

/**
 * @title 字符串
 * @author Administrator
 */
public class StrClass {
	public static void main(String[] args) {
		// 1、直接定义字符串
		String str = "Hello World";
		String word = "北京\\上海\\广州";
		System.out.println(str);
		System.out.println(word);
		
		// 2、使用String类定义
		String str1 = new String("Hello");
		System.out.println(str1);
		
		// 3、String转换为int
		String str2 = "123";
		int num = 0;
		
		num = Integer.parseInt(str2); // Integer.parseInt(s)
		System.out.println(num);
		
		num = 0;
		num = Integer.valueOf(str2).intValue(); // Integer.valueOf(s).intValue()
		System.out.println(num);
		
		// 4、int转换为String
		int num2 = 100;
		String str3 = String.valueOf(num2); // String.valueOf(i)
		System.out.println(str3);
		
		String str4 = Integer.toString(num2); // Integer.toString(i)
		System.out.println(str4);
		
		// 5、字符串拼接
		String str5 = "hello";
		String str6 = "world";
		System.out.println(str5+" "+str6); // +号拼接
		
		// 使用concat拼接
		String info = "";
		info = info.concat(str5);
		info = info.concat(str6);
		info = info.concat("!!!");
		System.out.println(info);

	}
}