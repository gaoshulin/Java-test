package object;

/**
 * 创建对象
 * @author Administrator
 */
public class ObjectClass {
	private String Name;    // 学生名字
    private int age;    // 学生年龄
    
    // 构造方法
    public ObjectClass(String name, int age) {
    	this.Name = name;
    	this.age = age;
    }
    
    public ObjectClass() {
        this.Name = "name";
        this.age = 0;
    }
    
    public String toString() {
        return"学生名字："+Name+"，年龄："+age;
    }
    
    // 获取信息的方法
    public void tell() {
        System.out.println("姓名：" + Name + "，年龄：" + age);
    }
    
    public static void main(String[] args) throws Exception {
         // 使用new关键字创建对象
    	 System.out.println("---------使用 new 关键字创建对象---------");
    	 ObjectClass class1 = new ObjectClass("小刘",22);
         System.out.println(class1);
         
         // 调用 java.lang.Class 的 newInstance() 方法创建对象
//         System.out.println("-----------调用 java.lang.Class 的 newInstance() 方法创建对象-----------");
//         Class<?> c1 = Class.forName("ObjectClass");
//		   ObjectClass class2 = (ObjectClass)c1.newInstance();
//         System.out.println(class2);
         
         // 调用对象的 clone() 方法创建对象
//         System.out.println("-------------------调用对象的 clone() 方法创建对象----------");
//         ObjectClass class3 = (ObjectClass)class2.clone();
//         System.out.println(class3);
         
         
         // 匿名对象
         new ObjectClass("张三", 30).tell();
         
    }
}