package str;

/**
 * 字符串操作
 * @author Administrator
 */
public class StrOperate {
	public static void main(String[] args) {
		// 1、计算字符串长度 length()
		String str1 = "hello";
		String name = "张三";
		System.out.println("str lenght:"+str1.length()); // 5
		System.out.println("name lenght:"+name.length()); // 2
		
		// 2、大小写转换
		String str2 = "AbcdefG";
		System.out.println(str2.toLowerCase()); // 小写 abcdefg
		System.out.println(str2.toUpperCase()); // 大写 ABCDEFG
		
		// 3、去除字符串首尾空格 trim()
		String str3 = " hahaha ";
		System.out.println(str3.length());
		System.out.println(str3.trim());
		
		// 4、截取字符串
		String str4 = "string";
		System.out.println(str4.substring(3)); // ing
		System.out.println(str4.substring(0, 3)); // str
		
		// 5、分割字符串
		String Colors = "Red,Black,White,Yellow,Blue";
		String[] arr1 = Colors.split(","); // // 不限制元素个数
		String[] arr2 = Colors.split(",", 3); // 限制元素为3个
		System.out.println("所有颜色为：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("前三个颜色为：");
		for (int j = 0; j < arr2.length; j++) {
		    System.out.println(arr2[j]);
		}
		
		// 6、字符串替换
		String words = "hello java,hello php";
		System.out.println(words.replace("l", "d"));
		System.out.println(words.replace("hello", "你好"));
		
		// replaceFirst() 方法 匹配第一个字符串并替换
		System.out.println(words.replaceFirst("hello", "你好"));
		// replaceAll() 方法	匹配替换所有匹配到的字符串
		System.out.println(words.replaceAll("hello", "你好"));
		
		// 7、字符串比较 equals() equalsIgnoreCase()
		String str5 = "abc";
		String str6 = new String("abc");
		String str7 = "ABC";
		System.out.println(str5.equals(str6)); // true
		System.out.println(str5.equals(str7)); // false
		System.out.println(str5.equalsIgnoreCase(str7)); // true
		
		// equals()与==的比较
		String s1 = "hello";
		String s2 = new String(s1);
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // false
		
		// 8、字符串查找
		String str8 = "hello java";
		System.out.println(str8.indexOf("j")); // 6 indexOf，匹配的索引位置
		System.out.println(str8.indexOf("a", 8)); // 9 匹配的起始索引
		System.out.println(str8.indexOf("x")); // -1 匹配不到，返回-1
		
		System.out.println(str8.lastIndexOf("a")); // 9 最后一次匹配到的位置
		System.out.println(str8.charAt(1)); // e  根据索引查询字符串
		
	}
	
}