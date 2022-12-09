package test;

/**
 * Operator class
 * java运算符
 * @author Administrator
 */
public class Operator {
	public static void main(String[] args) {
		// 1、一元运算符   -、++、--
		int a = 12;
		System.out.println(-a);
		int b = a++;
		System.out.println(b);
		b = ++a;
		System.out.println(b);
		
		
		// 2、二元运算符 + - * / %
	    float  f1 = 9 % 4;// 保存取余后浮点类型的结果
	    double da = 9 + 4.5; // 双精度加法
	    double db = 9 - 3.0; // 双精度减法
	    double dc = 9 * 2.5; // 双精度乘法
	    double dd = 9 / 3.0; // 双精度除法
	    double de = 9 % 4; // 双精度取余
	    // 整数的加、减、乘、除和取余
	    System.out.println("整数的算术运算");
	    System.out.printf("9+4=%d \n", 9 + 4);
	    System.out.printf("9-4=%d \n", 9 - 4);
	    System.out.printf("9*4=%d \n", 9 * 4);
	    System.out.printf("9/4=%d \n", 9 / 4);
	    System.out.printf("9%%4=%d \n", 9 % 4);
	    // 浮点数的加、减、乘、除和取余
	    System.out.println("\n浮点数的算术运算");
	    System.out.printf("9+4.5f=%f \n", 9 + 4.5f);
	    System.out.printf("9-3.0f=%f \n", 9 - 3.0f);
	    System.out.printf("9*2.5f=%f \n", 9 * 2.5f);
	    System.out.printf("9/3.0f=%f \n", 9 / 3.0f);
	    System.out.printf("9%%4=%f \n", f1);
	    // 双精度数的加、减、乘、除和取余
	    System.out.println("\n双精度数的算术运算");
	    System.out.printf("9+4.5=%4.16f \n", da);
	    System.out.printf("9-3.0=%4.16f \n", db);
	    System.out.printf("9*2.5=%4.16f \n", dc);
	    System.out.printf("9/3.0=%4.16f \n", dd);
	    System.out.printf("9%%4=%4.16f \n", de);
	    // 对字符的加法和减法
	    System.out.println("\n字符的算术运算");
	    System.out.printf("'A'+32=%d \n", 'A' + 32);
	    System.out.printf("'A'+32=%c \n", 'A' + 32);
	    System.out.printf("'a'-'B'=%d \n", 'a' - 'B');
	    
	    
	    // 3、算术赋值运算符 += -+ *= /= %=
	    int a1 = 1;
	    int b1 = 2;
	    a1 += b1; // 相当于 a1 = a1 + b1
	    System.out.println(a1);
	    a1 += b1 + 3; // 相当于 a1 = a1 + b1 + 3
	    System.out.println(a1);
	    a1 -= b1; // 相当于 a1 = a1 - b1
	    System.out.println(a1);
	    a1 *= b1; // 相当于 a1 = a1*b1
	    System.out.println(a1);
	    a1 /= b1; // 相当于 a1 = a1/b1
	    System.out.println(a1);
	    a1 %= b1; // 相当于 a1 = a1%b1
	    System.out.println(a1);
	    
	    
	    // 4、赋值运算符  += -+ *= /= %=
	    int x, y, z; // 定义3个整型的变量
	    x = y = z = 5; // 为变量赋初值为5
	    x += 10; // 等价于x=x+10，结果x=15
	    y -= 3; // 等价于y=y-3，结果y=2
	    z *= 5; // 等价于z=z*5，结果z=25
	    x /= 4; // 等价于x=x/4，结果x=3
	    z %= x; // 等价于z=z%x，结果z=1
	    System.out.printf("x=%d, y=%d, z=%d \n", x, y, z);
	    
	    
	    // 5、逻辑运算符 && || ! | &
	    System.out.println(2>1 && 3<4); // true
	    System.out.println(2<1 || 3>4); // false
	    System.out.println(1>2 | 3>5); // false
	    System.out.println(1<2 & 3<5); // true
	    System.out.println(!(2>4)); // true
	    
	    
	    // 6、关系运算符 > >= < <= == !=
//	    a > b    // 比较变量a的值是否大于变量b的值
//	    x+y >= z    // 比较变量x与变量y的和是否大于或等于变量z的值
//	    width * length != area    // 比较变量width*length的值是否与变量area的值不相等
//	    name == "tom"    // 比较变量name的值是否等于字符串tom
//	    pass != "123456"    // 比较变量pass的值是否不等于字符串“123456”
	    
	}
}