package number;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 时间日期操作
 * @author Administrator
 *
 */
public class DateClass {
	public static void main(String[] args) {
		// 1、Date 类
		Date date = new Date();
		System.out.println(date.toString()); // Wed Nov 30 20:01:16 CST 2022
		System.out.println(date.getTime()); // 毫秒级时间戳
		
		// 2、Calendar 类
		Calendar calendar = Calendar.getInstance(); // 如果不设置时间，则默认为当前时间
		calendar.setTime(new Date()); // 将系统当前时间赋值给 Calendar 对象
		System.out.println("现在时刻：" + calendar.getTime()); // 获取当前时间
		int year = calendar.get(Calendar.YEAR); // 获取当前年份
		System.out.println("现在是" + year + "年");
		int month = calendar.get(Calendar.MONTH) + 1; // 获取当前月份（月份从 0 开始，所以加 1）
		System.out.println(month + "月");
		int day = calendar.get(Calendar.DATE); // 获取日
		System.out.println(day + "日");
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1; // 获取今天星期几（以星期日为第一天）
		System.out.println("星期" + week);
		int hour = calendar.get(Calendar.HOUR_OF_DAY); // 获取当前小时数（24 小时制）
		System.out.println(hour + "时");
		int minute = calendar.get(Calendar.MINUTE); // 获取当前分钟
		System.out.println(minute + "分");
		int second = calendar.get(Calendar.SECOND); // 获取当前秒数
		System.out.println(second + "秒");
		int millisecond = calendar.get(Calendar.MILLISECOND); // 获取毫秒数
		System.out.println(millisecond + "毫秒");
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // 获取今天是本月第几天
		System.out.println("今天是本月的第 " + dayOfMonth + " 天");
		int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH); // 获取今天是本月第几周
		System.out.println("今天是本月第 " + dayOfWeekInMonth + " 周");
		int many = calendar.get(Calendar.DAY_OF_YEAR); // 获取今天是今年第几天
		System.out.println("今天是今年第 " + many + " 天");
		
		Calendar c = Calendar.getInstance();
		c.set(2022, 11, 30); // 设置年月日，时分秒将默认采用当前值
		System.out.println("设置日期为 2012-11-30 后的时间：" + c.getTime()); // 输出时间
		
		// 3、日期格式化
		// 获取不同格式化风格和中国环境的日期
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);

		// 获取不同格式化风格和中国环境的时间
		DateFormat df5 = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
		DateFormat df6 = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
		DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
		DateFormat df8 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);

		// 将不同格式化风格的日期格式化为日期字符串
		String date1 = df1.format(new Date());
		String date2 = df2.format(new Date());
		String date3 = df3.format(new Date());
		String date4 = df4.format(new Date());

		// 将不同格式化风格的时间格式化为时间字符串
		String time1 = df5.format(new Date());
		String time2 = df6.format(new Date());
		String time3 = df7.format(new Date());
		String time4 = df8.format(new Date());

		// 输出日期
		System.out.println("SHORT：" + date1 + " " + time1);
		System.out.println("FULL：" + date2 + " " + time2);
		System.out.println("MEDIUM：" + date3 + " " + time3);
		System.out.println("LONG：" + date4 + " " + time4);
		
		// 4、SimpleDateFormat 类
		Date now = new Date(); // 创建一个Date对象，获取当前时间
	    // 指定格式化格式
	    SimpleDateFormat f = new SimpleDateFormat("今天是 "+"yyyy年MM月dd日 E HH时mm分ss秒");
	    System.out.println(f.format(now)); // 将当前时间袼式化为指定的格式
	    
	}
}