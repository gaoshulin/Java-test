package object;

public class Student {
	public String Name; // 姓名
	public int Age; // 年龄
	private boolean Sex; // 性别
	
	public boolean isSex() {
		 return Sex; // 默认 false
	}
	
	
	public static void main(String[] args) {
		// 实例化类
		Student std = new Student();
		std.Name = "jerry";
		std.Age = 20;
		String isMan = std.isSex() ? "男" : "女";
		System.out.println("姓名："+std.Name+" 性别："+isMan+" 年龄："+std.Age);
		
		// 第二次实例化类
		Student std2 = new Student();
		std2.Name = "alice";
		std2.Age = 24;
		std2.Sex = true;
		String isWoman = std2.isSex() ? "女" : "男";
	    System.out.println("姓名："+std2.Name+" 性别："+isWoman+" 年龄："+std2.Age);
		
	}
}