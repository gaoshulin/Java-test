package str;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 * @author Administrator
 */
public class StrRegex {
	public static void main(String[] args) {
		// 1、使用字符串模拟从网络上得到的网页源码
        String str = "我想找一套适合自己的JAVA教程，尽快联系我13500006666 "+
		"交朋友，电话号码是13611125565 出售二手电脑，联系方式15899903312";
        
        // 创建一个Pattern对象，并用它建立一个Matcher对象
        // 该正则表达式只抓取13X和15X段的手机号
        // 实际要抓取哪些电话号码，只要修改正则表达式即可
        Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
        // 将所有符合正则表达式的子串（电话号码）全部输出
        while (m.find()) {
            System.out.println(m.group());
        }
        
        // 2、验证邮箱
        String[] mails = {"kongyeeku@163.com","kongyeeku@gmail.com","ligang@crazyit.abc"};
        String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
        Pattern mailPattern = Pattern.compile(mailRegEx);
        Matcher matcher = null;
        for (String mail : mails) {
            if (matcher == null) {
                matcher = mailPattern.matcher(mail);
            } else {
                matcher.reset(mail);
            }
            String result = mail + (matcher.matches() ? "是" : "不是") + "一个有效的邮件地址！";
            System.out.println(result);
        }
        
        // 3、替换、分割
        String[] msgs = {
        	"Java has regular expressions in 1.4",
        	"regular expressions now expressing in Java",
        	"Java represses oracular expressions" 
        };
        for (String msg : msgs) {
        	System.out.println(msg.replaceFirst("re\\w*", "哈哈:)"));
        	System.out.println(Arrays.toString(msg.split(" ")));
        }
        
        // 4、正则验证电话号码（固定电话和手机号）
        String regex = "0\\d{2,3}[-]?\\d{7,8}|0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}";
        String phone = "027-6666666";
        Pattern p1 	 = Pattern.compile(regex);
        Matcher m1 	 = p1.matcher(phone);
        boolean bool = m1.matches();
        if (bool) {
        	System.out.println("电话号码格式正确。"); // 验证通过
        } else {
        	System.out.println("电话号码格式错误。"); // 验证不通过
        }
        
        // 5、正则验证IP
        String  reg	 = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"; 
        String  ip   = "192.169.1.1";
        Pattern p2 	 = Pattern.compile(reg);
        Matcher m2 	 = p2.matcher(ip);
        boolean bl2  = m2.matches();
        if (bl2) {
        	System.out.println("IP地址正确。"); // 验证通过
        } else {
        	System.out.println("IP地址错误。"); // 验证不通过
        }
        
	}
}