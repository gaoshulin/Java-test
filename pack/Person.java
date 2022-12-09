package pack;

/**
 * Object类
 * @author Administrator
 *
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "姓名：" + this.name + "：年龄" + this.age;
    }

    public static void printClassInfo(Object obj) {
        // 获取类名
        System.out.println("类名：" + obj.getClass().getName());
        // 获取父类名
        System.out.println("父类：" + obj.getClass().getSuperclass().getName());
        System.out.println("实现的接口有：");
        // 获取实现的接口并输出
        for (int i = 0; i < obj.getClass().getInterfaces().length; i++) {
            System.out.println(obj.getClass().getInterfaces()[i]);
        }
    }
    
   
    public static void main(String[] args) {
        Person per = new Person("C语言中文网", 30);// 实例化Person对象
        System.out.println("对象信息：" + per);// 打印对象调用toString()方法
        
        // getClass() 方法
        String strObj = new String();
        printClassInfo(strObj);
        
        int num = 40;
        String str = Integer.toString(num); // 将数字转换成字符串
        String str1 = Integer.toBinaryString(num); // 将数字转换成二进制
        String str2 = Integer.toHexString(num); // 将数字转换成八进制
        String str3 = Integer.toOctalString(num); // 将数字转换成十六进制
        System.out.println(str + "的二进制数是：" + str1);
        System.out.println(str + "的八进制数是：" + str3);
        System.out.println(str + "的十进制数是：" + str);
        System.out.println(str + "的十六进制数是：" + str2);
    }
    
    
    
}