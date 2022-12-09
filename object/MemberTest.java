package object;

import java.util.Scanner;

/**
 * @author: Galen
 * @description:用户类
 */
public class MemberTest {
    public static void main(String[] args) {
        Member admin = new Member("admin", "123456");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("请输入原密码：");

            String pwd = input.next();
            if (pwd.equals(admin.getPassword())) {
                System.out.println("请输入新密码");
                // 获取用户输入的新密码
                admin.setPassword(input.next());
            } else {
                System.out.println("输入的密码错误，无法进行修改！");
            }
        }

        System.out.println("----------------用户信息----------------\n"+admin);
    }
    
}
