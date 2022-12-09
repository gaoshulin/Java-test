package str;

/**
 * SreingBuffer 类型
 * @author Administrator
 */
public class StrBuffer {
	public static void main(String[] args) {
		// 1、 StringBuffer类
		// 定义一个空的字符串缓冲区，含有16个字符的容量(默认16个)
		StringBuffer str1 = new StringBuffer();
		// 定义一个含有10个字符容量的缓冲区
		StringBuffer str2 = new StringBuffer(10);
		// 定义一个含有(16+4)的字符串缓冲区，"青春无悔"为4个字符
		StringBuffer str3 = new StringBuffer("青春无悔");
		
		System.out.println(str1.capacity()); // 16
		System.out.println(str2.capacity()); // 10
		System.out.println(str3.capacity()); // 20
		
		// 2、追加字符串 append
		String str4 = "!!!";
		System.out.println(str3.append(str4));
		
		// 3、替换字符 setCharAt()
		StringBuffer str5 = new StringBuffer("hello");
		str5.setCharAt(1, 'E'); // setCharAt(int index, char ch);
		System.out.println(str5); // hEllo
		
		// 4、字符串翻转 reverse()
		str5.reverse();
		System.out.println(str5); // ollEh
		
		// 5、删除字符串 deleteCharAt()  delete()
		str5.deleteCharAt(1); // deleteCharAt(int index)
		System.out.println(str5); // olEh
		
		str5.delete(1, 3); // delete(int start, int end)
		System.out.println(str5); // oh  --包含start、不包含end
		
		
	}
	
}