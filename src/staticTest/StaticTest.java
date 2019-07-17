package staticTest;

public class StaticTest {

	/**
	 * static 块只会加载一次
	 */
	static {
		int a = 1;
		System.out.println(a);
	}

	/**
	 * static 全局性探索失败
	 */
	public static int b = 1;
	public static void main(String[] args){
		StaticTest t1 = new StaticTest();
		System.out.println(t1.b+1);
		StaticTest t2 = new StaticTest();
		System.out.println(t2.b+1);
		StaticTest t3 =new StaticTest();
		System.out.println(t3.b+1);
	}
}
