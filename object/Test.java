package object;

/**
 * 形参和实参
 * @author Administrator
 */
public class Test {

	public int add(int x) {
		x += 30;
		System.out.println("形参 x 的值："+x); // 180
		
		return x;
	}
	
	
	public static void main(String[] args) {
		int x = 150;
		System.out.println("调用 add() 方法之前 x 的值："+x); // 150
		
		Test t = new Test();
		int i = t.add(x);
		
		// 形参 x 值的改变，并没有影响实参 x
		System.out.println("实参 x 的值："+x); // 150
		System.out.println("调用 add() 方法的返回值："+i); // 180
	
	}
	
}