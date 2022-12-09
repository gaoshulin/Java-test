package object;

/**
 * @author: Galen
 * @description: 静态方法
 */
public class StaticClass {
    public static String str1 = "Hello";
    public static void main(String[] args) {
        String str2 = "World";

        // 直接访问 str1
        String accessVar1 = str1 + str2;
        System.out.println(accessVar1);
    }
}
