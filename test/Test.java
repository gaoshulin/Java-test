package test;

/**
 * Test class
 * @author Administrator
 */
public class Test {
	public static void main(String[] args) {
        // 创建类的实例
		TestClass dc = new TestClass();
	       	
	    // 对象名.变量名调用实例变量（全局变量）
        System.out.println(dc.name);
        System.out.println(dc.age);
                
        // 类名.变量名调用静态变量（类变量）
        System.out.println(TestClass.website);
        System.out.println(TestClass.url);
	}
	
}